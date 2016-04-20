package DakshinaLankaProject;

import java.sql.SQLException;
import java.util.*;

public class Order
{
	private int order_id;
        private String date;
	private boolean finished;
	private boolean isExpired;
        private Customer customer;
        private ArrayList<Item> items=new ArrayList<Item>();
        private ArrayList<Payment> payments=new ArrayList<Payment>();

        ///
        private OrderDB orderDB=new OrderDB();
        private CustomerSupplierDB customerDB=new CustomerSupplierDB();
        private ItemDB itemDB=new ItemDB();
        private PaymentDB paymentDB=new PaymentDB();

	public Order(Customer customer, ArrayList<Item> items
                ,String date)
	{
                this.order_id=orderDB.getNextIndex();
		this.customer=customer;
                this.order_id=order_id;
                this.items=items;
                this.date=date;
                orderDB.storeNewOrder(this);
                
	}

	public Order(int order_id) throws SQLException
	{
            this.order_id=order_id;
            this.customer=customerDB.getCustomerOfOrder(order_id);
            this.items=itemDB.getItemsOfOrder(order_id);
            this.payments=paymentDB.getPaymentsOfOrder(order_id);
            this.date=orderDB.getOrderDate(order_id);
            this.finished=orderDB.getOrderFinished(order_id);
            this.isExpired=orderDB.getOrderExpired(order_id);
	}
        ///////
        public void saveUpdatedOrder()
        {
            orderDB.updateOrder(this);
        }
        
        
	public final void addPayment(int amount, String date)
	{
		
	}

    public int getOrder_id() {
        return order_id;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public String getDate() {
        return date;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean isIsExpired() {
        return isExpired;
    }

    public void setIsExpired(boolean isExpired) {
        this.isExpired = isExpired;
    }
        
    
}