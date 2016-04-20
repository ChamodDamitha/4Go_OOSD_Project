package DakshinaLankaProject;

import java.util.ArrayList;

public class Item extends ItemCategory
{
    private final int amount = 1;
    ////
    private ItemDB itemDB=new ItemDB();

    public Item(String item_id,float buying_price, float selling_price, Supplier supplier, String manufacturer, int amount) {
        super(buying_price, item_id, selling_price, supplier, manufacturer, amount);
    }
    
    public ArrayList<Item> getItemsOfOrder(int order_id)
    {
    
    }
}