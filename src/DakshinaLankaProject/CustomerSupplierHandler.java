package DakshinaLankaProject;

public class CustomerSupplierHandler
{
        private Customer customer;
	private CustomerSupplierDB customerSupplierDB;

	public final void addCustomer(String name, String address, String telephone)
	{
		
	}

	public final void addSupplier(String name, String address, String telephone)
	{

	}
        
        //connect to order GUI
        public void addOrder()
        {
            new OrderHandler(customer);
        }
}