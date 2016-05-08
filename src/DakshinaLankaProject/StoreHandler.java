package DakshinaLankaProject;

import java.util.*;

public class StoreHandler
{
	
        private StoreDB storeDB;
	private Stock stock;

	public final void removeFromStore(int itemID)
	{
		
	}

	public final void addFramesToList(String item_id, int stockID, String manufacturer, float buying_price, float selling_price, int amount, String showroom_id,String frame_name,String frame_type)
	{
            Frame frame = new Frame(item_id, buying_price, selling_price, stockID, manufacturer,amount, "", frame_name, frame_type);
            stock.addToItemList(frame);
            stock.addToTotal(buying_price);
	}

	public void setStock(Supplier supplier, String date)
	{
            stock.setSupplier(supplier);
            stock.setStock_ID(storeDB.getNextIndex());
            stock.setDate(date);
	}
        
        public void addStock(Stock stock){
            storeDB.addToStock(stock);
        }
        
        public void addItems(){
            
        }
        
	public final void updateStock(Stock stock)
	{
		
	}

	public final boolean isItemLow(int itemID)
	{
		
	}

	public final void getStockDetails()
	{
		
	}

	public final void transferToShowroom(int itemID, int ShowroomID)
	{
		
	}

	public final void TransferToStore(int itemID)
	{
		
	}
}