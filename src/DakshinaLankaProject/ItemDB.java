

package DakshinaLankaProject;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ItemDB extends DBlocal{
    
    ResultSet res;
    ///
    public ArrayList<Item> getItemsOfOrder(int order_id)
    {
    
    }
    
    public void addFrame(Frame frame,int stockID){
            this.connect();
            String sql;
            sql = "INSERT INTO Frames(ID,buying_price,selling_price,stockID, manufacturer,amount,showroomID,frame_name"
                  + ",frame_type,isItemLow VALUES('"
                  +frame.getItem_id()+"',"+frame.getBuying_price()+","+frame.getSelling_price()+","+stockID+",'"
                  +frame.getManufacturer()+"',"+frame.getAmount()+",'"+frame.getShowroom_id()+"','"+frame.getFrame_name()+"','"
                  +frame.getFrame_type()+"',"+MathClass.intBool(frame.getIsItemRunout())+");";
            this.execute(sql);
        }
        
        public void updateFrame(String frameID,float newBPrice,float newSPrice,int newAmount){
            this.connect();
            String SQL="UPDATE Frames SET buying_price="+newBPrice+",selling_price="
                    +newSPrice+",amount="
                    +newAmount+" WHERE Order_id="+
                    frameID+";";
            this.execute(SQL);
        }
        
        public Frame getFrame(String frameID){
           try{
            //connect to database
            this.connect();
            String SQL="SELECT * FROM Frames WHERE ID="+frameID+";";
            res=this.executeQuery(SQL);
            res.next();
            
           
            Frame frame = new Frame(frameID,Float.parseFloat(res.getString("buying_price")),Float.parseFloat(res.getString("selling_price")),Integer.parseInt(res.getString("stockID")),res.getString("manufacturer"),Integer.parseInt(res.getString("amount")),res.getString("shoeroomID"),res.getString("frame_name"),res.getString("frame_type"));
            frame.setIsItemRunout(MathClass.boolInt(Integer.parseInt(res.getString("isItemLow"))));
            return frame;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Database access failed..!");
                return null;
            } 
        }
    
}
