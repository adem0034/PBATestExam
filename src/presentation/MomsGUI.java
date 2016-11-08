/*
 * Gui der indeholder de 3 hovedmetoders knapper inklusiv login- og logudmetoder. 
 */
package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MomsGUI {
	// fields

	  public MomsGUI()
	  {
	   init();
	  }
	  
	  public static void init() 
	  {
		  

  
	// Opretter en JFrame og  laver designet
  JFrame mainframe = new JFrame("GJKFK");
  mainframe.setSize(800,700);
  mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  mainframe.getContentPane().setLayout(null);
  mainframe.setLocationRelativeTo(null);
  
  
//  
//  // Opretter btnBooking, tilf�jer den til mainframe og kalder BookingGUI
//  JButton btnBooking = new JButton("Booking / meeting");
//  btnBooking.setBounds(331, 22, 181, 29);
//  mainframe.getContentPane().add(btnBooking);
//  btnBooking.addActionListener(new ActionListener() {
//   
//   @Override
//   public void actionPerformed(ActionEvent e) {
//    BookingGUI.init();
//   }
//  });
  
  
//  
//  
//  // Opretter btnKalender, tilf�jer den til mainframe og kalder KalenderGui
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
//  //Opretter btnStatistik, tilf�jer den til mainframe og kalder StatistikGui
//  JButton btnStatistik = new JButton("Statistik");
//  btnStatistik.setBounds(584, 22, 117, 29);
//  mainframe.getContentPane().add(btnStatistik);
//  btnStatistik.addActionListener(new ActionListener() {
//   @Override
//   public void actionPerformed(ActionEvent e) {
//    StatistikGui.init();    
//   }
//  });
  
 
  
  //Opretter login button, tilf�jer til mainframe
  final JButton btnLogInd = new JButton("Log ind");
  btnLogInd.setBounds(661, 608, 100, 29);
  mainframe.getContentPane().add(btnLogInd);
  
  // opretter btnResultatOpgoerelse, tilf�jer til mainframe og kalder resOpgGUI's metode.
  final JButton btnResultatOpgoerelse = new JButton("Resultatopg�relse");
  btnResultatOpgoerelse.setBounds(235, 22, 139, 25);
  mainframe.getContentPane().add(btnResultatOpgoerelse);
  btnResultatOpgoerelse.setVisible(true);
  btnResultatOpgoerelse.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    
    resOpgGUI.init();  
   }
  });
  
  
  
  // opretter btnResultatOpgoerelse, tilf�jer til mainframe og kalder resOpgGUI's metode.
  final JButton btnAarsopgoerele = new JButton("�rsopg�relse");
  btnAarsopgoerele.setBounds(25, 22, 139, 25);
  mainframe.getContentPane().add(btnAarsopgoerele);
  btnAarsopgoerele.setVisible(true);
  btnAarsopgoerele.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
 // ^�rsopg�rsle.init() something here
	   
	   Aarsopgoerelse.init();

   }
  });
  
  
  // opretter btnResultatOpgoerelse, tilf�jer til mainframe og kalder resOpgGUI's metode.
  final JButton btnMomsopg = new JButton("Momsopg�relse");
  btnMomsopg.setBounds(476, 22, 139, 25);
  mainframe.getContentPane().add(btnMomsopg);
  btnMomsopg.setVisible(true);
  btnMomsopg.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    
    MomsopgGUI.init();  
   }
  });
  
  

	// Opretter btnLogud, g�r den usynlig + tilf�jer til mainframe.
  final JButton btnLogUd = new JButton("Log ud");
  btnLogUd.setVisible(false);
  btnLogUd.setBounds(12, 610, 97, 29);
  mainframe.getContentPane().add(btnLogUd);
  btnLogUd.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
	   // G�r knapper synlige og usynlige
     btnLogInd.setVisible(true);
     btnLogUd.setVisible(false);
    }   
   });

 
  //fokusere nede ved login fra start.
//  btnLogInd.addKeyListener((KeyListener) Login);

     // g�r mainframe synlig
  mainframe.setVisible(true);
 }
}
