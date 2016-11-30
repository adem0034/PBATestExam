/*
 * Medlem der indeholder de 3 undermetoders knapper (opret,oversigt,slet)
 */
package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PhoneOrder {
	private static JTextArea txtBasket;
	private static javax.swing.JComboBox jComboBox1;
	static double price=0;

	public PhoneOrder() throws SQLException
	{
		init(); 
	}

	public static void init() throws SQLException 
	{
		// Opretter en JFrame og  laver designet
		final JFrame mainframe = new JFrame("GJKFK");
		mainframe.setSize(869,908);
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainframe.setLocationRelativeTo(null);
		mainframe.getContentPane().setLayout(null);

		jComboBox1 = new javax.swing.JComboBox();
		ArrayList cart=new ArrayList();
		



		Connection con = null;
		Statement st = null;
		ResultSet rs= null;

		JComboBox<String> itemCombo = new JComboBox<String>();

		populateCombo(mainframe, con, st, rs, itemCombo);

		List<String> listWithItems = new ArrayList<>();


		// Opretter btnTilbage og lukker vinduet ned.
		JButton btnTilbage = new JButton("Tilbage");
		btnTilbage.setBounds(23, 819, 97, 29);
		mainframe.getContentPane().add(btnTilbage);

		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(39, 65, 56, 16);
		mainframe.getContentPane().add(lblItem);

		
		
		JButton btnAddToCart = new JButton("Add to cart");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					addtoCart(mainframe, con, st, rs, itemCombo, cart);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}



			}
		});

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 208, 437, 146);
		mainframe.getContentPane().add(scrollPane);

		txtBasket = new JTextArea();
		scrollPane.setViewportView(txtBasket);

		


		btnAddToCart.setBounds(173, 115, 157, 40);
		mainframe.getContentPane().add(btnAddToCart);


		JButton btnShowCart = new JButton("Show cart");
		btnShowCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showCart(txtBasket,cart);
				
				

			}
		});
	

		btnShowCart.setBounds(60, 388, 336, 40);
		mainframe.getContentPane().add(btnShowCart);

		JButton btnProceedTransaction = new JButton("Proceed transaction");
		btnProceedTransaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int orderId= (int)(Math.ceil(78533*Math.random()));

				new Transaction(orderId,price,cart).setVisible(true);


				 
			}
		});
		btnProceedTransaction.setBounds(549, 396, 174, 25);
		mainframe.getContentPane().add(btnProceedTransaction);





		btnTilbage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainframe.setVisible(false);
			}
		});





	}


	private static void showCart(JTextArea txtBasket, ArrayList cart) {
		// TODO Auto-generated method stub
		String s="";
		txtBasket.setText("");
		s="Total Price = $"+price+"\n";
		Iterator i= cart.iterator();
		while(i.hasNext()){s=s+"\n"+i.next();}

		txtBasket.setText(s);
		
	}


	public static void populateCombo(final JFrame mainframe, Connection con, Statement st, ResultSet rs,
			JComboBox<String> itemCombo) {
		try{

			String s[]=new String[50000];



			con = DriverManager.getConnection("jdbc:mysql://localhost/bill","root","186549");
			st = con.createStatement();
			String query = "select itemName from bill.item";

			rs = st.executeQuery(query);

			int i = 0;

			while(rs.next())
			{
				{s[i]=rs.getString(1);
				i++;
				}
			}

			itemCombo.setModel((ComboBoxModel<String>) new DefaultComboBoxModel(s));



		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}finally{
			try{
				st.close();
				rs.close();
				con.close();
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Error. Shutting down.");
			}
		}

		mainframe.getContentPane().add(itemCombo);


		itemCombo.setBounds(173, 62, 282, 22);
		mainframe.getContentPane().add(itemCombo);

	}
	
	
	@SuppressWarnings("unchecked")
	public static void addtoCart(final JFrame mainframe, Connection con, Statement st, ResultSet rs,
			JComboBox<String> itemCombo, ArrayList cart) throws SQLException {
		

		String q="select ItemPrice from item where ItemName='"+itemCombo.getSelectedItem()+"'";
		
		
		
		con = DriverManager.getConnection("jdbc:mysql://localhost/bill","root","186549");
		st = con.createStatement();

		rs = st.executeQuery(q);

		rs.next();
		cart.add(itemCombo.getSelectedItem()+" : $"+rs.getString(1));

		price=price+Double.parseDouble(rs.getString(1));


		
		
	}
}