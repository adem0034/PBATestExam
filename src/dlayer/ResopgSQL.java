
package dlayer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.ResOpg;

 public class ResopgSQL 
 {
  // Metoden medlem(), returnerer en ArrayList af Medlem
  public static ArrayList<ResOpg> sumIncome() throws SQLException {

    //Opretter en ArrayListe kaldet medl, der indeholder Medlem objektet.
    ArrayList<ResOpg> resInc = new ArrayList<>();
       
    // sql statement
    String sql = "SELECT sum(priceNoVat) as sumIncome from invoice";
               
    // kalder vores DBConnection klasse, og metoden deri, for at forbinde med DB.
    Connection conn = DBConnection.getConnection();
    
    // opretter og execute'er sql statement objekt.
    Statement statement = conn.createStatement();
        statement.execute(sql);

        // ResultSet objektet indeholder output af data fra sql'ens statement
    ResultSet results = statement.getResultSet();
    while(results.next()) {
     
     int sumIncome = results.getInt("sumIncome");
     
     // Opretter en ny instans(objekt) af Medlem klassen og tilf�jer data til den(medl).
     ResOpg res = new ResOpg(sumIncome, 0,0,0,0,0,0,0,0);
     resInc.add(res);       
    }
    // returner ArrayListen og "lukker" vores ResultSet og Statement (frig�rer resourcer)
    results.close();
    statement.close();
    return resInc;
    
  }
  
  
  
  public static ArrayList<ResOpg> sumExpense() throws SQLException {

	    //Opretter en ArrayListe kaldet medl, der indeholder Medlem objektet.
	    ArrayList<ResOpg> resExp = new ArrayList<>();
	       
	    // sql statement
	    String sql = "SELECT SUM(IFNULL(divUdgifter, 0)) + SUM(IFNULL(IT,0)) + SUM(IFNULL(kontorartikler,0))"
	    		+ " + SUM(IFNULL(kørsel,0)) + SUM(IFNULL(reklame,0)) + "
	    		+ "SUM(IFNULL(website,0)) + SUM(IFNULL(småanskaffelser, 0)) "
	    		+ "AS sumUdgifter "
	    		+ "FROM expense;";
	               
	    // kalder vores DBConnection klasse, og metoden deri, for at forbinde med DB.
	    Connection conn = DBConnection.getConnection();
	    
	    // opretter og execute'er sql statement objekt.
	    Statement statement = conn.createStatement();
	        statement.execute(sql);

	        // ResultSet objektet indeholder output af data fra sql'ens statement
	    ResultSet results = statement.getResultSet();
	    while(results.next()) {
	     
	     double sumExp = results.getDouble("sumUdgifter");
	     
	     
	      // Opretter en ny instans(objekt) af Medlem klassen og tilf�jer data til den(medl).
	     ResOpg res = new ResOpg(0, sumExp,0,0,0,0,0,0,0);
	     resExp.add(res);       
	    }
	    
	    // returner ArrayListen og "lukker" vores ResultSet og Statement (frig�rer resourcer)
	    results.close();
	    statement.close();
	    return resExp;
	    
	  }
  
  
  
  
  
  
  
  
  public static ArrayList<ResOpg> sumGrund() throws SQLException {

	    //Opretter en ArrayListe kaldet medl, der indeholder Medlem objektet.
	    ArrayList<ResOpg> resGrund = new ArrayList<>();
	       
	    // sql statement
	    String sql = "SELECT divUdgifter, IT, kontorartikler, kørsel, reklame,"
	    		+ " website, småanskaffelser "
	    		+ "FROM expense;";
	               
	    // kalder vores DBConnection klasse, og metoden deri, for at forbinde med DB.
	    Connection conn = DBConnection.getConnection();
	    
	    // opretter og execute'er sql statement objekt.
	    Statement statement = conn.createStatement();
	        statement.execute(sql);

	        // ResultSet objektet indeholder output af data fra sql'ens statement
	    ResultSet results = statement.getResultSet();
	    while(results.next()) {
	     
	     int divUd = results.getInt("divUdgifter");
	     int IT = results.getInt("IT");
	     int kontor = results.getInt("kontorartikler");
	     int koersel = results.getInt("kørsel");
	     int reklame = results.getInt("reklame");
	     int smaa = results.getInt("småanskaffelser");
	     int web = results.getInt("website");

	     
	     // Opretter en ny instans(objekt) af Medlem klassen og tilf�jer data til den(medl).
	     ResOpg res = new ResOpg(divUd, IT, kontor, koersel, reklame, smaa, web); 
	     resGrund.add(res);       
	    }
	    // returner ArrayListen og "lukker" vores ResultSet og Statement (frig�rer resourcer)
	    results.close();
	    statement.close();
	    return resGrund;
	    
	  }
  
  
  
//  Nettoresultat
  
  
 }