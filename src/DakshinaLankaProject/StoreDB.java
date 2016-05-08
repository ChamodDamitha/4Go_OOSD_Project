package DakshinaLankaProject;

import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;



public class StoreDB extends DBlocal
{
        ResultSet res;
        
	public final ArrayList<Item> checkAvailability(String item_id)
	{
		
	}

	public final void removeStock(Stock stock)
	{
		
	}
        
        public int getNextIndex(){
            try {
            this.connect();
            String SQL="SELECT MAX(ID) FROM Stocks;";
            res=this.executeQuery(SQL);
            res.next();
            return Integer.valueOf(res.getString("MAX(ID)"))+1;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Database access  failed");
        }
        return 0;
        }

	public final void addToReturenStock(Stock stock)
	{
            
	}

	public final void addToStock(Stock stock)
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