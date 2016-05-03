package DakshinaLankaProject;

import java.util.*;

public class Stock
{
	private Supplier suplier;
	private ArrayList<Item> items;
	private ArrayList<Payment> payments;
	private float totalValue;
	private String date;
        private int stock_ID;
        
	public void setSupplier(Supplier supplier){
            this.suplier=supplier;
        }
        
        public void addToItemList(Item item){
            items.add(item);
        }

	public final void addPayment(float amount)
	{
		
	}
        
        public void setStock_ID(int id){
            this.stock_ID=id;
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

   
        
}