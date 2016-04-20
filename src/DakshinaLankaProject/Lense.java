package DakshinaLankaProject;

public class Lense extends Item
{
	private String lense_type;
	private String cyl;
	private int axis;
	private String sph;
	private String lense_side;

    public Lense(float buying_price, String item_id, float selling_price, Supplier supplier, String manufacturer, int amount,String lense_type,String cyl,int axis,String sph,String lense_side) {
        super(buying_price, item_id, selling_price, supplier, manufacturer, amount);
        this.lense_type=lense_type;
        this.cyl=cyl;
        this.axis=axis;
        this.sph=sph;
        this.lense_side=lense_side;
    }
    //////
    public Lense(String lenseCode)
    {
        
    }

    public String getLense_type() {
        return lense_type;
    }

    public String getCyl() {
        return cyl;
    }

    public int getAxis() {
        return axis;
    }

    public String getSph() {
        return sph;
    }

    public String getLense_side() {
        return lense_side;
    }
    
}