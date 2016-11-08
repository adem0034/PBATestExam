package presentation;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

// ny

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transaction {

	ArrayList cart=new ArrayList();
	int orderId;
	double price;

	Statement st=null;
	Connection con = null;
	ResultSet rs= null;

	private JTextField txtName;
	private JTextField txtStreet;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtZip;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JButton btnCompleteTransaction;
	JComboBox<String> paymentCombo = new JComboBox<String>();
	private JFrame mainframe;




	public Transaction(int o, double p, ArrayList c) {
		System.out.println(o+"  "+p);
		orderId=o;
		price=p;
		cart = c;
		init();

	}
	private void init() {
		mainframe = new JFrame("Transaction");
		mainframe.setSize(869,908);
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainframe.setLocationRelativeTo(null);
		mainframe.getContentPane().setLayout(null);

		JLabel lblOrderid = new JLabel("orderID");
		lblOrderid.setBounds(214, 13, 200, 32);
		mainframe.getContentPane().add(lblOrderid);

		JLabel lblTotalSum = new JLabel("Total sum");
		lblTotalSum.setBounds(10, 58, 200, 26);
		mainframe.getContentPane().add(lblTotalSum);

		JLabel lblPaymentType = new JLabel("Payment type:");
		lblPaymentType.setBounds(10, 93, 200, 26);
		mainframe.getContentPane().add(lblPaymentType);

		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setBounds(317, 155, 188, 40);
		mainframe.getContentPane().add(txtName);
		txtName.setColumns(10);

		txtStreet = new JTextField();
		txtStreet.setText("Street");
		txtStreet.setBounds(303, 221, 200, 50);
		mainframe.getContentPane().add(txtStreet);
		txtStreet.setColumns(10);

		txtCity = new JTextField();
		txtCity.setText("City");
		txtCity.setBounds(303, 284, 200, 50);
		mainframe.getContentPane().add(txtCity);
		txtCity.setColumns(10);

		txtState = new JTextField();
		txtState.setText("State");
		txtState.setBounds(303, 347, 200, 50);
		mainframe.getContentPane().add(txtState);
		txtState.setColumns(10);

		txtZip = new JTextField();
		txtZip.setText("Zip");
		txtZip.setBounds(303, 413, 200, 50);
		mainframe.getContentPane().add(txtZip);
		txtZip.setColumns(10);

		txtPhone = new JTextField();
		txtPhone.setText("Phone");
		txtPhone.setBounds(303, 496, 200, 50);
		mainframe.getContentPane().add(txtPhone);
		txtPhone.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(303, 598, 200, 50);
		mainframe.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);

		btnCompleteTransaction = new JButton("Complete transaction");
		btnCompleteTransaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {


				try {
					insertDB();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnCompleteTransaction.setForeground(Color.ORANGE);
		btnCompleteTransaction.setFont(new Font("Tahoma", Font.PLAIN, 42));
		btnCompleteTransaction.setBackground(Color.GREEN);
		btnCompleteTransaction.setBounds(25, 664, 785, 84);
		mainframe.getContentPane().add(btnCompleteTransaction);



		String o=String.valueOf(orderId);
		lblOrderid.setText("order id: " + o);


		lblTotalSum.setText("Sum in DKK: "+String.valueOf(price));


		Connection con = null;
		Statement st = null;
		ResultSet rs= null;

		//		JComboBox<String> paymentCombo = new JComboBox<String>();

		populateCombo(mainframe, con, st, rs, paymentCombo);



	}
	private void populateCombo(final JFrame mainframe, Connection con, Statement st, ResultSet rs,
			JComboBox<String> paymentCombo) {
		try{

			String s[]=new String[1000];


			con = DriverManager.getConnection("jdbc:mysql://localhost/bill","root","186549");
			st = con.createStatement();
			String query = "select TypeOfPay from bill.paymenttype";

			rs = st.executeQuery(query);

			int i = 0;
			while(rs.next())
			{
				{s[i]=rs.getString(1);
				i++;
				}
			}

			paymentCombo.setModel((ComboBoxModel<String>) new DefaultComboBoxModel(s));



		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "ERROR");
		}finally{
			try{
				st.close();
				rs.close();
				con.close();
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "ERROR CLOSE");
			}
		}




		mainframe.getContentPane().add(paymentCombo);

		paymentCombo.setBounds(168, 95, 282, 22);
		mainframe.getContentPane().add(paymentCombo);



	}
	private void insertDB() throws SQLException {
		// TODO Auto-generated method stub
//		Connection con;
//		Statement st;

		Date d = new Date();

		int custId= (int)(Math.ceil(78533*Math.random()));

		String insertquery="insert into customerinfo values ("+custId+",'"+txtName.getText()+
				"','"+txtStreet.getText()+"','"+txtCity.getText()+
				"','"+txtState.getText()+"','"+txtZip.getText()+"','"+txtPhone.getText()+
				"','"+txtEmail.getText()+"')";

		String secondInsertQuery = "insert into orderx values ("+orderId+", '"+d.toString()+
				"', 'DKK',"+price+", "+price+", "+custId+","+custId+")";


		String thirdInsertQuery = "insert into orderpayment values ("+orderId+", "+price+
				", '"+paymentCombo.getSelectedItem()+"')";

		String s="";
		Iterator i=cart.iterator();
		while(i.hasNext()){
			s=s+i.next() +",";
		}

		String fourthInsertquery="insert into orderitem values ( "+orderId+",'" +s+"',"+cart.size()+","+price+")";

		con = DriverManager.getConnection("jdbc:mysql://localhost/bill","root","186549");

		try{
			st = con.createStatement();
			int check= st.executeUpdate(insertquery);

			st.executeUpdate(secondInsertQuery);
			st.executeUpdate(thirdInsertQuery);
			st.executeUpdate(fourthInsertquery);
		}

		catch(Exception e){System.out.println(e);
//		new SelectItems2().setVisible(true);
		

		}
		
		JOptionPane.showMessageDialog(mainframe, "Added to DB.");


	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		mainframe.setVisible(true);

	}

}
