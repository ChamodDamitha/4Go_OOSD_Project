package DakshinaLankaProject;

public class Frame extends Item
{
	private String frame_name;
	private String showroom_id;
	private String frame_type;
        private boolean isItemRunout=true;

    public Frame(String item_id, float buying_price,  float selling_price,int stockID, String manufacturer, int amount,String showroom_id,String frame_name,String frame_type) {
        super(item_id, buying_price,  selling_price, stockID, manufacturer, amount);
        this.showroom_id=showroom_id;
        this.frame_name= frame_name;
        this.frame_type=frame_type;
    }
    ///////
    public Frame(String showroom_id)
    {
    
    }
            
    

    public String getFrame_name() {
        return frame_name;
    }

    public String getShowroom_id() {
        return showroom_id;
    }

    public String getFrame_type() {
        return frame_type;
    }

    public boolean getIsItemRunout(){
        return this.isItemRunout;
    }
    
    public void setIsItemRunout(boolean t){
        isItemRunout = t;
    }
   
	
}