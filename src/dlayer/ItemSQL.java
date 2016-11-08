package dlayer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Item;


public class ItemSQL {

	// Metoden statistik() returnerer en ArrayList af Statistik
	// for regning 
	public static ArrayList<Item> products() throws SQLException {
		//		Opretter en ArrayList statistik, der indeholder Staistik objektet.
		ArrayList<Item> products = new ArrayList<Item>();

		// sql statement der skal udf�res
		String sql = "SELECT * FROM economy.item";

		// kalder DBConnections metode - forbinder med DB.
		Connection conn = DBConnection.getConnection();

		// opretter og udf�rer sql statement objekt.
		Statement statement = conn.createStatement();
		statement.execute(sql);

		// ResultSet objektet indeholder output af data fra sql statement
		ResultSet results = statement.getResultSet();

		// k�rer loop for sql statement mens der er r�kker i ResultSet 
		while(results.next()) {
//			int itemID = results.getInt("itemID");
//			String itemName = results.getString("itemName");
			String itemDescript = results.getString("itemDescript");
//			int itemPrice = results.getInt("itemPrice");

			
			// Opretter et nyt objekt af Statistik og tilf�jer data fra st til ArrayListen.
//			Item item = new Item(itemID, itemName, itemDescript, itemPrice);
			Item item = new Item(itemDescript);
			products.add(item);
 
		}
		// returner ArrayListen statistik og lukker ResultSet og Statement (frig�rer resourcer)
		results.close();
		statement.close();
		return products;
	}
}