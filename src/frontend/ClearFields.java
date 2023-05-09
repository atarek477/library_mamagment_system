package frontend;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author Mariam Mohamed
 */
public class ClearFields {
    public static void clearFields (JTextField...textFields)
    {
         for(JTextField jflds: textFields)
             jflds.setText("");
    }
    
    
   
    /*
     public static void clearFields (   List<JTextField> textFields)
    {
         for(JTextField jflds: textFields)
             jflds.setText("");
    }
    Another implmentation
    to call this implmentation -->ClearFields.clearFields( Arrays.asList(jTextField1,jPasswordField1));    
    */
}
