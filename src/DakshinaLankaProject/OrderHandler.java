package DakshinaLankaProject;

import java.util.*;

public class OrderHandler
{
	private ArrayList<Item> items;
	private Order order;
        private Customer customer;
        private OrderDB orderDB=new OrderDB();
        
        //when comming through Customer Handler
        public OrderHandler(Customer customer) {
            this.customer=customer;
            new OrderGUI(this).setVisible(true);
        }
        
        //When directly comes to OrderGUI
        public OrderHandler(int order_id) {
            loadOrder(order_id);
            //new OrderGUI(order).setVisible(true);
        }
        
        
        
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
	public void loadOrder(int order_id)
        {
            this.order=orderDB.getOrder(order_id);
        }
        
        public void updateOrder(Order order)
        {
            orderDB.updateOrder(order);
        }

	public final void addRepairOrder(String customerID, String description)
	{
		

	}

}