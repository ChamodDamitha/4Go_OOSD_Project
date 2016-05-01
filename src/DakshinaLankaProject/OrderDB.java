package DakshinaLankaProject;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class OrderDB extends DBlocal
{
    ResultSet res;
    //DB handlers
    private CustomerSupplierDB customerDB=new CustomerSupplierDB();
    private ItemDB itemDB=new ItemDB();
    private PaymentDB paymentDB=new PaymentDB();
    
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
        
        
        //update a saved order
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
        //load a saved order
        public Order getOrder(int order_id)
        {
            try{
            //connect to database
            this.connect();
            String SQL="SELECT * FROM Orders WHERE Order_id="+order_id+";";
            res=this.executeQuery(SQL);
            res.next();
            
            //create order object
            Order order=new Order(order_id, customerDB.getCustomerOfOrder(order_id),
            itemDB.getItemsOfOrder(order_id), res.getString("startdate"));
            
            order.setPayments(paymentDB.getPaymentsOfOrder(order_id));
            order.setFinished(MathClass.boolInt(Integer.parseInt(res.getString("finshed"))));
            order.setIsExpired(MathClass.boolInt(Integer.parseInt(res.getString("expired"))));
            return order;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Database access failed..!");
                return null;
            }
            
        }
        
}