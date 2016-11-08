//package presentation;
//import java.sql.*;
//
//public class bill_database {
//
//   
//    // JDBC driver name and database URL
//   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
//   static final String DB_URL = "jdbc:mysql://localhost/bill";
//  static String order = "order";
//  static String orderitem = "orderitem";
//  static String item = "item";
//  static String customerinfo = "customerinfo";
//  static String orderpayment = "orderpayment";
//  static String paymenttype = "paymenttype";
//
//
//   //  Database credentials
//   static final String USER = "root";
//   static final String PASS = "186549";
//    static Connection conn = null;
//    static Statement stmt = null;
//    
//    String sql;
//    ResultSet rs;
//   
//    public bill_database() {
//      
//        
//        try{
//      //STEP 2: Register JDBC driver
//      Class.forName("com.mysql.jdbc.Driver");
//
//      //STEP 3: Open a connection
//      try{
//      System.out.println("Connecting to database...");
//      conn = DriverManager.getConnection(DB_URL,USER,PASS);
//      System.out.println("Connected ");
//    }
//      catch(Exception e){System.out.println(e);}
//    }
//    
//    catch(Exception e){System.out.println(e);}
//   }
//}