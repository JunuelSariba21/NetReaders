
package Testing;

import com.mysql.cj.jdbc.Driver;
import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseTest1 {
    public static void main(String[] args) {
        
    }
    void createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con;
            con = Driver.getPlatform("jbdc:mysql://localhost:3306/mydb");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseTest1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
