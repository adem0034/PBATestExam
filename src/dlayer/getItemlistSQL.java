package dlayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.ItemList;

public class getItemlistSQL {
	
	public static ArrayList<ItemList> getItemList() throws SQLException {
		
		ArrayList<ItemList> items = new ArrayList<ItemList>();
		
		String sql="select ItemName from item"; 

		Connection conn = DBConnection.getConnection();

		Statement statement = conn.createStatement();
		statement.execute(sql);

		ResultSet results = statement.getResultSet();

		String s[]=new String[1000];

		int i = 0;
		while(results.next())
		{
			s[i]=results.getString(1);
		i++;
		}  
		
		ItemList items2 = new ItemList(s);
		items.add(items2);
		
		return items;
		 
		
		
	}


}
