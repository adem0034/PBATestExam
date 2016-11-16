/*
 * Gui der indeholder de 3 hovedmetoders knapper inklusiv login- og logudmetoder. 
 */
package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class GuiMain {
	// fields
	private JPasswordField pwdLogin;
	JFrame mainframe;
	// private static final ActionListener Login = null;

	
	public GuiMain(){

		// Opretter en JFrame og  laver designet
		 mainframe = new JFrame("ADEM 2");
		mainframe.setSize(992,700);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.getContentPane().setLayout(null);
		mainframe.setLocationRelativeTo(null);



//		// Opretter btnBooking, tilføjer den til mainframe og kalder BookingGUI
//		JButton btnBooking = new JButton("Booking / meeting");
//		btnBooking.setBounds(134, 22, 181, 29);
//		mainframe.getContentPane().add(btnBooking);
//		btnBooking.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				BookingGUI.init();
//			}
//		});
//
		// Opretter btnMoms, tilføjer den til mainframe og kalder MomsGUI
		JButton btnMoms = new JButton("Finances");
		btnMoms.setBounds(317, 22, 181, 29);
		mainframe.getContentPane().add(btnMoms);
		btnMoms.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MomsGUI.init();
			}
		});


		//  
		//  
		//  // Opretter btnKalender, tilføjer den til mainframe og kalder KalenderGui
		//  JButton btnKalender = new JButton("Kalender");
		//  btnKalender.setBounds(179, 22, 117, 29);
		//  mainframe.getContentPane().add(btnKalender);
		//  btnKalender.addActionListener(new ActionListener() {
		//   
		//   @Override
		//   public void actionPerformed(ActionEvent e) {
		//    KalenderGui.main(null);
		//   }
		//  });
		//  
		//  //Opretter btnStatistik, tilføjer den til mainframe og kalder StatistikGui
		//  JButton btnStatistik = new JButton("Statistik");
		//  btnStatistik.setBounds(584, 22, 117, 29);
		//  mainframe.getContentPane().add(btnStatistik);
		//  btnStatistik.addActionListener(new ActionListener() {
		//   @Override
		//   public void actionPerformed(ActionEvent e) {
		//    StatistikGui.init();    
		//   }
		//  });

		//Opretter et passwordlogin field, tilføjer til mainframe
		pwdLogin = new JPasswordField();
		pwdLogin.setBounds(661, 581, 100, 20);
		mainframe.getContentPane().add(pwdLogin);

		//Opretter login button, tilføjer til mainframe
		final JButton btnLogInd = new JButton("Log ind");
		btnLogInd.setBounds(661, 608, 100, 29);
		mainframe.getContentPane().add(btnLogInd);

		// opretter btnMedlem, tilføjer til mainframe og kalder MedlemGui's metode.
		final JButton btnMedlem = new JButton("Medlem");
		btnMedlem.setBounds(25, 22, 97, 29);
		mainframe.getContentPane().add(btnMedlem);
		btnMedlem.setVisible(false);
		btnMedlem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//    MedlemGui.init();    
			}
		});

		// Opretter btnLogud, gør den usynlig + tilføjer til mainframe.
		final JButton btnLogUd = new JButton("Log ud");
		btnLogUd.setVisible(false);
		btnLogUd.setBounds(12, 610, 97, 29);
		mainframe.getContentPane().add(btnLogUd);

		JButton btnBetalingRegning = new JButton("Betal regning");
		btnBetalingRegning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				RegningGUI.init();

			}
		});


		JButton btnRegninger = new JButton("Kundefakturaer");
		btnRegninger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				KundeFaktGUI.init();

			}
		});

		
		
		
		btnRegninger.setBounds(693, 24, 156, 25);
		mainframe.getContentPane().add(btnRegninger);


		btnBetalingRegning.setBounds(510, 24, 156, 25);
		mainframe.getContentPane().add(btnBetalingRegning);

		JButton btnPhoneOrders = new JButton("create order");
		btnPhoneOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					PhoneOrder.init();
					//  	        new SelectItems2().setVisible(true);

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}
		});


		btnPhoneOrders.setBounds(319, 113, 156, 45);
		mainframe.getContentPane().add(btnPhoneOrders);
		btnLogUd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Gør knapper synlige og usynlige
				btnLogInd.setVisible(true);
				pwdLogin.setVisible(true);
				btnLogUd.setVisible(false);
				btnMedlem.setVisible(false);
			}   
		});

		// Tilføjer actionListener til btnLogind og gør knapper synlige og usynlige mht. login
		btnLogInd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(new String(pwdLogin.getPassword()).equals("1234")){

					btnLogUd.setVisible(true);
					btnLogInd.setVisible(false);
					pwdLogin.setVisible(false);
					btnMedlem.setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(null, "Forkert password!");
				}

			}
		});
		//fokusere nede ved login fra start.
		//  btnLogInd.addKeyListener((KeyListener) Login);

		// fokusere nede ved login ting
		mainframe.addWindowListener(new WindowAdapter(){
			public void windowOpened(WindowEvent e){
				pwdLogin.requestFocus(false);
			}
		});

		// gør mainframe synlig
		mainframe.setVisible(true);
		

	}


}
