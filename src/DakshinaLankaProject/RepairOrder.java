package DakshinaLankaProject;

import java.util.ArrayList;

public class RepairOrder extends Order
{
	private String description;

    public RepairOrder( int order_id,Customer customer, ArrayList<Item> items,
            String date,String description) {
        super( order_id,customer, items, date);
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}