package DakshinaLankaProject;

public class Item
{
	private float buying_price;
	private String item_id;
	private float selling_price;
	private int stockID;
	private String manufacturer;
	private int amount;

    public Item(String item_id, float buying_price,  float selling_price,int stockID,String manufacturer, int amount) {
        this.buying_price = buying_price;
        this.item_id = item_id;
        this.selling_price = selling_price;
        this.stockID = stockID;
        this.manufacturer = manufacturer;
        this.amount = amount;
    }

    public float getBuying_price() {
        return buying_price;
    }

    public String getItem_id() {
        return item_id;
    }

    public float getSelling_price() {
        return selling_price;
    }

    public int getStockID(){
        return stockID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getAmount() {
        return amount;
    }
        
    
        
}