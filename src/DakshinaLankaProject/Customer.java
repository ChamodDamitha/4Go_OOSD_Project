package DakshinaLankaProject;

import java.util.*;

public class Customer
{
	private String name;
	private String address;
	private String telephone;
	private ArrayList<String> order_ID_list;
	private int customer_id;
        
        ///
        private CustomerSupplierDB customerDB=new CustomerSupplierDB();

	public Customer( String name, String address, String telephone)
	{
		
	}

	public Customer(int customer_id)
	{
		

	}

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
    
    public void addOrder(String order_id)
    {
        order_ID_list.add(order_id);
    }
    
        
}