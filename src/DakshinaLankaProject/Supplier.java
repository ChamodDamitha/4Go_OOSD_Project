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

    public String getSuplier_id() {
        return suplier_id;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Integer> getStockID_list() {
        return stockID_list;
    }
        

	public Supplier(int supplier_id)
	{
		
	}
        public void addStock(int stockID)
        {
            stockID_list.add(stockID);
        }
}