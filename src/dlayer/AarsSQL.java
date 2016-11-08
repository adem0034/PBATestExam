/*
 * Forbindelse mellem SpillerStatistikGui, Statistik og DB.
 * gï¿½r det muligt at vise spiller statistik 
 * Gï¿½r det muligt at opdatere statistik (mï¿½l, kort, idspiller)
 * 
 */
package dlayer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.AarsOpg;
import model.MomsOpg;

public class AarsSQL {
	
	// Metoden statistik() returnerer en ArrayList af Statistik
	public static ArrayList<AarsOpg> res() throws SQLException {
//		Opretter en ArrayList statistik, der indeholder Staistik objektet.
		ArrayList<AarsOpg> res = new ArrayList<AarsOpg>();
		
		// sql statement der skal udfï¿½res
		String sql = "SELECT IFNULL(SUM(invoice.priceNoVat/2),0) AS r320,"
				+ "IFNULL(SUM(reklame),0) AS r323,"
				+ "(IFNULL(SUM(divUdgifter), 0) * -1) + (IFNULL(SUM(IT), 0)* -1) + "
				+ "(IFNULL(SUM(kontorartikler), 0) * -1) + (IFNULL(SUM(reklame), 0)* -1) + "
				+ "(IFNULL(SUM(website), 0) * -1) + "
				+ "(IFNULL(SUM(småanskaffelser), 0)* -1) - (ialtEksklMoms * -1) AS r325, "
				+ "(IFNULL(SUM(divUdgifter), 0) * -1) + (IFNULL(SUM(IT), 0)* -1) + "
				+ "(IFNULL(SUM(kontorartikler), 0) * -1) + (IFNULL(SUM(reklame), 0)* -1) + "
				+ "(IFNULL(SUM(website), 0) * -1) + (IFNULL(SUM(småanskaffelser), 0)* -1) + ialtEksklMoms "
				+ "AS r327, IFNULL(SUM(småanskaffelser),0) as r330, IFNULL(SUM(småanskaffelser),0) as r331,"
				+ "IFNULL(SUM(småanskaffelser),0) as r332, IFNULL(SUM(småanskaffelser),0) as r333, "
				+ "IFNULL(SUM(småanskaffelser),0) as r356 "
				+ "FROM invoice "
				+ "JOIN expense;";
		
		// kalder DBConnections metode - forbinder med DB.
		Connection conn = DBConnection.getConnection();
		
		// opretter og udfï¿½rer sql statement objekt.
		Statement statement = conn.createStatement();
	    statement.execute(sql);
	    
	    // ResultSet objektet indeholder output af data fra sql statement
		ResultSet results = statement.getResultSet();
				
		// kï¿½rer loop for sql statement mens der er rï¿½kker i ResultSet 
		while(results.next()) {
			int r320 = results.getInt("r320");
			int r323 = results.getInt("r323");
			int r325 = results.getInt("r325");
			int r327 = results.getInt("r327");
			int r330 = results.getInt("r330");
			int r331 = results.getInt("r331");
			int r332 = results.getInt("r332");
			int r333 = results.getInt("r333");
			int r356 = results.getInt("r356");
		
			// Opretter et nyt objekt af Statistik og tilfï¿½jer data fra st til ArrayListen.
			AarsOpg aarsOpg = new AarsOpg(r320, r323, r325, r327, r330, r331, r332,r333, r356);
			res.add(aarsOpg);
			
		}
		// returner ArrayListen statistik og lukker ResultSet og Statement (frigï¿½rer resourcer)
		results.close();
		statement.close();
		return res;
	}
	
	
	
	
	
	
	
	

	
	
	
			// metode der opdaterer et medlems statistik
//	public static void updateStatistik(int idSpiller, int mÃ¥l, int rødt_kort, int gult_kort){
//		try  {
//			// kalder DBConnections metode - forbinder med DB.
//	 		Connection conn = DBConnection.getConnection();
//	 	   
//	 	// opretter og udfï¿½rer sql statement objekt.
//	 	 PreparedStatement prepareStatement = 
//	 			 conn.prepareStatement("UPDATE spillerstatistik SET mÃ¥l=?, rÃ¸dt_kort=?, gult_kort=? "
//	 			 		+ "WHERE idspillerstatistik=?;");              
//
//	 	 // Tilfï¿½jer til DB, efter den fï¿½r vï¿½rdierne fra StatistikGui's TabelModel
//	      prepareStatement.setInt(1, mÃ¥l);
//	      prepareStatement.setInt(2, rødt_kort);
//	      prepareStatement.setInt(3, gult_kort);
//	      prepareStatement.setInt(4, idSpiller);
//	      prepareStatement.executeUpdate();
//	      
//	         }
//	   catch (SQLException e)
//	   {
//	    System.err.println(e);
//	   }
//	}
}
