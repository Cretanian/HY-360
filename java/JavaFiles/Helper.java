package JavaFiles;

import AllowanceClasses.*;
import java.sql.*;
import EmployeeClasses.*;
import EmployeeClasses.Employee.Role;
import static JavaFiles.DB_Controller.hireEmployee;
import SalaryClasses.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Helper {
    Date date = new Date();
    
    void Run_SQL_Command(String cmd, Connection connection)
    {
        try
        {
            Statement myStmt = connection.createStatement();
            myStmt.executeUpdate(cmd);
            myStmt.close();
            return;
        }
        catch(SQLException ex)
        {
            System.out.println("\n Run SQL Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
    }
   
    static String Add_Quotation_Marks(String str)
    {
        assert(!"".equals(str));
        String tmp_str = "'" + str + "'";
        return tmp_str;
    }
    
    boolean Is_Permanant_Educative(Connection connection, int employee_id) 
    {
        String cmd;
        Statement stmt;
        ResultSet rs;
        
        try {
            stmt = connection.createStatement();
            
            cmd = "SELECT * FROM permanent_educative"
                    + " WHERE Employee_ID = "
                    + employee_id
                    ;
            rs = stmt.executeQuery(cmd);
            if(rs.next())
                return true;
            
            return false;                         
        } 
        catch (SQLException ex) 
        {
            System.out.println("\n Is_Permanant Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
        return false; 
    }
    
    boolean Is_Permanant_Administrative(Connection connection, int employee_id) 
    {
        String cmd;
        Statement stmt;
        ResultSet rs;
        
        try {
            stmt = connection.createStatement();
            cmd = "SELECT * FROM permanent_administrative"
                    + " WHERE Employee_ID = "
                    + employee_id
                    ;
            rs = stmt.executeQuery(cmd);
            if(rs.next())
                return true;
            
            return false;                         
        } 
        catch (SQLException ex) 
        {
            System.out.println("\n Is_Permanant Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
        return false; 
    }
    
    boolean Is_Contractes_Administrative(Connection connection,int employee_id)
    {
        String cmd;
        Statement stmt;
        ResultSet rs;
        try {
            stmt = connection.createStatement();
            
            cmd = "SELECT * FROM contracted_administrative"
                    + " WHERE Employee_ID = "
                    + employee_id
                    ;
            rs = stmt.executeQuery(cmd);
            if(rs.next())
                return true;
            
            return false;                         
        } 
        catch (SQLException ex) 
        {
            System.out.println("\n Is_Contractes_Administrative Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
        return false;
    }
    
    boolean Is_Contractes_Educative(Connection connection,int employee_id)
    {
        String cmd;
        Statement stmt;
        ResultSet rs;
        try {
            stmt = connection.createStatement();
            cmd = "SELECT * FROM contracted_educative"
                    + " WHERE Employee_ID = "
                    + employee_id
                    ;
            rs = stmt.executeQuery(cmd);
            if(rs.next())
                return true;            
            return false;                         
        } 
        catch (SQLException ex) 
        {
            System.out.println("\n Is_Contractes_educative Exception ");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
        return false;                          
    }
    
    void get_Employee_ID(Connection connection,Employee emp)
    {
        String cmd;
        Statement stmt;
        ResultSet rs;
        try {
            System.out.println("Iban: " + emp.iban);
            
            stmt = connection.createStatement();
            cmd = "SELECT Employee_ID FROM employee WHERE iban = " 
                + "'" + emp.iban + "'";
            rs = stmt.executeQuery(cmd);
            if(rs.next()){
                System.out.println("EmployeeID: " + emp.id);
                emp.id = rs.getInt("Employee_ID");
                System.out.println("EmployeeID: " + emp.id);
            }
            else
                assert(false);
            return;
        }
        catch (SQLException ex) {
            System.out.println("\n GetEmployee ID:");
            while (ex != null)
            {
                System.out.println("Message: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("ErrorCode: " + ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
    }
    
    void get_my_Salary_ID_FOR_INSERT(Connection connection,Salary sal)
    {
        String cmd;
        Statement stmt;
        ResultSet rs;
        try {
            stmt = connection.createStatement();
            cmd = "SELECT MAX(Salary_ID) FROM basic_salary";
                
            rs = stmt.executeQuery(cmd);
            if(rs.next())
                sal.salary_id = rs.getInt("MAX(Salary_ID)");
            else
                assert(false);
        return;
        } 
        catch (SQLException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void get_family_allowance_ID_FOR_INSERT(Connection connection,Family_Allowance fam)
    {
        String cmd;
        Statement stmt;
        ResultSet rs;
        try {
            stmt = connection.createStatement();
            cmd = "SELECT MAX(Allowance_ID) FROM family_allowance"; 
                
            rs = stmt.executeQuery(cmd);
            if(rs.next())
                fam.id = rs.getInt("MAX(Allowance_ID)");
            else
                assert(false);
        return;    
        }
        catch (SQLException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void get_max_library_allowance_ID(Connection connection,Library_Allowance lib)
    {
        String cmd;
        Statement stmt;
        ResultSet rs;
        try {
            stmt = connection.createStatement();
            cmd = "SELECT MAX(Allowance_ID) FROM library_allowance";
                
            rs = stmt.executeQuery(cmd);
            if(rs.next())
                lib.id = rs.getInt("MAX(Allowance_ID)");
            else
                assert(false);
            return;   
        }
        catch (SQLException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void get_max_research_allowance_ID(Connection connection,Research_Allowance re)
    {
        String cmd;
        Statement stmt;
        ResultSet rs;
        try {
            stmt = connection.createStatement();
            cmd = "SELECT MAX(Allowance_ID) FROM research_allowance";
                
            rs = stmt.executeQuery(cmd);
            if(rs.next())
                re.id = rs.getInt("MAX(Allowance_ID)");
            else
                assert(false);
            return;    
        }
        catch (SQLException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    void Initialize_Tables(Connection connection)
    {
        String cmd;
        
        cmd = "CREATE TABLE Employee("
                + "Employee_ID int not null AUTO_INCREMENT,"
                + "first_name varchar(25) not null,"
                + "last_name varchar(25) not null,"
                + "bank_name varchar(25) not null,"
                + "iban varchar(50) not null UNIQUE,"
                + "birthday varchar(25) not null,"
                + "address varchar(25) not null,"
                + "department varchar(25) not null,"
                + "phone_number long not null,"
                + "start_month int not null,"
                + "start_year int not null,"
                + "married int not null,"
                + "working int not null,"
                + "PRIMARY KEY(Employee_ID)"
                + ")";
        Run_SQL_Command(cmd, connection);
        
        cmd = "CREATE TABLE Permanent_Administrative("
                + "Employee_ID int not null,"
                + "FOREIGN KEY(Employee_ID) REFERENCES Employee(Employee_ID)"
                + ")";
        Run_SQL_Command(cmd, connection);
        
        cmd = "CREATE TABLE Permanent_Educative("
                + "Employee_ID int not null,"
                + "FOREIGN KEY(Employee_ID) REFERENCES Employee(Employee_ID)"
                + ")";
        Run_SQL_Command(cmd, connection);
        
        cmd = "CREATE TABLE Contracted_Administrative("
                + "Employee_ID int not null,"
                + "FOREIGN KEY(Employee_ID) REFERENCES Employee(Employee_ID),"
                + "end_month int not null,"
                + "end_year int not null"
                + ")";
        Run_SQL_Command(cmd, connection);
        
        cmd = "CREATE TABLE Contracted_Educative("
                + "Employee_ID int not null,"
                + "FOREIGN KEY(Employee_ID) REFERENCES Employee(Employee_ID),"
                + "end_month int not null,"
                + "end_year int not null"
                + ")";
        Run_SQL_Command(cmd, connection); 
        
        cmd = "CREATE TABLE Children("
                + "Employee_ID int not null,"
                + "FOREIGN KEY(Employee_ID) REFERENCES Employee(Employee_ID),"
                + "age int not null"
                + ")";
        Run_SQL_Command(cmd, connection);
        
        cmd = "CREATE TABLE Basic_Salary("
                + "Salary_ID int not null AUTO_INCREMENT,"
                + "amount int not null,"
                + "PRIMARY KEY(Salary_ID)"
                + ")";
        Run_SQL_Command(cmd, connection);
        
        cmd = "CREATE TABLE Family_Allowance("
                + "Allowance_ID int not null AUTO_INCREMENT,"
                + "percent int not null,"
                + "PRIMARY KEY(Allowance_ID)"
                + ")";
        Run_SQL_Command(cmd, connection); 
        
        cmd = "CREATE TABLE Research_Allowance("
                + "Allowance_ID int not null AUTO_INCREMENT,"
                + "bonus int not null,"
                + "PRIMARY KEY(Allowance_ID)"
                + ")";
        Run_SQL_Command(cmd, connection); 
        
        cmd = "CREATE TABLE Library_Allowance("
                + "Allowance_ID int not null AUTO_INCREMENT,"
                + "bonus int not null,"
                + "PRIMARY KEY(Allowance_ID)"
                + ")";
        Run_SQL_Command(cmd, connection);
        
        cmd = "CREATE TABLE Takes_Salary("
                + "Employee_ID int not null,"
                + "FOREIGN KEY(Employee_ID) REFERENCES Employee(Employee_ID),"
                + "Salary_ID int not null,"
                + "FOREIGN KEY(Salary_ID) REFERENCES Basic_Salary(Salary_ID),"
                + "month int not null,"
                + "year int not null"
                + ")";
        Run_SQL_Command(cmd, connection);
        
        cmd = "CREATE TABLE Takes_Allowance("
                + "Employee_ID int not null,"
                + "FOREIGN KEY(Employee_ID) REFERENCES Employee(Employee_ID),"
                + "Family_Allowance_ID int,"
                + "FOREIGN KEY(Family_Allowance_ID) REFERENCES Family_Allowance(Allowance_ID),"
                + "Research_Allowance_ID int,"
                + "FOREIGN KEY(Research_Allowance_ID) REFERENCES Research_Allowance(Allowance_ID),"
                + "Library_Allowance_ID int,"
                + "FOREIGN KEY(Library_Allowance_ID) REFERENCES Library_Allowance(Allowance_ID),"
                + "month int not null,"
                + "year int not null"
                + ")";
        Run_SQL_Command(cmd, connection);
        
        cmd = "CREATE TABLE Payments("
                + "Employee_ID int not null,"
                + "FOREIGN KEY(Employee_ID) REFERENCES Employee(Employee_ID),"
                + "Salary_ID int not null,"
                + "FOREIGN KEY(Salary_ID) REFERENCES Basic_Salary(Salary_ID),"
                + "Family_Allowance_ID int,"
                + "FOREIGN KEY(Family_Allowance_ID) REFERENCES Family_Allowance(Allowance_ID),"
                + "Research_Allowance_ID int,"
                + "FOREIGN KEY(Research_Allowance_ID) REFERENCES Research_Allowance(Allowance_ID),"
                + "Library_Allowance_ID int,"
                + "FOREIGN KEY(Library_Allowance_ID) REFERENCES Library_Allowance(Allowance_ID),"
                + "month int not null,"
                + "year int not null,"
                + "total_amount int not null"
                + ")";
        Run_SQL_Command(cmd, connection);
        return;
    }
    
    void Initialize_Basic_Inputs(Connection connection) throws SQLException //fix it add multiple
    {        
       Salary administrative_salary = new Salary();
            administrative_salary.amount = 1000;
        Insert_Salary(connection,administrative_salary);
        
        Salary educative_salary = new Salary();
            educative_salary.amount = 1500;
        Insert_Salary(connection,educative_salary);
        
        Research_Allowance research_allowance = new Research_Allowance();
            research_allowance.bonus_money = 500;
        Insert_Research_Allowance(connection,research_allowance);
        
        Library_Allowance library_allowance = new Library_Allowance();
            library_allowance.bonus_money = 250;
        Insert_Library_Allowance(connection,library_allowance);
       
        Permanent_Employee Manos = new Permanent_Employee();
            Manos.first_name        = "Manos";
            Manos.last_name         = "Pervolarakis";
            Manos.bank_name         = "Ethniki";
            Manos.iban              = "1694147666";
            Manos.birthday          = "04/10/1995";
            Manos.address           = "dipla apo Zack";
            Manos.department        = "phs";
            Manos.phone_number      = "697488523";
            Manos.married           = 0;
            Manos.childrens_age     = "0";
            Manos.role              = Role.ADMINISTRATIVE;
            Manos.working           = 1;
        hireEmployee( (Employee) Manos);
        
        Permanent_Employee antos = new Permanent_Employee();
            antos.first_name        = "Antonis";
            antos.last_name         = "Agapakis";
            antos.bank_name         = "Ethniki";
            antos.iban              = "1619447755";
            antos.birthday          = "05/04/1999";
            antos.address           = "Nikolaidi 4";
            antos.department        = "CSD";
            antos.phone_number      = "645640663";
            antos.married           = 1;
            antos.childrens_age     = "1,2,3";
            antos.role              = Role.EDUCATIVE;
            antos.working           = 1;
        hireEmployee( (Employee) antos);
        
        Contracted_Employee Stelios = new Contracted_Employee();
            Stelios.first_name      = "Stelios";
            Stelios.last_name       = "Stamatakis";
            Stelios.bank_name       = "Ethniki";
            Stelios.iban            = "1691447676";
            Stelios.birthday        = "03/01/1999";
            Stelios.address         = "Kondilaki 8";
            Stelios.department      = "CSD";
            Stelios.phone_number    = "6945710663";
            Stelios.married         = 0;
            Stelios.childrens_age   = "0";
            Stelios.role            = Role.ADMINISTRATIVE;
            Stelios.end_month       = 12;
            Stelios.end_year        = 2021;
            Stelios.working         = 1;
            Stelios.salary.amount      = 1293;
        hireEmployee( (Employee) Stelios);
        
        Contracted_Employee Zack = new Contracted_Employee();
            Zack.first_name         = "Zack";
            Zack.last_name          = "Per";
            Zack.bank_name          = "Eurobank";
            Zack.iban               = "1619447646";
            Zack.birthday           = "03/05/1995";
            Zack.address            = "nea poli 8";
            Zack.department         = "CSD";
            Zack.phone_number       = "6912553645";
            Zack.married            = 1;
            Zack.childrens_age      = "1,2";
            Zack.role               = Role.EDUCATIVE;
            Zack.end_month          = 04;
            Zack.end_year           = 2023;
            Zack.working            = 1;
            Zack.salary.amount      = 1743;
        hireEmployee( (Employee) Zack);
        return;
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
    
    //working
    void Insert_Permanent(Connection connection, Permanent_Employee per_employee)
    {
        String cmd,table;
        
        cmd = "INSERT INTO employee(first_name,last_name,bank_name,iban,birthday,address,department,phone_number,start_month,start_year,married,working) VALUES("
                + Add_Quotation_Marks(per_employee.first_name) + ","
                + Add_Quotation_Marks(per_employee.last_name) + ","
                + Add_Quotation_Marks(per_employee.bank_name) + ","
                + Add_Quotation_Marks(per_employee.iban) + ","
                + Add_Quotation_Marks(per_employee.birthday) + ","
                + Add_Quotation_Marks(per_employee.address) + ","
                + Add_Quotation_Marks(per_employee.department) + ","
                + per_employee.phone_number + ","
                + per_employee.start_month + ","
                + per_employee.start_year + ","
                + per_employee.married + ","
                + per_employee.working
                + ");";
        Run_SQL_Command(cmd, connection);
        
        if(per_employee.role == Role.ADMINISTRATIVE)
        {
            table = "permanent_administrative";      
        }
        else
        {
            table = "permanent_educative"; 
        }
        get_Employee_ID(connection,per_employee);       
        cmd = "INSERT INTO " + table + " VALUES("
                    + per_employee.id
                    + ");";
        
        Run_SQL_Command(cmd, connection);
        return;
    }
    //working
    void Insert_Contracted(Connection connection, Contracted_Employee con_employee) 
    {
        String cmd,table;
        cmd = "INSERT INTO employee(first_name,last_name,bank_name,iban,birthday,address,department,phone_number,start_month,start_year,married,working) VALUES("
                + Add_Quotation_Marks(con_employee.first_name) + ","
                + Add_Quotation_Marks(con_employee.last_name) + ","
                + Add_Quotation_Marks(con_employee.bank_name) + ","
                + Add_Quotation_Marks(con_employee.iban) + ","
                + Add_Quotation_Marks(con_employee.birthday) + ","
                + Add_Quotation_Marks(con_employee.address) + ","
                + Add_Quotation_Marks(con_employee.department) + ","
                + Add_Quotation_Marks(con_employee.phone_number) + ","
                + con_employee.start_month + ","
                + con_employee.start_year + ","
                + con_employee.married + ","
                + con_employee.working
                + ");";
        Run_SQL_Command(cmd, connection);
        
        if(con_employee.role == Role.ADMINISTRATIVE)
        {
            table = "contracted_administrative";      
        }
        else
        {
            table = "contracted_educative"; 
        }
        get_Employee_ID(connection,con_employee);
        cmd = "INSERT INTO " + table + " VALUES("
                    + con_employee.id + ","
                    + con_employee.end_month + ","
                    + con_employee.end_year
                    + ");";
       
        Run_SQL_Command(cmd, connection);
        return;
    }
    //working
    void Insert_Children(Connection connection, Employee employee)
    {
        String cmd;
        if(!"0".equals(employee.childrens_age))
        {
            String[] tokens = employee.childrens_age.split(",");
            
            get_Employee_ID(connection, employee);
            for (String t : tokens)
            {
                cmd = "INSERT INTO children VALUES("
                        + employee.id + ","
                        + Integer.parseInt(t)
                        + ");";
                Run_SQL_Command(cmd, connection);
            }
        }
        return;
    }
    //working   
    void Insert_Salary(Connection connection,Salary salary)
    {
        String cmd;
        cmd = "INSERT INTO Basic_Salary (amount) VALUES("
                + salary.amount
                + ");";
        Run_SQL_Command(cmd, connection);
        return;
    }
    //working
    void Insert_Takes_Salary(Connection connection, Employee employee, Salary salary)
    {
        String cmd;    
     
        cmd = "INSERT INTO Takes_Salary VALUES("
                + employee.id + ","
                + salary.salary_id + ","
                + date.month + ","
                + date.year
                + ");";
        Run_SQL_Command(cmd, connection);
        return;
    }
    //working
    void Insert_Takes_Allowance(Connection connection, Employee employee)
    {
        String cmd, family, reaserch, library;
        
        if(employee.family_allowance.id == 0)
            family = "NULL";
        else
            family = String.valueOf(employee.family_allowance.id);
        
        if(employee.research_allowance.id == 0)
            reaserch = "NULL";
        else
            reaserch = String.valueOf(employee.research_allowance.id);
        
        if(employee.library_allowance.id == 0)
            library = "NULL";
        else
            library = String.valueOf(employee.library_allowance.id);
        
        cmd = "INSERT INTO Takes_Allowance VALUES("
                + employee.id + ","
                + family + ","
                + reaserch + ","
                + library + ","
                + date.month + ","
                + date.year
                + ");";
        Run_SQL_Command(cmd, connection);
        return;
    }
     //working
    void Insert_Family_Allowance(Connection connection, Employee employee, Family_Allowance family_allowance)
    {
        String cmd;
        int percent = 0;
        
        if(employee.married == 1)
            percent += 5;
        
        if(!"0".equals(employee.childrens_age))
        {
            String[] tokens = employee.childrens_age.split(",");

            for (String t : tokens)
            {
                if(Integer.parseInt(t) < 18)
                    percent += 5;         
            }
        }
        family_allowance.percent = percent;
        
        cmd = "INSERT INTO family_allowance(percent) VALUES("
                + percent
                + ");";
        Run_SQL_Command(cmd, connection);
        return;
    }
    //working
    void Insert_Library_Allowance(Connection connection, Library_Allowance library_allowance)
    {
        String cmd;
        cmd = "INSERT INTO Library_Allowance(bonus) VALUES("
                + library_allowance.bonus_money
                + ");";
        Run_SQL_Command(cmd, connection);
        return;
    }
    //working
    void Insert_Research_Allowance(Connection connection, Research_Allowance research_allowance)
    {
        String cmd;
        cmd = "INSERT INTO Research_Allowance(bonus) VALUES("
                + research_allowance.bonus_money
                + ");";
        Run_SQL_Command(cmd, connection);
        return;
    }
    //working
    void Insert_Takes_Payment(Connection connection, Employee employee)           // not sure
    {
        String cmd, family, reaserch, library;
        int total_amount = 0;
        
        total_amount += employee.salary.amount;
        
        if(employee.family_allowance.id == 0)
            family = "NULL";
        else
            family = String.valueOf(employee.family_allowance.id);
        
        if(employee.research_allowance.id == 0)
            reaserch = "NULL";
        else
            reaserch = String.valueOf(employee.research_allowance.id);
        
        if(employee.library_allowance.id == 0)
            library = "NULL";
        else
            library = String.valueOf(employee.library_allowance.id);
        
        total_amount += ( (employee.family_allowance.percent * employee.salary.amount) / 100 );
        total_amount += employee.library_allowance.bonus_money;
        total_amount += employee.research_allowance.bonus_money;
        
        cmd = "INSERT INTO Payments VALUES("
               + employee.id + ","
               + employee.salary.salary_id + ","
               + family + ","
               + reaserch + ","
               + library + ","
               + date.month + ","
               + date.year + ","
               + total_amount
               + ");";
        Run_SQL_Command(cmd, connection);
        return;
    }    
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //working
    void Update_My_Salary(Connection connection, Contracted_Employee employee)
    {
        String cmd;
        cmd = "UPDATE takes_salary SET "
                + "Salary_ID = " + employee.salary.salary_id + ","
                + " month = " + date.month + ","
                + " year = " + date.year
                + " WHERE Employee_ID = " + employee.id
                ;
        Run_SQL_Command(cmd, connection);
        
        if(Is_Contractes_Administrative(connection,employee.id)){
            cmd = "UPDATE contracted_administrative SET "
                + " end_month = " + employee.end_month + ","
                + " end_year = " + employee.end_year
                + " WHERE Employee_ID = " + employee.id
                ;
            Run_SQL_Command(cmd, connection);
            return;
        }
        
        if(Is_Contractes_Educative(connection, employee.id)){
             cmd = "UPDATE contracted_educative SET "
                + " end_month = " + employee.end_month + ","
                + " end_year = " + employee.end_year
                + " WHERE Employee_ID = " + employee.id
                ;
            Run_SQL_Command(cmd, connection);
            return;
        }
    }
   
}