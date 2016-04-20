package DakshinaLankaProject;

import java.sql.SQLException;
import java.util.*;

public class OrderHandler
{
	//private OrderDB orderDB;
	private ArrayList<Item> items;
	private Order order;
	//private CustomerSupplierDB customerSupplierDB;

        //////////////how to set date?
	public final void addOrder(int customerID, String frameShowroomID, 
                String lenseCodeL, String lenseCodeR) throws SQLException
	{
		Frame frame=new Frame(frameShowroomID);
                Lense lenseL=new Lense(lenseCodeL);
                Lense lenseR=new Lense(lenseCodeR);
                items=new ArrayList<>();
                items.add(frame);
                items.add(lenseL);
                items.add(lenseR);
                order=new Order( new Customer(customerID), items, "2016-04-14");
                //orderDB.storeNewOrder(order);
	}

	public ArrayList<Item> checkAvailability(String showroom_id)
	{
		
	}
///////////////////////////////
	public Order getOrder(int order_id) throws SQLException
        {
            return new Order(order_id);
        }
        
        public void updateOrder(Order order)
        {
            order.saveUpdatedOrder();
        }

	public final void addRepairOrder(String customerID, String description)
	{
		

	}
/*
	public final void completeOrder(int orderID)
	{
            
	}
  */      
}