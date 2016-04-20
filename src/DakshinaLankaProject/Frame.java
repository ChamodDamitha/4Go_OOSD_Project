package DakshinaLankaProject;

public class Frame extends Item
{
	private String frame_name;
	private String showroom_id;
	private String frame_type;

    public Frame(float buying_price, String item_id, float selling_price, Supplier supplier, String manufacturer, int amount,String showroom_id,String frame_name,String frame_type) {
        super(buying_price, item_id, selling_price, supplier, manufacturer, amount);
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

   
	
}