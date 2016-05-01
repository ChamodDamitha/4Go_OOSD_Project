package DakshinaLankaProject;

import java.util.*;

public class OrderHandler
{
	private ArrayList<Item> items;
	private Order order;
        private OrderDB orderDB=new OrderDB();
        
        
        //////////////how to set date?
	public final void addOrder(int customerID, String frameShowroomID, 
                String lenseCodeL, String lenseCodeR)
	{
		Frame frame=new Frame(frameShowroomID);
                Lense lenseL=new Lense(lenseCodeL);
                Lense lenseR=new Lense(lenseCodeR);
                items=new ArrayList<>();
                items.add(frame);
                items.add(lenseL);
                items.add(lenseR);
                order=new Order(orderDB.getNextIndex(), new Customer(customerID), items, "2016-04-14");
                orderDB.storeNewOrder(order);
	}
        /*must be in item handler
	public ArrayList<Item> checkAvailability(String showroom_id)
	{
		
	}
        */
	public Order getOrder(int order_id)
        {
            return orderDB.getOrder(order_id);
        }
        
        public void updateOrder(Order order)
        {
            orderDB.updateOrder(order);
        }

	public final void addRepairOrder(String customerID, String description)
	{
		

	}

}