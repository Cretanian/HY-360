/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFiles;

/**
 *&
 * @author User
 */
public class Controller {
    public static void main(String args[])
    {
        DB_Controller       db_Controller = new DB_Controller();
        View_Controller     view_Controller = new View_Controller(db_Controller);
        
        db_Controller.initialize(view_Controller);
        
        try{
            view_Controller.Start();
        }
        catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
