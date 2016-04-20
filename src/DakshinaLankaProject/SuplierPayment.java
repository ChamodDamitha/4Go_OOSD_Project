package DakshinaLankaProject;

public class SuplierPayment extends Payment
{
	private Supplier supplier;

    public SuplierPayment(Float amount, String payment_type, boolean isReturnedPayment, String date,Supplier supplier) {
        super(amount, payment_type, isReturnedPayment, date);
        this.supplier=supplier;
    }

    public Supplier getSupplier() {
        return supplier;
    }
    
}