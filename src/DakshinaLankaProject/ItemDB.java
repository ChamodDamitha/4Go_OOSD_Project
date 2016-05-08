

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
            
            //create order object ID,buying_price,selling_price,stockID, manufacturer,amount,showroomID,frame_name"
                  //+ ",frame_type,isItemLow
            //String item_id, float buying_price,  float selling_price, Supplier supplier, String manufacturer, int amount,String showroom_id,String frame_name,String frame_type
            Frame frame = new Frame(ID,res.getString("buying_price"),res.getString(selling_price),)
            
            order.setPayments(paymentDB.getPaymentsOfOrder(order_id));
            order.setFinished(MathClass.boolInt(Integer.parseInt(res.getString("finshed"))));
            order.setIsExpired(MathClass.boolInt(Integer.parseInt(res.getString("expired"))));
            return order;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Database access failed..!");
                return null;
            } 
        }
    
}
