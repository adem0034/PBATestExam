
package dlayer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.MomsOpg;

public class MomsSQL {
	
	// Metoden statistik() returnerer en ArrayList af Statistik
	// for regning 
	public static ArrayList<MomsOpg> moms() throws SQLException {
//		Opretter en ArrayList statistik, der indeholder Staistik objektet.
		ArrayList<MomsOpg> moms = new ArrayList<MomsOpg>();
		
		// sql statement der skal udfï¿½res
		String sql = "SELECT * FROM economy.bills";
		
		// kalder DBConnections metode - forbinder med DB.
		Connection conn = DBConnection.getConnection();
		
		// opretter og udfï¿½rer sql statement objekt.
		Statement statement = conn.createStatement();
	    statement.execute(sql);
	    
	    // ResultSet objektet indeholder output af data fra sql statement
		ResultSet results = statement.getResultSet();
				
		// kï¿½rer loop for sql statement mens der er rï¿½kker i ResultSet 
		while(results.next()) {
			int bilagNr = results.getInt("idbills");
			String supplier = results.getString("supplier");
			String category = results.getString("expenseCategory");
			String momsTypeStr = results.getString("momsType");
			String descript = results.getString("descript");
			String valuta = results.getString("currency");
			int priceNoVat = results.getInt("priceNoVat");
			boolean paid = results.getBoolean("paid");
			String date = results.getString("date");

			// Opretter et nyt objekt af Statistik og tilfï¿½jer data fra st til ArrayListen.
			MomsOpg momsOpg = new MomsOpg(bilagNr, supplier, category, momsTypeStr, descript, valuta, priceNoVat, paid, date);
			moms.add(momsOpg);
			
		}
		// returner ArrayListen statistik og lukker ResultSet og Statement (frigï¿½rer resourcer)
		results.close();
		statement.close();
		return moms;
	}
	
	
	
	
	// for kundefaktura - grundlag
	public static ArrayList<MomsOpg> faktura() throws SQLException {
//		Opretter en ArrayList statistik, der indeholder Staistik objektet.
		ArrayList<MomsOpg> faktura = new ArrayList<MomsOpg>();
		
		// sql statement der skal udfï¿½res
		String sql = "SELECT * FROM economy.invoice";
		
		// kalder DBConnections metode - forbinder med DB.
		Connection conn = DBConnection.getConnection();
		
		// opretter og udfï¿½rer sql statement objekt.
		Statement statement = conn.createStatement();
	    statement.execute(sql);
	    
	    // ResultSet objektet indeholder output af data fra sql statement
		ResultSet results = statement.getResultSet();
				
		// kï¿½rer loop for sql statement mens der er rï¿½kker i ResultSet 
		while(results.next()) {
			int idFaktura = results.getInt("idinvoice");
			String fornavn = results.getString("fName");
			String efternavn = results.getString("lName");
			String tlf = results.getString("tlf");
			String email = results.getString("email");
			String vej = results.getString("roadName");
			String postnummer = results.getString("areaCode");
			String by = results.getString("City");
			String cvr = results.getString("CVR");
			String virksomhedsnavn = results.getString("companyName");
			String kategori = results.getString("category"); 
			String beskrivelse = results.getString("descript");
			String prisEksMoms = results.getString("priceNoVat");
			int momssats = Integer.parseInt(results.getString("momsType"));  
			String dato = results.getString("date");			
			boolean paid = results.getBoolean("paid");
			 
					
			// Opretter et nyt objekt af Statistik og tilfï¿½jer data fra st til ArrayListen.
			MomsOpg momsOpg = new MomsOpg(idFaktura, fornavn, efternavn, tlf, email, vej,
					postnummer, by, cvr, virksomhedsnavn, kategori, beskrivelse, prisEksMoms, 
					momssats, dato, paid); 
			
					faktura.add(momsOpg);
			
		}
		// returner ArrayListen statistik og lukker ResultSet og Statement (frigï¿½rer resourcer)
		results.close();
		statement.close();
		return faktura;
	}
	
	
	
	
	
