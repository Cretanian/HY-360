package EmployeeClasses;
import AllowanceClasses.*;
import SalaryClasses.*;

public abstract class Employee
{
    public Employee()
    {
        family_allowance.percent = 0;
        library_allowance.bonus_money = 0;
        research_allowance.bonus_money = 0;
    }
    
    public int      id  = 0;  
    public String   first_name = "NULL";
    public String   last_name = "NULL";
    public String   bank_name = "NULL";
    public String   iban = "NULL";
    public String   birthday = "NULL";
    public String   address = "NULL";
    public String   department = "NULL";
    
    public String   phone_number = "NULL";
    public int      married = 0;
    public int      start_month  = 0;
    public int      start_year  = 0;
    public String   childrens_age = "0";
    public int      working  = 1;
    public enum Role
    {
        ADMINISTRATIVE,
        EDUCATIVE        
    };
    public Role role;
    
    public Salary salary = new Salary();
    
    public Family_Allowance family_allowance = new Family_Allowance();
    public Library_Allowance library_allowance = new Library_Allowance();
    public Research_Allowance research_allowance = new Research_Allowance();
}