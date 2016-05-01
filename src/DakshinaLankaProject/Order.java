package DakshinaLankaProject;


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
     
	public Order(int order_id,Customer customer, ArrayList<Item> items
                ,String date)
	{
                this.order_id=order_id;
		this.customer=customer;
                this.order_id=order_id;
                this.items=items;
                this.date=date;
                
	}

    public int getOrder_id() {
        return order_id;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
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