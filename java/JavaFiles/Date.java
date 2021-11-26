
package JavaFiles;
import java.util.Calendar;

public class Date {
    static Calendar now;
    public int day;
    public int month;
    public int year;
    
    public Date(){
       now      = Calendar.getInstance();
       //day      = now.get(Calendar.DAY_OF_MONTH);
       //month    = now.get(Calendar.MONTH) + 1;
      // year     = now.get(Calendar.YEAR);
       
       day      = now.get(Calendar.DAY_OF_MONTH);
       month    = 10;
       year     = 2024;
    }
    
}
