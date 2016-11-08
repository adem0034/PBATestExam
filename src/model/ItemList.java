package model;

public class ItemList {
	
	String itemID;
	String itemName;
	String[] itemName2;
	String itemDesc;
	int itemPrice;
	
	
	public ItemList(String itemID, String itemName, String itemDesc, int itemPrice) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.itemPrice = itemPrice;
	}


	public ItemList(String[] str) {
		// TODO Auto-generated constructor stub
		this.itemName2 = str;
	}


	
	
	
	

}
