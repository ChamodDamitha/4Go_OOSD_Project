package DakshinaLankaProject;

import java.util.ArrayList;

public class Payment
{
	private Float amount;
	private String payment_type;
	private boolean isReturnedPayment;
	private String date;
        
        ////
        private PaymentDB paymentDB=new PaymentDB();

    public Payment(Float amount, String payment_type, boolean isReturnedPayment, String date) {
        this.amount = amount;
        this.payment_type = payment_type;
        this.isReturnedPayment = isReturnedPayment;
        this.date = date;
        
     
    }
    
    ////
    public ArrayList<Payment> getPaymentsOfOrder(int order_id)
    {
    
    }

    public Float getAmount() {
        return amount;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public boolean isIsReturnedPayment() {
        return isReturnedPayment;
    }

    public String getDate() {
        return date;
    }
        
        
}