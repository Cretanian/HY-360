package JavaFiles;

import AllowanceClasses.*;
import EmployeeClasses.*;
import EmployeeClasses.Employee.Role;
import SalaryClasses.Salary;
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;
//import org.apache.commons.lang3.StringUtils;
 
public class DB_Controller
{
    static Connection myConnection;
    static Helper helper = new Helper();
    static Date date = new Date();
    
    //------------------------------------------------------------------------------------------------------------------------
        
   
    static public void hireEmployee(Employee employee) throws SQLException
    {
        date.day = 1;
        if(date.day == 1)
        {
            if(employee instanceof Contracted_Employee)
            {
                helper.Insert_Contracted(myConnection, ((Contracted_Employee)employee));

                helper.Insert_Salary(myConnection, employee.salary);
                helper.get_my_Salary_ID_FOR_INSERT(myConnection, employee.salary);

                if(employee.role == Employee.Role.EDUCATIVE)
                   helper.get_max_library_allowance_ID(myConnection, employee.library_allowance);
            }
            else if(employee instanceof Permanent_Employee)
            {
                helper.Insert_Permanent(myConnection, ((Permanent_Employee)employee));

                if(employee.role == Employee.Role.ADMINISTRATIVE)
                {
                    employee.salary.salary_id = 1;
                }
                else if(employee.role == Employee.Role.EDUCATIVE)
                {
                    employee.salary.salary_id = 2;
                    helper.get_max_research_allowance_ID( myConnection,employee.research_allowance);
                }
            } 

            helper.Insert_Children(myConnection, employee);

            if(!"0".equals(employee.childrens_age) || employee.married == 1)
            {
                helper.Insert_Family_Allowance(myConnection, employee, employee.family_allowance);
                helper.get_family_allowance_ID_FOR_INSERT(myConnection,employee.family_allowance);
            }
           
            helper.Insert_Takes_Salary(myConnection, employee, employee.salary);            
            helper.Insert_Takes_Allowance(myConnection, employee);
            return;
        }
        
        view_Controller.error();
    }
    