	// total købsmoms (indgående)
	public static ArrayList<MomsOpg> koebsMoms() throws SQLException {
//		Opretter en ArrayList statistik, der indeholder Staistik objektet.
		ArrayList<MomsOpg> moms = new ArrayList<MomsOpg>();
		
		// sql statement der skal udfï¿½res
		String sql = "SELECT SUM((momsType * priceNoVat) / 100) "
				+ "as koebsMomsSum "
				+ "FROM economy.bills;";
	
		// kalder DBConnections metode - forbinder med DB.
		Connection conn = DBConnection.getConnection();
		
		// opretter og udfï¿½rer sql statement objekt.
		Statement statement = conn.createStatement();
	    statement.execute(sql);
	    
	    // ResultSet objektet indeholder output af data fra sql statement
		ResultSet results = statement.getResultSet();
				
		// kï¿½rer loop for sql statement mens der er rï¿½kker i ResultSet 
		while(results.next()) {	
			int koebsmoms = results.getInt("koebsMomsSum");
			
			MomsOpg koebsmoms1 = new MomsOpg(koebsmoms);
			moms.add(koebsmoms1);
			
			
	
			// Opretter et nyt objekt af Statistik og tilfï¿½jer data fra st til ArrayListen.
			
		}
		// returner ArrayListen statistik og lukker ResultSet og Statement (frigï¿½rer resourcer)
		results.close();
		statement.close();
		return moms;
	}
	
	
//	salgsmoms  alt (udgående)
		public static ArrayList<MomsOpg> salgsMoms() throws SQLException {
//			Opretter en ArrayList statistik, der indeholder Staistik objektet.
			ArrayList<MomsOpg> moms = new ArrayList<MomsOpg>();
			 
			// sql statement der skal udfï¿½res
			String sql = "SELECT SUM((momsType * priceNoVat) / 100) as salgsMoms FROM economy.invoice";
			

			// kalder DBConnections metode - forbinder med DB.
			Connection conn = DBConnection.getConnection();
			
			// opretter og udfï¿½rer sql statement objekt.
			Statement statement = conn.createStatement();
		    statement.execute(sql);
		    
		    // ResultSet objektet indeholder output af data fra sql statement
			ResultSet results = statement.getResultSet();
					
			// kï¿½rer loop for sql statement mens der er rï¿½kker i ResultSet 
			while(results.next()) {
				int salgsMoms = results.getInt("salgsMoms");
				
				MomsOpg salgsMoms1 = new MomsOpg(salgsMoms, salgsMoms);
				moms.add(salgsMoms1);
				
				
		
				// Opretter et nyt objekt af Statistik og tilfï¿½jer data fra st til ArrayListen.
				
			}
			// returner ArrayListen statistik og lukker ResultSet og Statement (frigï¿½rer resourcer)
			results.close();
			statement.close();
			return moms;
		}
	
		
		
		
//		Varer købt i udlandet - få fat i momsen
		public static ArrayList<MomsOpg> momsVareUdland() throws SQLException {
//			Opretter en ArrayList statistik, der indeholder Staistik objektet.
			ArrayList<MomsOpg> moms = new ArrayList<MomsOpg>();
			 
			// sql statement der skal udfï¿½res
			String sql = "SELECT sum(1220_købVarerEU * 25 / 100) as vareUdlandMoms "
					+ "FROM economy.1200_salgsomkostninger;";
			

			// kalder DBConnections metode - forbinder med DB.
			Connection conn = DBConnection.getConnection();
			
			// opretter og udfï¿½rer sql statement objekt.
			Statement statement = conn.createStatement();
		    statement.execute(sql);
		    
		    // ResultSet objektet indeholder output af data fra sql statement
			ResultSet results = statement.getResultSet();
					
			// kï¿½rer loop for sql statement mens der er rï¿½kker i ResultSet 
			while(results.next()) {
				int vareUdlandM = results.getInt("vareUdlandMoms");
				
				MomsOpg vareUdland = new MomsOpg(vareUdlandM,vareUdlandM,vareUdlandM);
				moms.add(vareUdland);
				
				
		
				// Opretter et nyt objekt af Statistik og tilfï¿½jer data fra st til ArrayListen.
				
			}
			// returner ArrayListen statistik og lukker ResultSet og Statement (frigï¿½rer resourcer)
			results.close();
			statement.close();
			return moms;
		}
	
	
		
		
		
//		// Ydelser købt i udlandet - få fat i momsen
		public static ArrayList<MomsOpg> momsYdelseUdland() throws SQLException {
//			Opretter en ArrayList statistik, der indeholder Staistik objektet.
			ArrayList<MomsOpg> moms = new ArrayList<MomsOpg>();
			 
			// sql statement der skal udfï¿½res
			String sql = "SELECT sum(1230_købYdelserEU * 25 / 100)  "
					+ "as ydelseUdlandMoms "
					+ "FROM `economy`.`1200_salgsomkostninger`;";
			

			// kalder DBConnections metode - forbinder med DB.
			Connection conn = DBConnection.getConnection();
			
			// opretter og udfï¿½rer sql statement objekt.
			Statement statement = conn.createStatement();
		    statement.execute(sql);
		    
		    // ResultSet objektet indeholder output af data fra sql statement
			ResultSet results = statement.getResultSet();
					
			// kï¿½rer loop for sql statement mens der er rï¿½kker i ResultSet 
			while(results.next()) {
				int ydelseUdlandMoms = results.getInt("ydelseUdlandMoms");
				
				MomsOpg ydelseUdland = new MomsOpg(ydelseUdlandMoms,ydelseUdlandMoms,ydelseUdlandMoms,ydelseUdlandMoms);
				moms.add(ydelseUdland);
				
				
		
				// Opretter et nyt objekt af Statistik og tilfï¿½jer data fra st til ArrayListen.
				
			}
			// returner ArrayListen statistik og lukker ResultSet og Statement (frigï¿½rer resourcer)
			results.close();
			statement.close();
			return moms;
		}
	
		
		
		
		// Rubrik A Varer
				public static ArrayList<MomsOpg> rubAVarer() throws SQLException {
//					Opretter en ArrayList statistik, der indeholder Staistik objektet.
					ArrayList<MomsOpg> rubA = new ArrayList<MomsOpg>();
					 
					// sql statement der skal udfï¿½res
					String sql = "SELECT sum(1220_købVarerEU) as sum "
							+ "FROM economy.1200_salgsomkostninger;";
					

					// kalder DBConnections metode - forbinder med DB.
					Connection conn = DBConnection.getConnection();
					
					// opretter og udfï¿½rer sql statement objekt.
					Statement statement = conn.createStatement();
				    statement.execute(sql);
				    
				    // ResultSet objektet indeholder output af data fra sql statement
					ResultSet results = statement.getResultSet();
							
					// kï¿½rer loop for sql statement mens der er rï¿½kker i ResultSet 
					while(results.next()) {
						int rub = results.getInt("sum");
						
						MomsOpg rubAVarer = new MomsOpg(rub, rub, rub, rub, rub);
						rubA.add(rubAVarer);
						
						
				
						// Opretter et nyt objekt af Statistik og tilfï¿½jer data fra st til ArrayListen.
						
					}
					// returner ArrayListen statistik og lukker ResultSet og Statement (frigï¿½rer resourcer)
					results.close();
					statement.close();
					return rubA;
				}
				
