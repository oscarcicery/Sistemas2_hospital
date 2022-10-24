
package conexionDB;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectarDB {
    Connection con= null;
    
    public  Connection conexion(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String server ="jdbc:mysql://localhost:3306/DBhospital?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user ="root";
            String pass ="12345";
            
            con=DriverManager.getConnection(server,  user,  pass);
            
            
            return  con;
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            e.getStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
        
    }
}
