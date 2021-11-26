/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFiles;

import AllowanceClasses.Allowance;
import AllowanceClasses.Library_Allowance;
import AllowanceClasses.Research_Allowance;
import EmployeeClasses.Contracted_Employee;
import EmployeeClasses.Employee;
import EmployeeClasses.Permanent_Employee;
import SalaryClasses.Salary;

import View.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
/**
 *
 * @author Zacki
 */

public class View_Controller {
    DB_Controller db_controller;
    
    //HOME
    Home                        home;
    Actions                     actions;
    Quarries                    quarries;
    //ACTIONS
    Permanent_Format            perm_format; 
    Contracted_Format           contr_format;
    Search_IBAN                 search_iban;
    Alter_Payments              alter_payments;
    New_Contract                new_contract;
    //QUARRIES
    Search_Date                 search_date;
    Payment_State_Table         payment_state_table;
    Max_min_mean                max_min_mean;
    
    private void initializeView(){
         actions = new Actions(this);
         home =  new Home(this);
         quarries = new Quarries(this);
         alter_payments = new Alter_Payments(this);
    }
    
    public View_Controller(){
        
    }
    public View_Controller(DB_Controller db_controller){
        initializeView();
        this.db_controller = db_controller;
    }
    
    public void Start(){
        initializeView();
        home.setVisible(true);
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    // HOME: DONE
    public void actionsClicked(){
        home.setVisible(false);
        actions.setVisible(true);
    }
    public void querriesClicked(){
        home.setVisible(false);
        quarries.setVisible(true);
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ACTIONS
    public void hirePermanentClicked(){
        actions.setVisible(false);
        
        perm_format = new Permanent_Format(this);
        perm_format.state = Permanent_Format.State.HIRE;
        perm_format.setVisible(true);
    }

    public void hirePermanent(Permanent_Employee permanent){
        try{
        new DB_Controller().hireEmployee(permanent);
        }
        catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
    
    //DONE
    public void hireContractedClicked(){
        actions.setVisible(false);
        
        contr_format = new Contracted_Format(this);
        contr_format.state = Contracted_Format.State.HIRE;
        contr_format.setVisible(true);
    }
    
    public void alterEmployeeDataClicked(){
        actions.setVisible(false);
        
        search_iban = new Search_IBAN(this);
        search_iban.setVisible(true);
        search_iban.prepareForChange();
        search_iban.state = Search_IBAN.State.ALTER;
    }
        
    public void fireEmployeeClicked(){
        actions.setVisible(false);
        
        search_iban = new Search_IBAN(this);
        search_iban.setVisible(true);
        search_iban.state = Search_IBAN.State.FIRE;
        search_iban.hideEmployeeSelection();
    }
    
    public void alterPaymentsClicked(){
        actions.setVisible(false);
        alter_payments.setVisible(true);
    }
    
    public void promoteContractedClicked(){
        actions.setVisible(false);
        
        search_iban = new Search_IBAN(this);
        search_iban.setVisible(true);
        search_iban.state = Search_IBAN.State.PROMOTE;
        search_iban.hideEmployeeSelection();
        search_iban.typeSetEnabled(false); search_iban.typeSetSelected(1); //1 means Contracted
    }
    
    public void setNewContractClicked(){
        actions.setVisible(false);
        
        new_contract = new New_Contract(this);
        new_contract.setVisible(true);
    }
    
    public void payEmployeesClicked(){
        db_controller.pay_them();
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   
    //~~~~~~~~~
    // QUERRIES
    /*
     This handles:
        PAYMENT_STATE
        MEAN_INCREASE
    */ //DONE
    public void searchDateClicked(Employee employee, Date from, Date to, int flag){
        ResultSet rs = null;
        search_date.setVisible(false);
        home.setVisible(true);
        
        switch(flag){
            case 0: //Payment state
                payment_state_table = new Payment_State_Table();
                payment_state_table.setVisible(true);
                rs = db_controller.show_payments(from, to, employee);
                payment_state_table.fillTable(rs);
                break;
            case 1: //Mean increase
                int tmp_flag = 0;
                int increase = db_controller.increase_salary(to, employee,tmp_flag);
                
                //Edw prepei na pairnv 4 fores gia na parw sunolika olous tous misthous.
                HashMap<String, Integer> mean_increase = new HashMap<String, Integer>();
                
                
                //Calculating mean_increase for: BASIC SALARIES, LIBRARY AND SCIENCE ALLOWANCE.
                String adm, edu, libr, scien; int temp;
                adm = "Διοικιτικός Μισθμός"; edu = "Διδακτικός Μισθός"; libr = "Επίδομα Βιβλιοθήκης"; scien = "Επίδομα Έρευνας";
                employee.role = Employee.Role.ADMINISTRATIVE;
                temp = db_controller.increase_salary(to, employee, -1); mean_increase.put(adm, temp);System.out.println("Temp: " + temp);
                employee.role = Employee.Role.EDUCATIVE;
                temp = db_controller.increase_salary(to, employee, -1); mean_increase.put(edu, temp);
                temp = db_controller.increase_salary(to, employee, 0); mean_increase.put(libr, temp);
                temp = db_controller.increase_salary(to, employee, 1); mean_increase.put(scien, temp);
                //End of calculations

                Mean_Increase_Table mit = new Mean_Increase_Table();
                mit.fillTables(mean_increase);
                mit.setVisible(true);
                break;
            default:
                
        }
        
    }
    //DONE
    public void paymentStateClicked(){
        quarries.setVisible(false);
        search_date = new Search_Date(this);
        search_date.state = Search_Date.State.PAYMENT_STATE;
        search_date.setVisible(true);
    }
    
    //DONE
    public void meanIncreaseClicked(){
        quarries.setVisible(false);
        search_date = new Search_Date(this);
        search_date.setVisible(true);
        search_date.state = Search_Date.State.MEAN_INCREASE;
        search_date.prepareFor();
    }

    //DONE
    public void maxMinMeanClicked(){
        quarries.setVisible(false);
        max_min_mean = new Max_min_mean(this);
        max_min_mean.setVisible(true);
    }
    //DONE
    public void maxMinMeanSeach(Employee employee, int flag) throws SQLException{
        ResultSet rs;
        switch(flag){
            case 0:
                rs = db_controller.max_salary(employee);
                break;
            case 1:
                rs = db_controller.least_salary(employee);
                break;
            case 2:
                rs = db_controller.average_salary(employee);
                rs.next();
                JANumber jan = new JANumber();
                jan.showAmount(rs.getInt("average_salary"));jan.setVisible(true);
                max_min_mean.setVisible(false);
                home.setVisible(true);
                return;
            default:
                rs = null;
        }
        max_min_mean.setVisible(false);
        home.setVisible(true);
        
        Max_min_mean_Table mmm_table = new Max_min_mean_Table();
        mmm_table.fillTable(rs);
        mmm_table.setVisible(true);
    }
        
    //DONE
    public void employeePaymentClicked(){
        quarries.setVisible(false);
        
        search_iban = new Search_IBAN(this);
        search_iban.setVisible(true);
        search_iban.state = Search_IBAN.State.FIND_PAYMENT;
    }
    //DONE
    public void employeePayment(Employee employee){
        search_iban.setVisible(false);
        home.setVisible(true);
        
        ResultSet rs;
        rs = db_controller.details_salary(employee);
    }
    
    //DONE
    public void mean_height(){
        Employee employee = new Permanent_Employee();        
        HashMap<Integer, Integer> meanAdm;
        HashMap<Integer, Integer> meanEdu;
        
        employee.role = Employee.Role.ADMINISTRATIVE;
        meanAdm = db_controller.average_hight_salary(employee);
        
        employee.role = Employee.Role.EDUCATIVE;
        meanEdu = db_controller.average_hight_salary(employee);
        
        quarries.setVisible(false);
        home.setVisible(true);
        Mean_Height_Table mht = new Mean_Height_Table();
        mht.fillTables(meanEdu, meanAdm);
        mht.setVisible(true);
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    //FINAL ACTIONS
    //DONE
    public void hireEmployee(Employee employee){
        try{
            System.out.println("Chil" + employee.childrens_age);
            home.setVisible(true);
            if(contr_format != null)
                contr_format.setVisible(false);
            if(perm_format != null)
                perm_format.setVisible(false);
            
            db_controller.hireEmployee(employee);

            if(perm_format != null)
                perm_format.setVisible(false);
            if(contr_format != null)
                contr_format.setVisible(false);
            home.setVisible(true);
        }
        catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
    
    //DONE
    public void changeEmployee(Employee employee){
        if(employee instanceof Contracted_Employee){
            contr_format = new Contracted_Format(this);
            contr_format.state = Contracted_Format.State.ALTER;
            contr_format.setEmployee((Contracted_Employee)employee);
            contr_format.setEmployeeFields((Contracted_Employee)employee);
            contr_format.prepareForChange();
            contr_format.setVisible(true);
        }
        else if(employee instanceof Permanent_Employee){
            perm_format = new Permanent_Format(this);
            perm_format.state = Permanent_Format.State.ALTER;
            perm_format.setEmployee((Permanent_Employee)employee);
            perm_format.setEmployeeFields((Permanent_Employee)employee);
            perm_format.prepareForChange();
            perm_format.setVisible(true);
        }
    }    
    //DONE
    public void changeEmployeeLast(Employee employee, Employee new_employee){
        db_controller.change_employee(employee, new_employee);
        
        if(perm_format != null)
            perm_format.setVisible(false);
        if(contr_format != null)
            contr_format.setVisible(false);
        home.setVisible(true);
    }
    
    //DONE
    public void alterPayments(int amount, int selection){
        alter_payments.setVisible(false);
        home.setVisible(true);
        
        //paketarisma gia stelio:
        if(selection == 0 || selection == 1){ // That means we have salary alternation.
            Salary salary = new Salary();
            salary.amount = amount;
            
            db_controller.changeSalarry(salary, selection + 1);
            return;
        }
        else{
            Allowance allowance;
            if(selection == 3){
                allowance = new Library_Allowance();
                ((Library_Allowance)allowance).bonus_money = amount;
                
            }
            else if(selection == 2){
                allowance = new Research_Allowance();
                ((Research_Allowance)allowance).bonus_money = amount;
            }
            else
                allowance = null;
            
            db_controller.changeAllowance(allowance);
        }
    }
    
    //DONE
    public void new_contractClicked(Contracted_Employee employee){
        new_contract.setVisible(false);
        home.setVisible(true);
        
        //call db
        db_controller.new_contract(employee);
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    //~~~~~~~~~
    //MISC
    /*
    This handleS:
        ALTER
        FIRE
        PROMOTE
        FIND_PAYMENT
    */ //DONE
    public void searchIBanClicked(Search_IBAN.State state, Employee employee){
        search_iban.setVisible(false);
        
        switch(search_iban.state){
            case ALTER:
                employee = db_controller.find_employee(employee);
                break;
            case FIRE: //Done
                db_controller.fireEmployee((Permanent_Employee)employee);
                search_iban.setVisible(false);
                home.setVisible(true);
                
                break;
            
            case PROMOTE: //Done 
                db_controller.promoteEmployee(employee);
                search_iban.setVisible(false);
                home.setVisible(true);
                break;
            
            case FIND_PAYMENT:
                ResultSet rs;
                rs = db_controller.details_salary(employee);
                Employee_Payment_Table ept = new Employee_Payment_Table();
                ept.setVisible(true);
                ept.fillTable(rs);
                
                home.setVisible(true);
                search_iban.setVisible(false);
                break;
                
            default:
                break;
            
        }
        
    }
    
    //DONE
    public void closeAll(){
        home.setVisible(false);
        actions.setVisible(false);
        quarries.setVisible(false);
        if(contr_format != null)
        contr_format.setVisible(false);
        if(perm_format != null)
            perm_format.setVisible(false);
        if(search_iban != null)
            search_iban.setVisible(false);
        if(search_date != null)
            search_date.setVisible(false);
        if(alter_payments != null)
            alter_payments.setVisible(false);
        if(new_contract != null)
            new_contract.setVisible(false);
    }
    
    //DONE
    public void error(){
        closeAll();
        ErrorPopUp err = new ErrorPopUp(this);
        err.setVisible(true);
    }
    //DONE
    public void home(){
        closeAll();
        home.setVisible(true);
    }
    
  //~~~~~~~~~
    
   
}