				// Rubrik A ydelser
				public static ArrayList<MomsOpg> rubAYdelser() throws SQLException {
//					Opretter en ArrayList statistik, der indeholder Staistik objektet.
					ArrayList<MomsOpg> rubA = new ArrayList<MomsOpg>();
					 
					// sql statement der skal udfï¿½res
					String sql = "SELECT sum(1230_købYdelserEU) AS SUM "
							+ "FROM economy.1200_salgsomkostninger;";
					

					// kalder DBConnections metode - forbinder med DB.
					Connection conn = DBConnection.getConnection();
					
					// opretter og udfï¿½rer sql statement objekt.
					Statement statement = conn.createStatement();
				    statement.execute(sql);
				    
				    // ResultSet objektet indeholder output af data fra sql statement
					ResultSet results = statement.getResultSet();
							
					// kï¿½rer loop for sql statement mens der er rï¿½kker i ResultSet 
					while(results.next()) {
						int rub = results.getInt("SUM");
						
						MomsOpg rubAYdelser = new MomsOpg(rub, rub, rub, rub, rub, rub);
						rubA.add(rubAYdelser);
						
						
										
					}
					// returner ArrayListen statistik og lukker ResultSet og Statement (frigï¿½rer resourcer)
					results.close();
					statement.close();
					return rubA;
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
