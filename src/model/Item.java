package model;


public class Item
{
	
	private int itemID;
	private String itemName;
	private String itemDescript;
	private int itemPrice;

	public Item(int itemID, String itemName, String itemDescript, int itemPrice) {
		
		super();

		this.itemID = itemID;
		this.itemName = itemName;
		this.itemDescript = itemDescript;
		this.itemPrice = itemPrice;
	
	}
	
	public Item(String itemDescript) {
		
		super();
		
		this.itemDescript = itemDescript;
		
	}
	
	
	
	
	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescript() {
		return itemDescript;
	}

	public void setItemDescript(String itemDescript) {
		this.itemDescript = itemDescript;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	




//
//	public Object[] toObjectArray2() {
//		Object[] array = new Object[1];
//		array[0] = this.koebsmoms;
//		return array;
//
//	}

	
	
	



	
	
	
}