package DakshinaLankaProject;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Chamod
 */
public abstract class DBlocal {
    
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/dakshinalanka";
    static final String USER="root";
    static final String PASS="p";
    private Connection con;
    protected Statement stat;
    public DBlocal() {
        con=null;
        stat=null;
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Database access  failed");
        }
    }
    
    //connect to the database
    public void connect()
    {
        try {
            con=DriverManager.getConnection(DB_URL,USER,PASS);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database access  failed");
        }
    }
    
    //no return
    public void execute(String SQL_STAT) 
    {
        
        try {
            stat=con.createStatement();
            stat.execute(SQL_STAT);
            stat.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database access  failed");
        }
        
    }
    
    //return a result set
    public ResultSet executeQuery(String SQL_STAT)
    {
        try {
            stat=con.createStatement();
            ResultSet res=stat.executeQuery(SQL_STAT);
            //stat.close();
            return res;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database access  failed");
        }
        return null;
    }
    
    //for delete/alter functions
    public void executeUpdate(String SQL_STAT)
    {
        try {
            stat=con.createStatement();
            stat.executeUpdate(SQL_STAT);
            stat.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database access  failed");
        }
        
    }
    

}
