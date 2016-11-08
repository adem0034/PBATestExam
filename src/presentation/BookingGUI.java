/*
 * Medlem der indeholder de 3 undermetoders knapper (opret,oversigt,slet)
 */
package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BookingGUI {
 
  public BookingGUI()
  {
   init(); 
  }
  
  public static void init() 
  {
	  // Opretter en JFrame og  laver designet
	final JFrame mainframe = new JFrame("GJKFK");
    mainframe.setSize(630,490);
    mainframe.setVisible(true);
    mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    mainframe.getContentPane().setLayout(null);
    mainframe.setLocationRelativeTo(null);
    
    // Opretter btnMedlem og kalder OpretMedlemGuis metode.
    JButton btnCreateBooking = new JButton("Create new booking");
    btnCreateBooking.setBounds(90, 13, 165, 29);
    mainframe.getContentPane().add(btnCreateBooking);
    btnCreateBooking.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      
    	 // Open up sub-gui
      CreateBookingGUI.init();
      }
     });
    
    // Opretter btnSletBooking og kalder DeleteBookingSQL's metode
    JButton btnDeleteBooking = new JButton("Slet booking");
    btnDeleteBooking.setBounds(370, 13, 118, 29);
    mainframe.getContentPane().add(btnDeleteBooking);
    btnDeleteBooking.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      
//      DeleteBookingSQL.deleteBooking();
      
     }
    });
    
//    // Opretter btnMedlemOversigt og kalder MedlemOVersigt metoden
//    JButton btnMedlemOversigt = new JButton("Medlem Oversigt");
//    btnMedlemOversigt.setBounds(220, 13, 145, 29);
//    mainframe.add(btnMedlemOversigt);
//    btnMedlemOversigt.addActionListener(new ActionListener() {
//     public void actionPerformed(ActionEvent e) {
//      
//    	MedlemOversigtGui.init();
//      
//     }
//    });

    // Opretter btnTilbage og lukker vinduet ned.
    JButton btnTilbage = new JButton("Tilbage");
    btnTilbage.setBounds(12, 405, 97, 29);
    mainframe.getContentPane().add(btnTilbage);
    btnTilbage.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
     mainframe.setVisible(false);
    }
   });
   }
 }