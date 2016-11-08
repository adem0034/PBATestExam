/*
 * Opretter forbindelse til DB. 
 */
package dlayer;


import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection 
{
	// Stien, brugernavn og evt. kode indtastes mht. DB
	static String user = "root";
	public static  String pass = "186549";
	private static String db = "economy";
	protected static String url = "jdbc:mysql://localhost/";
	
	
	// Metode der forbinder med DB. De overst�ende fields bruges til at oprette forbindelse med DB.
	public static Connection getConnection() 
	{
		Connection conn;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(url+db, user, pass);
			return conn;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}



///*
// * Opretter forbindelse til DB. 
// */
//package dlayer;
//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//
//public class DBConnection 
//{
//	// Stien, brugernavn og evt. kode indtastes mht. DB
//	static String user = "ademphotography.dk.mysql";
//	public static  String pass = "010112085";
//	private static String db = "ademphotography_dk_financesjava";
////	protected static String url = "jdbc:mysql://10.27.2.48:3306";
//	protected static String url = "jdbc:mysql://ademphotography.dk.mysql";
//
//	
//	
//
//
//	// Metode der forbinder med DB. De overstï¿½ende fields bruges til at oprette forbindelse med DB.
//	public static Connection getConnection() 
//	{
//		Connection conn;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			conn = (Connection) DriverManager.getConnection(url+"/"+db, user, pass);
//			
//			return conn;
//		} catch(Exception e) {
//			e.printStackTrace();
//			
//			return null;
//		}
//	}
//}
