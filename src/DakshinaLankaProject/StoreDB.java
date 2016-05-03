package DakshinaLankaProject;

import java.util.*;
import java.sql.*;

public class StoreDB extends DBlocal
{
	public final ArrayList<Item> checkAvailability(String item_id)
	{
		
	}

	public final void removeStock(Stock stock)
	{
		
	}

	public final void addToReturenStock(Stock stock)
	{
            Frame frame;
            String sql;
            ArrayList<Item> itemList = stock.getItemList();
            this.connect();
            for(int i=0;i<itemList.size();i++){
                frame = (Frame) itemList.get(i);
                sql = "INSERT INTO Frames(ID,buying_price,selling_price,stockID, manufacturer,amount,showroomID,frame_name"
                        + ",frame_type,isItemLow VALUES('"
                        +frame.getItem_id()+"',"+frame.getBuying_price()+","+frame.getSelling_price()+","+stock.getStockID()+",'"
                        +frame.getManufacturer()+"',"+frame.getAmount()+",'"+frame.getShowroom_id()+"','"+frame.getFrame_name()+"','"
                        +frame.getFrame_type()+"',"+MathClass.intBool(frame.getIsItemRunout())+");";
                this.execute(sql);
            }
            sql = "INSERT INTO Stocks(ID,supplierID,totalValue) VALUES("+stock.getStockID()+",'"+stock.getSupplier().getSuplier_id()+"',"
                  +","+stock.getTotalValue()+");";
            this.execute(sql);
	}

	public final void addToStock(Stock stock)
	{
		
	}

	public final int getNextStoreIndex()
	{
		
	}

	public final void addToLowItems(int itemID)
	{
		
	}

	public final void transferToShowroom(int itemID, int showroomID)
	{
		
	}

	public final int getNextShowroomIndex()
	{
		
	}

	public final void trnsferToStore(int ShowroomID)
	{
		
	}
}