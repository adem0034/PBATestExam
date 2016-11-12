package dlayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegningSQL
{

	//	Salgsomkostninger
	public static void addRegning(String supplier, String category, int momsType, String currency,
			String descript, int priceNoVat, boolean paid, String date) throws SQLException 
	{

		try  { 
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;
			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`bills` "
					+ "(`supplier`, `expenseCategory`, `momsType`, `descript`, "
					+ "`currency`, `priceNoVat`, `paid`, `date`)"
					+ "VALUES(?,?,?,?,?,?,?,?)");              




			// Tilfæjer til DB med værdierne fra RegningGUI
			prepareStatement.setString(1, supplier );
			prepareStatement.setString(2, category );
			prepareStatement.setInt(3, momsType);
			prepareStatement.setString(4, descript);
			prepareStatement.setString(5, currency);
			prepareStatement.setInt(6, priceNoVat);
			prepareStatement.setBoolean(7, paid);
			prepareStatement.setString(8, date);



			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}



	public static void add1210VareIndkoeb(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO economy.1200_salgsomkostninger "
					+ "(1210_vareindkæb) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1220KoebVarerEU(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO economy.1200_salgsomkostninger "
					+ "(1220_kæbVarerEU) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1230KoebYdelseEU(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO economy.1200_salgsomkostninger"
					+ " (1230_kæbYdelserEU) VALUES (?);");				

			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1240KoebVarerUdland(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO economy.1200_salgsomkostninger "
					+ "(1240_kæbVarerUdland) VALUES (?);");				

			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1250KoebYdelseUdland(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO economy.1200_salgsomkostninger "
					+ "(1250_kæbYdelserUdland) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}



	public static void add1260ReguleringVarerlager(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO economy.1200_salgsomkostninger "
					+ "(1260_reguleringVarelager) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}




	public static void add1270AndreDivOmkost(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO economy.1200_salgsomkostninger "
					+ "(1270_andreDirekteOmkostninger) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	} // Salgsomkostninger slut



	//	1400 - Lænomkostninger

	public static void add1410AM(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1400_lænomkostninger` (`1410_AM`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1420ATP(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1400_lænomkostninger` (`1420_ATP`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1430Personalegoder(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1400_lænomkostninger` (`1230_personalegoder`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}




	public static void add1440Personalepleje(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1400_lænomkostninger` (`1440_personalepleje`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}







	public static void add1450Pension(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1400_lænomkostninger` (`1450_pension`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}



	public static void add1460Fradrag(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1400_lænomkostninger` (`1460_fradrag`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}




	public static void add1470Socialeomkost(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1400_lænomkostninger` (`1470_socialeOmkostninger`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}






	public static void add1480Tillaeg(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1400_lænomkostninger` (`1480_tillæg`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}





	public static void add1485BHonorar(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1400_lænomkostninger` (`1485_BHonorar`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}




	public static void add1490Feriepenge(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1400_lænomkostninger` (`1490_feriepenge`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	} // Lænomkostninger slut



	//	1500 - lokaleomkostninger

	public static void add1510HuslejeInkMoms(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1500_lokaleomkostninger` (`1510_huslejeInklMoms`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}







	public static void add1520HuslejeEksMoms(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1500_lokaleomkostninger` (`1520_huslejeEksklMoms`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}




	public static void add1530ElVandVarme(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1500_lokaleomkostninger` (`1530_ElVandVarme`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}




	public static void add1540VedligeholdRengoering(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1500_lokaleomkostninger` (`1540_vedligeholdelseRengæring`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}





	public static void add1550ForsikringLokale(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1500_lokaleomkostninger` (`1550_forsikringLokale`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	} // lokaleomkostninger slut


	//	1600 - Marketing- og rejseomkostninger




	public static void add1610Fragtudgifter(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1600_marketingrejser` (`1610_fragtUdgifter`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}





	public static void add1620TransportRejser(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1600_marketingrejser` (`1620_transportRejser`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}




	public static void add1630ReklameMarketing(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1600_marketingrejser` (`1630_reklameMarketing`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}



	public static void add1640Hotel(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1600_marketingrejser` (`1640_hotel`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}



	public static void add1650Raepraesentation(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1600_marketingrejser` (`1650_repræsentation`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}



	public static void add1660Restaurant(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1600_marketingrejser` (`1660_restaurant`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}



	public static void add1710Braendstof(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1700_bilomkostninger` (`1710_brændstof`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}



	public static void add1720Vedligeholdelse(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1700_bilomkostninger` (`1720_vedligeholdelse`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}



	public static void add1730Parkering(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1700_bilomkostninger` (`1730_parkering`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}

	public static void add1740BilForsikring(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1700_bilomkostninger` (`1740_forsikringBil`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1750Vaegtafgift(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1700_bilomkostninger` (`1750_vægtafgift`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	} // BIlomkostninger slut



	//	Administrationsomkostninger
	public static void add1810Kontorartikler(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1800_adminomkostninger` (`1810_kontorartikler`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}



	public static void add1820Website(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1800_adminomkostninger` (`1820_website`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}



	public static void add1830TlfInternet(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1800_adminomkostninger` (`1830_tlfInternet`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}



	public static void add1840smaaanskaffelser(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1800_adminomkostninger` (`1840_smæanskaffelser`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1850Koerselsgodtgoerelse(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1800_adminomkostninger` (`1850_kærselgodtgærelse`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1860KonsulentFreelance(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1800_adminomkostninger` (`1860_konsulenterFreelance`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}

	public static void add1870Forsikringer(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1800_adminomkostninger` (`1870_forsikringer`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}

	public static void add1880Inventar(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1800_adminomkostninger` (`1880_inventar`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1890TabPaaKunder(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1800_adminomkostninger` (`1890_tabPæKunder`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1895IkkeFradragBeretOmkost(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1800_adminomkostninger` (`1895_ikkeFradragberettigedeOmkost`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	}// administrationsomkostninger slut



	// 2000 - Afskrivninger
	public static void add2010Afskrivninger(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`2000_afskrivninger` (`2010_afskrivninger`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	} // afskrivninger slut




	//	2300 - Finansielle udgifte
	public static void add2310Renteudgift(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`2300_finansielleudgifter` (`2310_renteudgifter`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	}


	public static void add2320Gebyrer(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`2300_finansielleudgifter` (`2320_gebyrer`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	} //Finansielle udgifter slut


	//	2520 - Ekstraordinære poster
	public static void add2520EkstraUdgiftMoms(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`2500_ekstraordinæreposter` (`2520_ekstraUdgiftMoms`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	}  // ekstraordinæreudgifter slut


	// 5200 Immaterielle anlægsaktiver
	public static void add5210ImmatAnlægsaktiv(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`5200_immatanlægsaktiver` (`5210_immatAnlægsaktiver`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 	

	} // Immaterielle anlægsaktiver slut



	//	5310 - Materielle anlægsaktiver
	public static void add5310DriftInventarKostpris(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`5300_materielleanlægsaktiver` (`5310_driftInventarKostpris`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 	

	} 


	public static void add5320DriftInventarAkkuAfskriv(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`5300_materielleanlægsaktiver` (`5320_driftInventarAkkuAfskriv`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}// Materielle anlægsaktiver slut


	// 5400 - Finansielle anlægsaktiver
	public static void add5410KapAndelTilknytVirk(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`5400_finansielleanlægsaktiver` (`5410_kapAndelTilknytVirk`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}

	public static void add5420KapAndelAssVirk(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`5400_finansielleanlægsaktiver` (`5420_kapAndelAssVirk`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	} 


	public static void add5430AndreVaerdiKapital(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`5400_finansielleanlægsaktiver` (`5430_andreVærdiKapital`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	} 

	public static void add5440Deposita(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`5400_finansielleanlægsaktiver` (`5440_deposita`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	} 		// Finansielle anlægsaktiver slut



	//		5700 - Bank- og kontantbeholdning
	public static void add5710Bank(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`5700_bankkontantbeholdning` (`5710_bank`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	} 		

	public static void add5720Kontantbeholdning(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`5700_bankkontantbeholdning` (`5720_kontantbeholdning`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	} 	//		Bank- og kontantbeholdning slut

	// 5800 - Omsætningsaktiver

	public static void add5810TilgodeKunder(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`5800_omsætningsaktiver` (`5810_tilgodeKunder`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	} 	

	public static void add5820TilgodeLeverand(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`5800_omsætningsaktiver` (`5820_tilgodeLeverandær`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	} 


	public static void add5830Varelager(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`5800_omsætningsaktiver` (`5830_varelager`) VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		} 
	} 

	// Omsætningaktiver slut









	//	// Metode der tilfæjer regning.
	//		public static void addSmaa(int value) throws SQLException 
	//		{
	//
	//			try  {
	//				// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
	//				Connection conn = DBConnection.getConnection();
	//				PreparedStatement prepareStatement = null;
	//				
	//
	//				prepareStatement = conn.prepareStatement("INSERT INTO `finances`.`expense` (`smæanskaffelser`)"
	//						+ " VALUES(?)");              
	//
	//				
	//				
	//	//leverandær, regningsdato, betalt, betlingsfrist, bilagsnr(auto increment), valuta,
	//				// beskrvelse, udgfskategori, momssats, eks. moms , ink moms(auto), 
	//				
	//				
	//				// Tilfæjer til DB med værdierne fra OpretMedlemGui
	//				prepareStatement.setInt(1, value);
	//				
	//				prepareStatement.executeUpdate();
	//
	//
	//			}
	//			catch (SQLException e)
	//			{
	//				System.err.println(e);
	//			}
	//		}
	//		
	//		
	//		
	//		
	//		public static void addDiv(int value) throws SQLException 
	//		{
	//
	//			try  {
	//				// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
	//				Connection conn = DBConnection.getConnection();
	//				PreparedStatement prepareStatement = null;
	//				
	//
	//				prepareStatement = conn.prepareStatement("INSERT INTO `finances`.`expense` (`divUdgifter`)"
	//						+ " VALUES(?)");              
	//
	//				
	//				
	//	//leverandær, regningsdato, betalt, betlingsfrist, bilagsnr(auto increment), valuta,
	//				// beskrvelse, udgfskategori, momssats, eks. moms , ink moms(auto), 
	//				
	//				
	//				// Tilfæjer til DB med værdierne fra OpretMedlemGui
	//				prepareStatement.setInt(1, value);
	//				
	//				prepareStatement.executeUpdate();
	//
	//
	//			}
	//			catch (SQLException e)
	//			{
	//				System.err.println(e);
	//			}
	//		}
	//		
	//		
	//		
	//		
	//		
	//		
	//		public static void addIT(int value) throws SQLException 
	//		{
	//
	//			try  {
	//				// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
	//				Connection conn = DBConnection.getConnection();
	//				PreparedStatement prepareStatement = null;
	//				
	//
	//				prepareStatement = conn.prepareStatement("INSERT INTO `finances`.`expense` (`IT`)"
	//						+ " VALUES(?)");              
	//
	//				
	//				
	//	//leverandær, regningsdato, betalt, betlingsfrist, bilagsnr(auto increment), valuta,
	//				// beskrvelse, udgfskategori, momssats, eks. moms , ink moms(auto), 
	//				
	//				
	//				// Tilfæjer til DB med værdierne fra OpretMedlemGui
	//				prepareStatement.setInt(1, value);
	//				
	//				prepareStatement.executeUpdate();
	//
	//
	//			}
	//			catch (SQLException e)
	//			{
	//				System.err.println(e);
	//			}
	//		}
	//		
	//		
	//		public static void addOffice(int value) throws SQLException 
	//		{
	//
	//			try  {
	//				// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
	//				Connection conn = DBConnection.getConnection();
	//				PreparedStatement prepareStatement = null;
	//				
	//
	//				prepareStatement = conn.prepareStatement("INSERT INTO `finances`.`expense` (`kontorartikler`)"
	//						+ " VALUES(?)");              
	//
	//				
	//				
	//	//leverandær, regningsdato, betalt, betlingsfrist, bilagsnr(auto increment), valuta,
	//				// beskrvelse, udgfskategori, momssats, eks. moms , ink moms(auto), 
	//				
	//				
	//				// Tilfæjer til DB med værdierne fra OpretMedlemGui
	//				prepareStatement.setInt(1, value);
	//				
	//				prepareStatement.executeUpdate();
	//
	//
	//			}
	//			catch (SQLException e)
	//			{
	//				System.err.println(e);
	//			}
	//		}
	//		
	//		
	//		
	//		public static void addKoersel(int value) throws SQLException 
	//		{
	//
	//			try  {
	//				// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
	//				Connection conn = DBConnection.getConnection();
	//				PreparedStatement prepareStatement = null;
	//				
	//
	//				prepareStatement = conn.prepareStatement("INSERT INTO `finances`.`expense` (`kærsel`)"
	//						+ " VALUES(?)");              
	//
	//				
	//				
	//	//leverandær, regningsdato, betalt, betlingsfrist, bilagsnr(auto increment), valuta,
	//				// beskrvelse, udgfskategori, momssats, eks. moms , ink moms(auto), 
	//				
	//				
	//				// Tilfæjer til DB med værdierne fra OpretMedlemGui
	//				prepareStatement.setInt(1, value);
	//				
	//				prepareStatement.executeUpdate();
	//
	//
	//			}
	//			catch (SQLException e)
	//			{
	//				System.err.println(e);
	//			}
	//		}
	//		
	//		
	//		
	//		public static void addReklame(int value) throws SQLException 
	//		{
	//
	//			try  {
	//				// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
	//				Connection conn = DBConnection.getConnection();
	//				PreparedStatement prepareStatement = null;
	//				
	//
	//				prepareStatement = conn.prepareStatement("INSERT INTO `finances`.`expense` (`reklame`)"
	//						+ " VALUES(?)");              
	//
	//				
	//				
	//	//leverandær, regningsdato, betalt, betlingsfrist, bilagsnr(auto increment), valuta,
	//				// beskrvelse, udgfskategori, momssats, eks. moms , ink moms(auto), 
	//				
	//				
	//				// Tilfæjer til DB med værdierne fra OpretMedlemGui
	//				prepareStatement.setInt(1, value);
	//				
	//				prepareStatement.executeUpdate();
	//
	//
	//			}
	//			catch (SQLException e)
	//			{
	//				System.err.println(e);
	//			}
	//		}
	//		
	//		
	//		
	//		
	//		public static void addWeb(int value) throws SQLException 
	//		{
	//
	//			try  {
	//				// Opretter forbindelse til DB og sætter sql statement ind i PreparedStatement
	//				Connection conn = DBConnection.getConnection();
	//				PreparedStatement prepareStatement = null;
	//				
	//
	//				prepareStatement = conn.prepareStatement("INSERT INTO `finances`.`expense` (`website`)"
	//						+ " VALUES(?)");              
	//
	//				
	//				
	//	//leverandær, regningsdato, betalt, betlingsfrist, bilagsnr(auto increment), valuta,
	//				// beskrvelse, udgfskategori, momssats, eks. moms , ink moms(auto), 
	//				
	//				
	//				// Tilfæjer til DB med værdierne fra OpretMedlemGui
	//				prepareStatement.setInt(1, value);
	//				
	//				prepareStatement.executeUpdate();
	//
	//
	//			}
	//			catch (SQLException e)
	//			{
	//				System.err.println(e);
	//			}
	//		}

	// metode der opdaterer spiller informationerne
	//	public static void updateSpiller(int spillerId, String fornavn, String efternavn){
	//		try  {
	//			Connection conn = DBConnection.getConnection();
	//			PreparedStatement prepareStatement = 
	//					conn.prepareStatement("UPDATE spiller SET fornavn=?, efternavn=? WHERE idspiller=?;");              
	//
	//			prepareStatement.setString(1, fornavn);
	//			prepareStatement.setString(2, efternavn);
	//			prepareStatement.setInt(3, spillerId);
	//			prepareStatement.executeUpdate();
	//
	//		}
	//		catch (SQLException e)
	//		{
	//			System.err.println(e);
	//		}
	//	}

}