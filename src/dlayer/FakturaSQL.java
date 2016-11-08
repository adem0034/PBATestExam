package dlayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class FakturaSQL
{
	// Metode der tilf�jer regning.
	//	Salgsomkostninger
	public static void addFaktura(String fName, String lName, String tlf, String email, String roadName,
			String areaCode, String city, String CVR, String companyName, String category,
			String descript, int priceNoVat, int momsType, String date, boolean paid) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;
			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`invoice` (`fName`, "
					+ "`lName`, `tlf`, `email`, `roadName`, `areaCode`, `City`, `CVR`, `companyName`, "
					+ "`category`, `descript`, `priceNoVat`, `momsType`, `date`, `paid`)"
					+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");              




			// Tilf�jer til DB med v�rdierne fra RegningGUI
			prepareStatement.setString(1, fName );
			prepareStatement.setString(2, lName );
			prepareStatement.setString(3, tlf );
			prepareStatement.setString(4, email);
			prepareStatement.setString(5, roadName);
			prepareStatement.setString(6, areaCode);
			prepareStatement.setString(7, city);
			prepareStatement.setString(8, CVR);
			prepareStatement.setString(9, companyName);
			prepareStatement.setString(10, category);
			prepareStatement.setString(11, descript);
			prepareStatement.setInt(12, priceNoVat);
			prepareStatement.setInt(13, momsType);
			prepareStatement.setString(14, date);
			prepareStatement.setBoolean(15, paid);


			prepareStatement.executeUpdate();







		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}

	//        **** 1100 - Salgsomkostninger ****
	public static void add1110Salg(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1100_indt�gter` (`1110_salg`)"
					+ " VALUES (?);");


			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1115SalgFragtUdenMoms(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1100_indt�gter` "
					+ "(`1115_salgFragt`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}

	public static void add1116SalgFragtMedMoms(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1100_indt�gter` "
					+ "(`1116_salgFragtMoms`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	public static void add1120SalgVarerUdland(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1100_indt�gter` "
					+ "(`1120_salgVarerUdland`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}

	public static void add1130SalgYdelseUdland(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1100_indt�gter` "
					+ "(`1130_salgYdelserUdland`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}

	public static void add1140SalgVarerEU(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1100_indt�gter` "
					+ "(`1140_salgVarerEU`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}
	public static void add1141SalgVarerEUInklMoms(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1100_indt�gter`"
					+ " (`1141_salgVarerEUInklMoms`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}
	public static void add1150SalgYdelseEU(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1100_indt�gter` "
					+ "(`1150_salgYdelserEU`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}
	public static void add1151SalgYdelseEUInklMoms(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`1100_indt�gter` "
					+ "(`1151_salgYdelseEUInklMoms`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	//	2200 - Finansielle indt�gter

	public static void add2220RykkerGebyr(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`2200_finansielleindt�gter`"
					+ " (`2220_rykkergebyr`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}
	public static void add2230RenteIndt�gt(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`2200_finansielleindt�gter` "
					+ "(`2230_renteindt�gter`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}
	public static void add2240GebyrIndt�gt(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`2200_finansielleindt�gter` "
					+ "(`2240_gebyrindt�gter`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}

	//	2500 - Ekstraordin�re poster

	public static void add2510EkstraOrdIndtInklMoms(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`2500_ekstraordin�reposter` "
					+ "(`2510_ekstraIndt�gtMoms`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}


	//	7100 - Egenkapital

	public static void add7130MellemRegnEjer(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`7100_egenkapital` "
					+ "(`7130_mellemregningEjer`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}
	
	
	public static void add7140indskudtKapital(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`7100_egenkapital` "
					+ "(`7140_indskutKapital`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}

//	7300 - Kortfristede forpligtelser

	public static void add7330SkyldigASkat(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`7300_kortfristforpligt` "
					+ "(`7330_skyldigASkat`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}public static void add7340SkyldigAM(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`7300_kortfristforpligt` "
					+ "(`7340_skyldigAM`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}public static void add7350SkyldigATP(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`7300_kortfristforpligt` "
					+ "(`7350_skyldigATP`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}public static void add7360HensatteForpligt(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`7300_kortfristforpligt` "
					+ "(`7360_hensatForpligt`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}public static void add7370SkyldigPension(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`7300_kortfristforpligt` "
					+ "(`7370_skyldigPenson`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}public static void add7380SkyldigeFeriepenge(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`7300_kortfristforpligt` "
					+ "(`7380_skyldigFeriepenge`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}public static void add7390SkyldigSocialOmk(int value) throws SQLException 
	{

		try  {
			// Opretter forbindelse til DB og s�tter sql statement ind i PreparedStatement
			Connection conn = DBConnection.getConnection();
			PreparedStatement prepareStatement = null;


			prepareStatement = conn.prepareStatement("INSERT INTO `economy`.`7300_kortfristforpligt` "
					+ "(`7390_skyldgSocialOmkost`) VALUES (?);");




			prepareStatement.setInt(1, value);	
			prepareStatement.executeUpdate();


		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
	}




}