    static public void fireEmployee(Permanent_Employee employee)  
    {
       Statement stmt;
       ResultSet rs;
       String cmd;
       try {
           date.day = 30;
            if(date.day == 30)
            {
                stmt = myConnection.createStatement();

                cmd = "SELECT * FROM employee"
                        + " WHERE iban = "
                        + "'" + employee.iban + "'"
                        ;

                rs = stmt.executeQuery(cmd);

                if(rs.next())
                {
                    employee.id = rs.getInt("Employee_ID");
                    employee.working = rs.getInt("working");

                    if(  employee.working == 1 && 
                        (helper.Is_Permanant_Educative(myConnection, employee.id) ||
                         helper.Is_Permanant_Administrative(myConnection, employee.id))
                      )
                    {
                        cmd = "SELECT Salary_ID FROM takes_salary"
                                + " WHERE Employee_ID = "
                                + "'" + employee.id + "'"
                                ;

                        rs = stmt.executeQuery(cmd); rs.next();
                        employee.salary.salary_id = rs.getInt("Salary_ID");

                        cmd = "SELECT amount FROM basic_salary"
                                + " WHERE Salary_ID = "
                                + "'" + employee.salary.salary_id  + "'"
                                ;

                        rs = stmt.executeQuery(cmd); rs.next();
                        employee.salary.amount = rs.getInt("amount");

                        cmd = "SELECT * FROM takes_allowance"
                                + " WHERE Employee_ID = "
                                + "'" + employee.id  + "'"
                                ;

                        rs = stmt.executeQuery(cmd);

                        if(rs.next())
                        {
                            employee.family_allowance.id = rs.getInt("Family_Allowance_ID");
                            employee.research_allowance.id = rs.getInt("Research_Allowance_ID");
                            employee.library_allowance.id = rs.getInt("Library_Allowance_ID");

                            cmd = "SELECT bonus FROM research_allowance"
                                    + " WHERE Allowance_ID = "
                                    + "'" + employee.research_allowance.id  + "'"
                                    ;
                            rs = stmt.executeQuery(cmd);
                            if(rs.next())
                                employee.research_allowance.bonus_money = rs.getInt("bonus");

                            cmd = "SELECT bonus FROM library_allowance"
                                    + " WHERE Allowance_ID = "
                                    + "'" + employee.library_allowance.id  + "'"
                                    ;
                            rs = stmt.executeQuery(cmd);
                            if(rs.next())
                                employee.library_allowance.bonus_money = rs.getInt("bonus");

                            cmd = "SELECT percent FROM family_allowance"
                                    + " WHERE Allowance_ID = "
                                    + "'" + employee.family_allowance.id  + "'"
                                    ;
                            rs = stmt.executeQuery(cmd);
                            if(rs.next())
                                employee.family_allowance.percent = rs.getInt("percent");      
                        }

                        helper.Insert_Takes_Payment(myConnection, employee);
                        cmd = "UPDATE employee SET working = 0 WHERE Employee_ID = "
                                + employee.id;
                        helper.Run_SQL_Command(cmd, myConnection);    
                        
                        return;
                    }
                }
            }
            view_Controller.error();
            
       }
       catch(SQLException ex)
        {
            view_Controller.error();
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
    }
    
    static public void new_contract(Contracted_Employee employee) 
    {
       Statement stmt;
       ResultSet rs;
       String cmd;
       try {
           stmt = myConnection.createStatement();
           date.day = 1;
            if(date.day == 1)
            {
                System.out.println("employee.iban: " + employee.iban);
                
                cmd = "SELECT * FROM employee"
                        + " WHERE iban = "
                        + "'" + employee.iban + "'"
                        ;

                rs = stmt.executeQuery(cmd);

                if(rs.next())
                {
                    System.out.println("rs next.");
                    employee.id = rs.getInt("Employee_ID");
                    employee.working = rs.getInt("working");
                    
                    if(  employee.working == 1 && 
                        (helper.Is_Contractes_Administrative(myConnection, employee.id) ||
                         helper.Is_Contractes_Educative(myConnection, employee.id))
                      )
                    {
                        helper.Insert_Salary(myConnection, employee.salary);
                        helper.get_my_Salary_ID_FOR_INSERT(myConnection, employee.salary);
                        helper.Update_My_Salary(myConnection, employee);
                    }
                    
                    return;
                }
            }    
            view_Controller.error();
       }
       catch(SQLException ex)
       {
            view_Controller.error();
            System.out.println("\n Fire Employee Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
       }
    }
    
    static void changeSalarry(Salary salary, int flag)
    {
       String cmd;
       Statement stmt;
       ResultSet rs;
       try 
       {
            stmt = myConnection.createStatement();

            if(flag == 1)
            {
                cmd = "SELECT MAX(amount) FROM basic_salary "
                    + "INNER JOIN takes_salary ON basic_salary.Salary_ID = takes_salary.Salary_ID "
                    + "INNER JOIN permanent_administrative ON permanent_administrative.Employee_ID = takes_salary.Employee_ID";
                rs = stmt.executeQuery(cmd);
                if(rs.next())
                {
                    if(rs.getInt("MAX(amount)") < salary.amount){
                        helper.Insert_Salary(myConnection, salary);
                        helper.get_my_Salary_ID_FOR_INSERT(myConnection, salary);
                        
                        cmd = "UPDATE takes_salary " 
                        + "INNER JOIN "
                        + "permanent_administrative ON permanent_administrative.Employee_ID = takes_salary.Employee_ID "
                        + "SET "
                        + "Salary_ID = "
                        + salary.salary_id + ", "
                        + "month = "
                        + date.month + ", "
                        + "year = "
                        + date.year;
                        
                        helper.Run_SQL_Command(cmd, myConnection);
                    }
                    else
                        view_Controller.error();
                }
                return;
            }
            else if(flag == 2)
            {
                cmd = "SELECT MAX(amount) FROM basic_salary "
                    + "INNER JOIN takes_salary ON basic_salary.Salary_ID = takes_salary.Salary_ID "
                    + "INNER JOIN permanent_educative ON permanent_educative.Employee_ID = takes_salary.Employee_ID";
                rs = stmt.executeQuery(cmd);
                if(rs.next())
                {
                    if(rs.getInt("MAX(amount)") < salary.amount)
                    {
                        helper.Insert_Salary(myConnection, salary);
                        helper.get_my_Salary_ID_FOR_INSERT(myConnection, salary);
                        
                        cmd = "UPDATE takes_salary " 
                        + "INNER JOIN "
                        + "permanent_educative ON permanent_educative.Employee_ID = takes_salary.Employee_ID "
                        + "SET "
                        + "Salary_ID = "
                        + salary.salary_id + ","
                        + "month = "
                        + date.month + ","
                        + "year = "
                        + date.year;
                        helper.Run_SQL_Command(cmd, myConnection);
                    }
                    else
                        view_Controller.error();
                }
                return;
            }
            assert(false);
       }
       catch(SQLException ex)
       {
            System.out.println("\n changeSalary Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
    }
    
    static void changeAllowance(Allowance allowance)
    {
       String cmd;
       Statement stmt;
       ResultSet rs;
       try 
       {
            stmt = myConnection.createStatement();
            if(allowance instanceof Research_Allowance)
            {
                cmd = "SELECT MAX(bonus) FROM research_allowance "
                    + "INNER JOIN takes_allowance ON research_allowance.Allowance_ID = takes_allowance.Research_Allowance_ID "
                    + "INNER JOIN permanent_educative ON permanent_educative.Employee_ID = takes_allowance.Employee_ID";
                rs = stmt.executeQuery(cmd);
                if(rs.next())
                {
                    if(rs.getInt("MAX(bonus)") < ((Research_Allowance) allowance).bonus_money){
                        helper.Insert_Research_Allowance(myConnection, (Research_Allowance)allowance);
                        helper.get_max_research_allowance_ID(myConnection, (Research_Allowance)allowance);

                        cmd = "UPDATE takes_allowance " 
                        + " INNER JOIN "
                        + "permanent_educative ON permanent_educative.Employee_ID = takes_allowance.Employee_ID "
                        + "SET "
                        + "Research_Allowance_ID = "
                        + ((Research_Allowance) allowance).id + ", "
                        + "month = "
                        + date.month + ", "
                        + "year = "
                        + date.year;

                        helper.Run_SQL_Command(cmd, myConnection);
                    }
                    else
                        view_Controller.error();
                }
                return;
            }
            else if(allowance instanceof Library_Allowance)
            {
                cmd = "SELECT MAX(bonus) FROM library_allowance "
                    + "INNER JOIN takes_allowance ON library_allowance.Allowance_ID = takes_allowance.Library_Allowance_ID "
                    + "INNER JOIN contracted_educative ON contracted_educative.Employee_ID = takes_allowance.Employee_ID";
                rs = stmt.executeQuery(cmd);
                if(rs.next())
                {
                    if(rs.getInt("MAX(bonus)") < ((Library_Allowance) allowance).bonus_money)
                    {
                        helper.Insert_Library_Allowance(myConnection, (Library_Allowance)allowance);
                        helper.get_max_library_allowance_ID(myConnection, (Library_Allowance)allowance);
                        cmd = "UPDATE takes_allowance " 
                        + " INNER JOIN "
                        + "contracted_educative ON contracted_educative.Employee_ID = takes_allowance.Employee_ID "
                        + "SET "
                        + "Library_Allowance_ID = "
                        + ((Library_Allowance) allowance).id + ", "
                        + "month = "
                        + date.month + ", "
                        + "year = "
                        + date.year;
                        helper.Run_SQL_Command(cmd, myConnection);
                    }
                    else 
                        view_Controller.error();
                }
                return;
            }
            assert(false);
       }
       catch(SQLException ex)
       {
            System.out.println("\n changeAllowance Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
    } 
    
    static void promoteEmployee(Employee employee) 
    {
        Statement stmt;
        ResultSet rs;
        String cmd;
        int new_salary_id = -1;
        date.day = 1;
        if(employee instanceof Contracted_Employee && date.day == 1)
        {
            try 
            {
                stmt = myConnection.createStatement();

                cmd = "SELECT * FROM employee"
                        + " WHERE iban = "
                        + "'" + employee.iban + "'"      
                        ;
                rs = stmt.executeQuery(cmd);

                if(rs.next())
                {
                    employee.id = rs.getInt("Employee_ID");
                    employee.working = rs.getInt("working");

                    if(employee.working == 1)
                    {
                        if(helper.Is_Contractes_Administrative(myConnection, employee.id))
                        {
                            cmd = "DELETE FROM contracted_administrative WHERE Employee_ID ="
                                    + employee.id;
                            helper.Run_SQL_Command(cmd, myConnection);
                            
                            cmd = "SELECT MAX(basic_salary.Salary_ID) FROM basic_salary "
                                    + "INNER JOIN takes_salary ON basic_salary.Salary_ID = takes_salary.Salary_ID "
                                    + "INNER JOIN permanent_administrative ON permanent_administrative.Employee_ID = takes_salary.Employee_ID";
                                rs = stmt.executeQuery(cmd);
                                if(rs.next())
                                    new_salary_id = rs.getInt("MAX(basic_salary.Salary_ID)");
                            
                            cmd = "INSERT INTO permanent_administrative(Employee_ID) VALUES("
                                    + employee.id
                                    +")";
                            helper.Run_SQL_Command(cmd, myConnection);
                            
                            cmd = "UPDATE takes_salary SET "
                                    + "Salary_ID = "
                                    + new_salary_id + ", "
                                    + "month = "
                                    + date.month + ", "
                                    + "year = "
                                    + date.year
                                    + " WHERE Employee_ID = "
                                    + employee.id;
                            helper.Run_SQL_Command(cmd, myConnection);
                        }
                        else if(helper.Is_Contractes_Educative(myConnection, employee.id))
                        {
                            cmd = "DELETE FROM contracted_educative WHERE Employee_ID ="
                                    + employee.id;
                            helper.Run_SQL_Command(cmd, myConnection);
                            
                            cmd = "SELECT MAX(basic_salary.Salary_ID) FROM basic_salary "
                                    + "INNER JOIN takes_salary ON basic_salary.Salary_ID = takes_salary.Salary_ID "
                                    + "INNER JOIN permanent_educative ON permanent_educative.Employee_ID = takes_salary.Employee_ID";
                                rs = stmt.executeQuery(cmd);
                                if(rs.next())
                                    new_salary_id = rs.getInt("MAX(basic_salary.Salary_ID)");
                                else
                                    assert(false);
                            
                            cmd = "INSERT INTO permanent_educative(Employee_ID) VALUES("
                                    + employee.id
                                    +")";
                            helper.Run_SQL_Command(cmd, myConnection);
                            
                            cmd = "UPDATE takes_salary SET "
                                    + "Salary_ID = "
                                    + new_salary_id + ", "
                                    + "month = "
                                    + date.month + ", "
                                    + "year = "
                                    + date.year
                                    + " WHERE Employee_ID = "
                                    + employee.id;
                            helper.Run_SQL_Command(cmd, myConnection);
                        }
                        
                        cmd = "UPDATE employee SET "
                            + "start_month = "
                            + date.month + ", "
                            + "start_year = "
                            + date.year
                            + " WHERE Employee_ID = "
                            + employee.id     
                            ;
                        helper.Run_SQL_Command(cmd, myConnection);
                    }
                }
                else
                    view_Controller.error();
                
                return;
            }
            catch(SQLException ex)
            {
                view_Controller.error();
                System.out.println("\n promoteEmployee Exception ");
                while (ex != null)
                {
                    System.out.println("Message: " + ex.getMessage());
                    System.out.println("SQLState: " + ex.getSQLState());
                    System.out.println("ErrorCode: " + ex.getErrorCode());
                    ex = ex.getNextException();
                }
            }
        }
        else
            view_Controller.error();
    } 
    
    static void pay_them()
    { 
        Statement stmt;
        ResultSet rs;
        String cmd;
        date.day = 1;
        if(date.day == 1)
        {
            try{
                stmt = myConnection.createStatement();
       
                cmd = "SELECT DISTINCT MAX(p.month) AS month "
                        + "FROM payments p "
                        + "WHERE p.year = " + date.year + "";
                System.out.println("command: " + cmd);
                rs = stmt.executeQuery(cmd);
                if(rs.next()) // That means nobody has gotten paied.
                {
                    if(rs.getInt("month") == date.month){
                        view_Controller.error();
                        return;
                    }
                }
            }
            catch(Exception e){
                System.out.println("Exception in PAY_ONCE: " + e);
            }
            
            
            try 
            {                
                stmt = myConnection.createStatement();
       
                cmd = "INSERT INTO payments "
                        + "(Employee_ID,Salary_ID,Family_Allowance_ID,Research_Allowance_ID,Library_Allowance_ID,month,year,total_amount)"
                        + " SELECT "
                        + "emp.Employee_ID,sal.Salary_ID,allow.Family_Allowance_ID,allow.Research_Allowance_ID,allow.Library_Allowance_ID,"
                        + date.month + "," + date.year + "," + 0
                        + " FROM ((employee emp"
                        + " INNER JOIN takes_salary sal ON emp.Employee_ID = sal.Employee_ID AND emp.working=1)"
                        + " INNER JOIN takes_allowance allow ON emp.Employee_ID = allow.Employee_ID AND emp.working=1);";
                helper.Run_SQL_Command(cmd, myConnection);
               
                cmd = "SELECT "
                        + "employee.Employee_ID,employee.start_month,employee.start_year,basic_salary.amount,family_allowance.percent,library_allowance.bonus,research_allowance.bonus AS bonus2 "
                        + "FROM payments "
                        + "INNER JOIN employee ON employee.Employee_ID = payments.Employee_ID "
                        + "INNER JOIN takes_salary sal ON employee.Employee_ID = sal.Employee_ID "
                        + "LEFT JOIN basic_salary ON sal.Salary_ID = basic_salary.Salary_ID "
                        + "LEFT JOIN family_allowance ON family_allowance.Allowance_ID = payments.Family_Allowance_ID "
                        + "LEFT JOIN library_allowance ON library_allowance.Allowance_ID = payments.Library_Allowance_ID "
                        + "LEFT JOIN research_allowance ON research_allowance.Allowance_ID = payments.Research_Allowance_ID";                
                
                rs = stmt.executeQuery(cmd);
                int month_now = date.month + 1;
                int year_bonus = 0;
                while(rs.next())
                {
                    int amount = 0, percent = 0, bonus = 0;
                    if((month_now - rs.getInt("start_month")) == 0)
                    {
                        int year_now = date.year;
                        year_bonus = 15 * (year_now - rs.getInt("start_year"));
                    }
                    amount = rs.getInt("amount");
                    percent = rs.getInt("percent");
                    bonus = rs.getInt("bonus");
                    bonus += rs.getInt("bonus2");
                   
                    cmd = "UPDATE payments "
                            + "SET total_amount = "
                            + (amount + bonus + ((amount*percent)/100) + ((amount*year_bonus)/100))
                            + " WHERE total_amount = 0 AND Employee_ID = "
                            + rs.getInt("Employee_ID");
                    helper.Run_SQL_Command(cmd, myConnection);
                }
                return;
            }
            catch(SQLException ex)
            {
                System.out.println("\n Pay_them Exception ");
                while (ex != null)
                {
                    System.out.println("Message: " + ex.getMessage());
                    System.out.println("SQLState: " + ex.getSQLState());
                    System.out.println("ErrorCode: " + ex.getErrorCode());
                    ex = ex.getNextException();
                }
            }
        }
        else
            view_Controller.error();
    }
   
    
    //------------------------------------------------------------------------------------------------------------------------
    
    static ResultSet show_payments(Date start_date,Date end_date,Employee employee)
    {
       Statement stmt;
       ResultSet rs;
       String cmd;
       
       try 
       {
            stmt = myConnection.createStatement();
            if(employee.role == Role.ADMINISTRATIVE)
            {
                if(start_date.month != -1 && start_date.year != -1 && end_date.month != -1 && end_date.year != -1)
                {
                    cmd = "SELECT joined1.Employee_ID, joined1.first_name, joined1.last_name, p.total_amount, CONCAT(p.month, ' - ', p.year) AS date "
                             + "FROM "
                             + "payments p "
                             + "INNER JOIN"
                             + "( "
                             + "SELECT employee.Employee_ID, first_name, last_name FROM employee "
                             + "INNER JOIN"
                             + "(SELECT Employee_ID FROM contracted_administrative UNION SELECT Employee_ID FROM permanent_administrative) kapws "
                             + "ON kapws.Employee_ID = employee.Employee_ID "
                             + ") joined1 "
                             + "ON joined1.Employee_ID = p.Employee_ID"
                             + " WHERE "
                             + "("
                             + "(p.year > " + start_date.year  + " AND p.year < " + end_date.year +") OR "
                             + "((p.year = " + start_date.year + " AND p.month >= " + start_date.month + ") OR "
                             + "(p.year = " + end_date.year + " AND p.month <= " + end_date.month + ")"
                             + ")"
                             + ")";
                }
                else
                {
                      cmd = "SELECT joined1.Employee_ID, joined1.first_name, joined1.last_name, p.total_amount, CONCAT(p.month, ' - ', p.year) AS date "
                             + "FROM "
                             + "payments p "
                             + "INNER JOIN"
                             + "( "
                             + "SELECT employee.Employee_ID, first_name, last_name FROM employee "
                             + "INNER JOIN"
                             + "(SELECT Employee_ID FROM contracted_administrative UNION SELECT Employee_ID FROM permanent_administrative) kapws "
                             + "ON kapws.Employee_ID = employee.Employee_ID "
                             + ") joined1 "
                             + "ON joined1.Employee_ID = p.Employee_ID";
                }
            }
            else
            {                
                if(start_date.month != -1 && start_date.year != -1 && end_date.month != -1 && end_date.year != -1)
                {
                     cmd = "SELECT joined1.Employee_ID, joined1.first_name, joined1.last_name, p.total_amount, CONCAT(p.month, ' - ', p.year) AS date "
                             + "FROM "
                             + "payments p "
                             + "INNER JOIN"
                             + "( "
                             + "SELECT employee.Employee_ID, first_name, last_name FROM employee "
                             + "INNER JOIN"
                             + "(SELECT Employee_ID FROM contracted_educative UNION SELECT Employee_ID FROM permanent_educative) kapws "
                             + "ON kapws.Employee_ID = employee.Employee_ID "
                             + ") joined1 "
                             + "ON joined1.Employee_ID = p.Employee_ID"
                             + " WHERE "
                             + "("
                             + "(p.year > " + start_date.year  + " AND p.year < " + end_date.year +") OR "
                             + "((p.year = " + start_date.year + " AND p.month >= " + start_date.month + ") OR "
                             + "(p.year = " + end_date.year + " AND p.month <= " + end_date.month + ")"
                             + ")"
                             + ")";
                     
                }
                else
                {
                   cmd = "SELECT joined1.Employee_ID, joined1.first_name, joined1.last_name, p.total_amount, CONCAT(p.month, ' - ', p.year) AS date "
                             + "FROM "
                             + "payments p "
                             + "INNER JOIN"
                             + "( "
                             + "SELECT employee.Employee_ID, first_name, last_name FROM employee "
                             + "INNER JOIN"
                             + "(SELECT Employee_ID FROM contracted_educative UNION SELECT Employee_ID FROM permanent_educative) kapws "
                             + "ON kapws.Employee_ID = employee.Employee_ID "
                             + ") joined1 "
                             + "ON joined1.Employee_ID = p.Employee_ID";
                }
            }
            System.out.println(cmd);
            rs = stmt.executeQuery(cmd);
            return rs;
       }
       catch(SQLException ex)
       {
            System.out.println("\n changeEmployee Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
            return null;
        }
    }
    
    static public Employee find_employee(Employee employee)
    {
       Statement stmt;
       ResultSet rs;
       String cmd;
       int employee_id;
       try 
       {
           stmt = myConnection.createStatement();
           cmd = "SELECT * FROM employee "
                    + "WHERE iban = "
                    + "'" + employee.iban + "'"
                    ;
           rs = stmt.executeQuery(cmd);
           
           if(rs.next())
           {
                employee_id = rs.getInt("Employee_ID");
                
                employee.id = employee_id;
                employee.first_name = rs.getString("first_name");
                employee.last_name = rs.getString("last_name");
                employee.bank_name = rs.getString("bank_name");
                employee.birthday = rs.getString("birthday");
                employee.address = rs.getString("address");
                employee.department = rs.getString("department");
                employee.phone_number = rs.getString("phone_number");
                employee.iban = rs.getString("iban");
                employee.married = rs.getInt("married");
                
                cmd = "SELECT age FROM children WHERE Employee_ID = "
                        + employee_id
                        ;
                rs = stmt.executeQuery(cmd);
                
                employee.childrens_age = "";
                while(rs.next())
                {
                    employee.childrens_age += rs.getString("age") + ",";
                }
                
                view_Controller.changeEmployee(employee);
                return employee;
            }
           view_Controller.error();
           return null;
       }
       catch(SQLException ex)
       {
            System.out.println("\n changeEmployee Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
            return null;
        }
    }
    
    static void change_employee(Employee employee, Employee new_employee)
    {
        Statement stmt;
        ResultSet rs;
        String cmd;
        
        System.out.println("Employee name: " + new_employee.first_name);
        cmd = "UPDATE employee SET "
                    + "first_name = "
                    + helper.Add_Quotation_Marks(new_employee.first_name) + ", "
                    + "last_name = "
                    + helper.Add_Quotation_Marks(new_employee.last_name) + ", "
                    + "bank_name = "
                    + helper.Add_Quotation_Marks(new_employee.bank_name) + ", "
                    + "birthday = "
                    + helper.Add_Quotation_Marks(new_employee.birthday) + ", "
                    + "address = "
                    + helper.Add_Quotation_Marks(new_employee.address) + ", "
                    + "department = "
                    + helper.Add_Quotation_Marks(new_employee.department) + ", "
                    + "phone_number = "
                    + helper.Add_Quotation_Marks(new_employee.phone_number)
                    + " WHERE Employee_ID = "
                    + employee.id
                    ;
                    helper.Run_SQL_Command(cmd, myConnection);
                    
                    System.out.println("Command: " + cmd);
                    
                    System.out.println("Age: " + employee.childrens_age);
                    System.out.println("Age: " + new_employee.childrens_age);
                if( new_employee.married        != employee.married     || 
                    !new_employee.childrens_age.equals(employee.childrens_age)
                  )
                {
                    if(new_employee.married != employee.married)
                    {
                        cmd = "UPDATE employee SET"
                            + " married = "
                            + new_employee.married
                            + " WHERE Employee_ID = "
                            + employee.id     
                            ;
                        helper.Run_SQL_Command(cmd, myConnection);
                    }
                    
                    String tmp_my_childrens = new_employee.childrens_age;
                    if(new_employee.childrens_age != employee.childrens_age)
                    {
                        new_employee.childrens_age =  StringUtils.difference(employee.childrens_age,new_employee.childrens_age);
                        helper.Insert_Children(myConnection, new_employee);                       
                        new_employee.childrens_age = tmp_my_childrens;
                    }
                    
                    helper.Insert_Family_Allowance(myConnection, new_employee, new_employee.family_allowance);
                    helper.get_family_allowance_ID_FOR_INSERT(myConnection,new_employee.family_allowance);
                
                    cmd = "UPDATE takes_allowance SET"
                            + " Family_Allowance_ID ="
                            + new_employee.family_allowance.id
                            + " WHERE Employee_ID ="
                            + new_employee.id
                            ;
                    helper.Run_SQL_Command(cmd, myConnection);
                }
                
    }
    
    static ResultSet max_salary(Employee employee)
    {
       Statement stmt;
       ResultSet rs;
       String cmd;
       try 
       {
            stmt = myConnection.createStatement();
            if(employee.role == Role.ADMINISTRATIVE)
            {
                cmd = "SELECT DISTINCT p.Employee_ID,emp.first_name,emp.last_name, p.total_amount AS salary "
                        + "FROM payments p, contracted_administrative ca, permanent_administrative pa, employee emp "
                        + "WHERE (emp.Employee_ID = p.Employee_ID) AND "
                        + "(p.Employee_ID = ca.Employee_ID OR p.Employee_ID = pa.Employee_ID) "
                        + "ORDER BY total_amount DESC LIMIT 1";
            }
            else
            {
                cmd = "SELECT DISTINCT p.Employee_ID,emp.first_name,emp.last_name, p.total_amount AS salary "
                        + "FROM payments p, contracted_educative ce, permanent_educative pe, employee emp "
                        + "WHERE (emp.Employee_ID = p.Employee_ID) AND "
                        + "(p.Employee_ID = ce.Employee_ID OR p.Employee_ID = pe.Employee_ID) "
                        + "ORDER BY total_amount DESC LIMIT 1";
            }
            System.out.println(cmd);
            rs = stmt.executeQuery(cmd);
            //display them where?
            return rs;
       }
       catch(SQLException ex)
       {
            System.out.println("\n changeEmployee Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
            return null;
        }
    }
    
    static ResultSet least_salary(Employee employee)
    {
       Statement stmt;
       ResultSet rs;
       String cmd;
       
       try 
       {
            stmt = myConnection.createStatement();
            if(employee.role == Role.ADMINISTRATIVE)
            {
                cmd = "SELECT DISTINCT p.Employee_ID,emp.first_name,emp.last_name,total_amount AS salary "
                        + "FROM payments p, contracted_administrative ca, permanent_administrative pa, employee emp "
                        + "WHERE (emp.Employee_ID = p.Employee_ID) AND "
                        + "(p.Employee_ID = ca.Employee_ID OR p.Employee_ID = pa.Employee_ID) AND "
                        + "total_amount = (SELECT MIN(total_amount) "
                        + "FROM payments p, contracted_administrative ca, permanent_administrative pa, employee emp "
                        + "WHERE " 
                        + "(emp.Employee_ID = p.Employee_ID) AND " 
                        + "(p.Employee_ID = ca.Employee_ID OR p.Employee_ID = pa.Employee_ID))";
                
            }
            else
            {
                cmd = "SELECT DISTINCT p.Employee_ID,emp.first_name,emp.last_name,total_amount AS salary "
                        + "FROM payments p, contracted_educative ce, permanent_educative pe, employee emp "
                        + "WHERE (emp.Employee_ID = p.Employee_ID) AND "
                        + "(p.Employee_ID = ce.Employee_ID OR p.Employee_ID = pe.Employee_ID) AND "
                        + "total_amount = (SELECT MIN(total_amount) "
                        + "FROM payments p, contracted_educative ce, permanent_educative pe, employee emp "
                        + "WHERE " 
                        + "(emp.Employee_ID = p.Employee_ID) AND " 
                        + "(p.Employee_ID = ce.Employee_ID OR p.Employee_ID = pe.Employee_ID))";
            }
            System.out.println(cmd);
            rs = stmt.executeQuery(cmd);
            //display them where?
            return rs;
       }
       catch(SQLException ex)
       {
            System.out.println("\n changeEmployee Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
            return null;
        }
    }
    
    static ResultSet average_salary(Employee employee)
    {
       Statement stmt;
       ResultSet rs;
       String cmd;
       try 
       {
            stmt = myConnection.createStatement();
            if(employee.role == Role.ADMINISTRATIVE)
            {
                cmd = "SELECT AVG(total_amount) AS average_salary "
                        + "FROM payments p, contracted_administrative ca, permanent_administrative pa "
                        + "WHERE (p.Employee_ID = ca.Employee_ID OR p.Employee_ID = pa.Employee_ID)";
            }
            else
            {
                cmd = "SELECT AVG(total_amount) AS average_salary "
                       + "FROM payments p, contracted_educative ce, permanent_educative pe "
                        + "WHERE (p.Employee_ID = ce.Employee_ID OR p.Employee_ID = pe.Employee_ID)";
            }
            System.out.println(cmd);
            rs = stmt.executeQuery(cmd);
            //display them where?
            return rs;
       }
       catch(SQLException ex)
       {
            System.out.println("\n changeEmployee Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
            return null;
        }
    }
    
    static HashMap<Integer, Integer> average_hight_salary(Employee employee)
    {
       Statement stmt;
       ResultSet rs;
       String cmd;
       int amount = 0;
       try 
       {
            stmt = myConnection.createStatement();
            if(employee.role == Role.EDUCATIVE)
            {
                cmd = "SELECT total_amount, p.year as year "
                        + "FROM payments p, contracted_administrative ca, permanent_administrative pa "
                        + "WHERE (p.Employee_ID = ca.Employee_ID OR p.Employee_ID = pa.Employee_ID)";
            }
            else
            {
                cmd = "SELECT total_amount,p.year as year "
                       + "FROM payments p, contracted_educative ce, permanent_educative pe "
                        + "WHERE (p.Employee_ID = ce.Employee_ID OR p.Employee_ID = pe.Employee_ID)";
            }
            System.out.println(cmd);
            rs = stmt.executeQuery(cmd);
            
            HashMap<Integer, Integer> mean_increase = new HashMap<Integer, Integer>();
            int yeartemp = 0;
            int flag = 0;
            while(rs.next()){
                if(flag == 0){
                    yeartemp = rs.getInt("year");
                    System.out.println("Year temp: " + yeartemp);
                    flag = 1;
                }
                if(flag == 1){
                    if(yeartemp != rs.getInt("year")){
                        mean_increase.put(yeartemp, amount);
                        amount = 0;
                        yeartemp = rs.getInt("year");
                        flag = 0;
                    }
                    amount += rs.getInt("total_amount");
                }
            }
            mean_increase.put(yeartemp, amount);
            
            return mean_increase;
       }
       catch(SQLException ex)
       {
            System.out.println("\n changeEmployee Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
            view_Controller.error();
            return null;
        }
    }
    
    static ResultSet details_salary(Employee employee)
    {
       Statement stmt;
       ResultSet rs;
       String cmd;
       int id = 0;
       try 
       {
             
            stmt = myConnection.createStatement(); 
            cmd = "SELECT Employee_ID "
                        + "FROM employee "
                        + "WHERE employee.iban = "
                        + employee.iban;
            rs = stmt.executeQuery(cmd);
            if(rs.next())
            {
                id = rs.getInt("Employee_ID");
                
            cmd ="SELECT "
                    + "employee.Employee_ID,"
                    + "employee.first_name,"
                    + "employee.last_name,"
                    + "employee.iban,"
                    + "employee.phone_number,"
                    + "employee.married,"
                    + "basic_salary,"
                    + "family_bonus+'(%)',"
                    + "research_bonus,"
                    + "library_bonus,"
                    + "total_amount," 
                    + "payments.month,"
                    + "payments.year "
                    +"FROM payments " 
                    +"INNER JOIN employee ON employee.Employee_ID = payments.Employee_ID AND employee.Employee_ID = " 
                    + id
                    + " INNER JOIN (	SELECT DISTINCT Employee_ID,amount AS basic_salary " 
                    +                    " FROM basic_salary " 
                    +                    " INNER JOIN payments ON payments.Salary_ID = basic_salary.Salary_ID " 
                    +             ")"
                    + "sal ON sal.Employee_ID = employee.Employee_ID " 
                    +" LEFT JOIN (	SELECT Employee_ID,percent AS family_bonus " 
                    +                   " FROM family_allowance "
                    +                   " INNER JOIN takes_allowance ON "
                    +                   "family_allowance.Allowance_ID = takes_allowance.Family_Allowance_ID" 
                    +           ")"
                    + "fa ON fa.Employee_ID = employee.Employee_ID " 
                    +" LEFT JOIN (	SELECT Employee_ID,bonus AS research_bonus"
                    +                    " FROM research_allowance "
                    +                    " INNER JOIN takes_allowance ON "
                    +                    "research_allowance.Allowance_ID = takes_allowance.Research_Allowance_ID" 
                    +           ")"
                    + "ra ON ra.Employee_ID = employee.Employee_ID "
                    +"LEFT JOIN (	SELECT Employee_ID,bonus AS library_bonus "
                    +                   " FROM library_allowance "
                    +                   " INNER JOIN takes_allowance ON "
                    +                   " library_allowance.Allowance_ID = takes_allowance.Library_Allowance_ID " 
                    +           ")"
                    + "la ON la.Employee_ID = employee.Employee_ID" ;           


                    //display them where?
                    System.out.println(cmd);
                    rs = stmt.executeQuery(cmd);
            }
            return rs;
       }
       catch(SQLException ex)
       {
            System.out.println("\n changeEmployee Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
            return null;
        }
    }
    
    static int increase_salary(Date date, Employee employee,int flag)
    {
       String cmd;
       Statement stmt;
       ResultSet rs;
       int bonus = 0;
       int count = 0;
       int numb = 0;
       try 
       {
            stmt = myConnection.createStatement();
            if(flag == 0)
            {
                cmd = "SELECT bonus " 
                    + "FROM contracted_educative pa " 
                    + "INNER JOIN takes_allowance ts ON ts.Employee_ID = pa.Employee_ID AND ("
                    + "ts.month <= "
                    +   date.month
                    + " AND ts.year <= "
                    +   date.year
                    + ")INNER JOIN library_allowance ra ON ra.Allowance_ID = ts.Library_Allowance_ID";
                 rs = stmt.executeQuery(cmd);
                while(rs.next())
                {
                    bonus += (rs.getInt("ra.bonus") - 250);
                    numb++;
                }
                if(numb != 0)
                    return bonus/numb;
                else
                    return 0;
            }
            else if(flag == 1)
            {
                  cmd = "SELECT bs.amount,ra.bonus " 
                        + "FROM permanent_educative pe " 
                        + "INNER JOIN takes_salary ts ON ts.Employee_ID = pe.Employee_ID AND"
                        + " (ts.month <= "
                        + date.month
                        + " AND ts.year <= "
                        + date.year
                        + ") INNER JOIN basic_salary bs ON bs.Salary_ID = ts.Salary_ID"
                        + " INNER JOIN takes_allowance ta ON ta.Employee_ID = pe.Employee_ID " 
                        + " INNER JOIN research_allowance ra ON ra.Allowance_ID = ta.Research_Allowance_ID";
                rs = stmt.executeQuery(cmd);
                while(rs.next())
                {
                    bonus += (rs.getInt("bonus") - 500);
                    numb++;
                }
                if(numb != 0)
                    return bonus/numb;
                else
                    return 0;
            }

            if(employee.role == Employee.Role.EDUCATIVE)
            {
                cmd = "SELECT bs.amount " 
                        + "FROM permanent_educative pe " 
                        + "INNER JOIN takes_salary ts ON ts.Employee_ID = pe.Employee_ID AND"
                        + " (ts.month <= "
                        + date.month
                        + " AND ts.year <= "
                        + date.year
                        + ") INNER JOIN basic_salary bs ON bs.Salary_ID = ts.Salary_ID";
                rs = stmt.executeQuery(cmd);
                System.out.println("Command: " + cmd);
                while(rs.next())
                {
                    count += (rs.getInt("amount") - 1500);
                    numb++;
                }
                if(numb != 0)
                    return count/numb;
                else
                    return 0;
            }
            else if(employee.role == Employee.Role.ADMINISTRATIVE)
            {
                cmd = "SELECT bs.amount " 
                        + "FROM permanent_administrative pa " 
                        + "INNER JOIN takes_salary ts ON ts.Employee_ID = pa.Employee_ID AND ("
                        + "ts.month <= "
                        +   date.month
                        + " AND ts.year <= "
                        +   date.year
                        + ") INNER JOIN basic_salary bs ON bs.Salary_ID = ts.Salary_ID";
                rs = stmt.executeQuery(cmd);
                System.out.println("Command: " + cmd);
                while(rs.next())
                {
                    count += (rs.getInt("amount") - 1000);
                    numb++;
                }
                if(numb != 0){
                    return count/numb;
                }
                else
                    return 0;
            }
            view_Controller.error();
            return -1;
       }
       catch(SQLException ex)
       {
            view_Controller.error();
            System.out.println("\n increase_salary Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
            return -1;
        }
    }
    
    //------------------------------------------------------------------------------------------------------------------------
    
    static View_Controller view_Controller;
    public void initialize(View_Controller view_controller) 
    {
        view_Controller = view_controller;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost";
            String databaseName = "test";
            int port = 3306;
            String username = "root";
            String password = "";

            myConnection = DriverManager.getConnection(url + ":" + port + "/" + databaseName + "?characterEncoding=UTF-8", username, password);
            //helper.Initialize_Tables(myConnection);
            //helper.Initialize_Basic_Inputs(myConnection);
        }
        catch(SQLException ex)
        {
            System.out.println("\nException ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
        } 
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DB_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}