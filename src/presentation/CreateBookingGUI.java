/*
 * Pop up Gui som gør det muligt at oprette et nyt medlem/spiller. 
 */
package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CreateBookingGUI 
{
	 // fields
 private static JTextField textField;
 private static JTextField textField_1;
 private static JTextField textField_3;
 private static JTextField textField_4;
 private static JTextField textField_2;
 private static JTextField textField_5;
 
 
 public CreateBookingGUI()
 {
  init();
 }
 
 public static void init() 
 {
	// Opretter en JFrame og  laver designet
	 final JFrame mainframe = new JFrame();
	 mainframe.setSize(330,515);
	 mainframe.setVisible(true);
	 mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	 mainframe.getContentPane().setLayout(null);
	 mainframe.setLocationRelativeTo(null);
	  
	// Opretter en masse JLabels, sætter størrelse og tilføjer til mainframe.
	 JLabel lblFornavn = new JLabel("Fornavn");
	 lblFornavn.setBounds(5, 10, 50, 16);
	 mainframe.getContentPane().add(lblFornavn);
	 
	 JLabel lblEfternavn = new JLabel("Efternavn");
	 lblEfternavn.setBounds(5, 55, 60, 16);
	 mainframe.getContentPane().add(lblEfternavn);
	 
	 JLabel lblEmail = new JLabel("Email");
	 lblEmail.setBounds(5, 142, 60, 16);
	 mainframe.getContentPane().add(lblEmail);
	 
	 JLabel lblTlf = new JLabel("Tlf");
	 lblTlf.setBounds(5, 190, 20, 16);
	 mainframe.getContentPane().add(lblTlf);
	  
	 // opretter en btnGemSpiller
	 JButton btnSaveBooking = new JButton("Save booking/meeting");
	 btnSaveBooking.setBounds(141, 428, 159, 25);
	 mainframe.getContentPane().add(btnSaveBooking);
  
	 // opretter en masse JTextfields, sætter størrelse og tilføjer til mainframe.
	 textField = new JTextField();
	 textField.setBounds(168, 4, 134, 28);
	 mainframe.getContentPane().add(textField);
	 textField.setColumns(10);
	  
	 textField_1 = new JTextField();
	 textField_1.setBounds(168, 49, 134, 28);
	 mainframe.getContentPane().add(textField_1);
	 textField_1.setColumns(10);
	 
	 textField_3 = new JTextField();
	 textField_3.setBounds(168, 136, 134, 28);
	 mainframe.getContentPane().add(textField_3);
	 textField_3.setColumns(10);
	 
	 textField_4 = new JTextField();
	 textField_4.setBounds(168, 184, 134, 28);
	 mainframe.getContentPane().add(textField_4);
	 textField_4.setColumns(10);
	
	 // Tilføjer funktionalitet til btnGemInfo (oprette medlem i DB)
	 btnSaveBooking.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent arg0) { 
			 
			 
			 // Tager informationer fra txtFields og sender til MedlemSQL.addSpiller, 
			 // som sender til DB.			 
			 String fornavn = textField.getText();
			 String efternavn = textField_1.getText();
			 int cpr = Integer.parseInt((String)textField_2.getText());
			 String email = textField_3.getText();
			 int tlf = Integer.parseInt((String)textField_4.getText());
			 String ben = textField_5.getText();
			
			 
//			 try {
//				 // her sender/videregiver den variablerne til .addSpiller
//				 MedlemSQL.addSpiller(fornavn, efternavn, cpr, email, tlf, ben);
//				 } catch (SQLException e) {
//					 // TODO Auto-generated catch block
//					 e.printStackTrace();
//					 }
			 // printer bekræftelse og disposer mainframe'en.
			 JOptionPane.showMessageDialog(null, "Medlemmet " + fornavn + " " + efternavn + " er oprettet i Databasen");
			 mainframe.dispose(); 
			 }
		 });
	 
	 // Opretter btnTilbage
	 final JButton btnTilbage = new JButton("Tilbage");
	 btnTilbage.setBounds(5, 426, 75, 25);
	 mainframe.getContentPane().add(btnTilbage);
	 
	 textField_2 = new JTextField();
	 textField_2.setBounds(168, 245, 116, 22);
	 mainframe.getContentPane().add(textField_2);
	 textField_2.setColumns(10);
	 
	 JLabel lblBeskrivelse = new JLabel("Beskrivelse ");
	 lblBeskrivelse.setBounds(5, 248, 84, 16);
	 mainframe.getContentPane().add(lblBeskrivelse);
	 
	 textField_5 = new JTextField();
	 textField_5.setBounds(168, 302, 116, 22);
	 mainframe.getContentPane().add(textField_5);
	 textField_5.setColumns(10);
	 
	 JLabel lblDato = new JLabel("Dato");
	 lblDato.setBounds(12, 305, 56, 16);
	 mainframe.getContentPane().add(lblDato);
	
	 // usynligør mainframe ved tryk på Tilbage
	 btnTilbage.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent e) {
	     mainframe.setVisible(false);
	     }
		 });
	 }
}