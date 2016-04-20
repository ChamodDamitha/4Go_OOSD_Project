package DakshinaLankaProject;

import java.util.ArrayList;

public class Supplier
{
	private String suplier_id;
	private String name;
	private String telephone;
	private String address;
	private ArrayList<Integer> stockID_list;


    public Supplier(String name, String telephone, String address) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
    }
        

	public Supplier(int supplier_id)
	{
		
	}
        public void addStock(int stockID)
        {
            stockID_list.add(stockID);
        }
}