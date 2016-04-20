package DakshinaLankaProject;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class OrderDB extends DBlocal
{
    ResultSet res;
    
        public int getNextIndex() 
	{
        try {
            this.connect();
            String SQL="SELECT MAX(Order_id) FROM Orders;";
            res=this.executeQuery(SQL);
            res.next();
            return Integer.valueOf(res.getString("MAX(Order_id)"))+1;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Database access  failed");
        }
        return 0;
	}
        //////
	public void storeNewOrder(Order order)
	{
		this.connect();
                String SQL="INSERT INTO Orders(startdate,finished,expired,Customer_id) VALUES('"
                        + order.getDate()+"',"+MathClass.intBool(order.isFinished())+","
                        +MathClass.intBool(order.isIsExpired())+","
                        +order.getCustomer().getCustomer_id()+");";
            this.execute(SQL);
          
        }
        
	public void storeRepairOrder(RepairOrder repairOrder)
	{
		
	}
        ////////////
        public String getOrderDate(int order_id) throws SQLException
        {
            this.connect();
            String SQL="SELECT startdate FROM Orders WHERE Order_id="+order_id+";";
            res=this.executeQuery(SQL);
            res.next();
            return res.getString("startdate");
        }
        public boolean getOrderFinished(int order_id) throws SQLException
        {
            this.connect();
            String SQL="SELECT finished FROM Orders WHERE Order_id="+order_id+";";
            res=this.executeQuery(SQL);
            res.next();
            return MathClass.boolInt(Integer.parseInt(res.getString("finshed")));
        }
        public boolean getOrderExpired(int order_id) throws SQLException
        {
            this.connect();
            String SQL="SELECT expired FROM Orders WHERE Order_id="+order_id+";";
            res=this.executeQuery(SQL);
            res.next();
            return MathClass.boolInt(Integer.parseInt(res.getString("expired")));
        }
        ///////////////////////////
        public void updateOrder(Order order) 
        {
            this.connect();
            String SQL="UPDATE Orders SET startdate="+order.getDate()+",finished="
                    +MathClass.intBool(order.isFinished())+",expired="
                    +MathClass.intBool(order.isIsExpired())+",Customer_id="+
                    order.getCustomer().getCustomer_id()+" WHERE Order_id="+
                    order.getOrder_id()+";";
            this.execute(SQL);
            
        }
        
}