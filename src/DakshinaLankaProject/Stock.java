package DakshinaLankaProject;

import java.util.*;

public class Stock
{
	private Supplier supplier;
	private ArrayList<Item> items;
	private ArrayList<Payment> payments;
	private float totalValue;
	private String date;
        private int stock_ID;

    public Stock(Supplier supplier, String date, int stock_ID) {
        this.supplier = supplier;
        this.date = date;
        this.stock_ID = stock_ID;
    }
        
    
        
    public void setSupplier(Supplier supplier){
            this.supplier=supplier;
        }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public float getTotalValue() {
        return totalValue;
    }

    public String getDate() {
        return date;
    }
        
        public void addToItemList(Item item){
            items.add(item);
        }

	public final void addPayment(float amount)
	{
		
	}
        
        public void setStock_ID(int id){
            this.stock_ID=id;
            supplier.addStock(stock_ID);
        }
        
        public void addToTotal(float value){
            totalValue= totalValue + value;
        }
        
        public void setDate(String date){
            this.date = date;
        }
        
        public ArrayList<Item> getItemList(){
            return this.items;
        }

        public int getStockID(){
            return this.stock_ID;
        }
        
        public Supplier getSupplier(){
            return this.supplier;
        }
 
        
}