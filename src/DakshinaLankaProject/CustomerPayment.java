package DakshinaLankaProject;

public class CustomerPayment extends Payment
{
	private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
        
}