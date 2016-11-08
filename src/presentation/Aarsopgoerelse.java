/*
 * Gui der viser tabel over spillerstatisik - og som gï¿½r det muligt, at ï¿½ndre info i tabellen
 */
package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dlayer.AarsSQL;
import dlayer.MomsSQL;
import model.AarsOpg;
import model.MomsOpg;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class Aarsopgoerelse {
	public Aarsopgoerelse() {
		init();
	}

	//field
	private static JTable table; 



	public static void init() {
		// Opretter en JFrame og  laver designet
		final JFrame mainframe = new JFrame("Årsopgørelse");
//		mainframe.setSize(JFrame.MAXIMIZED_BOTH );
		mainframe.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		mainframe.setUndecorated(false);
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainframe.setLocationRelativeTo(null);

		try {
			mainframe.getContentPane().setLayout(null);
			// tilfï¿½jer en "scroll" funktion 
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(34, 260, 1736, 189);
			mainframe.getContentPane().add(scrollPane);

			// opretter en jTable og sï¿½tter scrollPane sammen
			table = new JTable();
			scrollPane.setViewportView(table);
			table.setVisible(true);
//			scrollPane2.setViewportView(table2)


			/* Kalder StatistikSQL. statistik() og sï¿½tter vï¿½rdien til at vï¿½re en ArrayList
			af typen Statistik.*/
			ArrayList<AarsOpg> results = AarsSQL.res();


			//			ArrayList<MomsOpg> resultKoebsMoms = MomsSQL.koebsMoms();

			
			// Opretter object der navngives "header" og giver den parametre. 
			Object[] header = {"320","323", "325", "327", "330", 
					"331", "332", "333", "356"};

			//Opretter et todimentionelt array (kaldet data) af Object
			Object[][] data = new Object[results.size()][];

			//Looper igennem hvert element i results ArrayListen  
			int i=0;
			for (AarsOpg aarsOpg : results) {

				// toObjectArray returnere et object array, hvilket blive gemt i data[].
				data[i] = aarsOpg.toObjectArray();
				i++;
			}
			
			
			
					
			






//			// Opretter en DefaultTableModel, og indsï¿½tter bï¿½de data og header
			DefaultTableModel model = new DefaultTableModel(data, header);
			model.setColumnIdentifiers(header);
			table.setModel(model);



//			


		


		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
	


		// Opretter btnGem
		final JButton btnGem = new JButton("Gem");
		btnGem.setBounds(1561, 928, 117, 29);
		mainframe.getContentPane().add(btnGem);

		//		// Funktionaliteten i gem knappen tilfï¿½jes
		//		btnGem.addActionListener(new ActionListener(){
		//			public void actionPerformed(ActionEvent e) {
		//				
		//				// indstiller tabellen.
		//				TableModel model = table.getModel();
		//				int rows = model.getRowCount();
		//				
		//			    /* mens der stadig er flere rï¿½kker, tager den vï¿½rdien af den enkelte rï¿½kke
		//			     og sender informationerne til MedlemSQL.updateSpiller() og StatistikSQL.updateStatistik()
		//				 som sender til DB for at opdatere medlemmet/spillleren */
		//				for (int i = 0 ; i<rows; i++) {
		//				int idSpiller = (int) model.getValueAt(i, 0);
		//				String fname = (String) model.getValueAt(i, 1);
		//				String ename = (String) model.getValueAt(i, 2);
		//								
		//				MedlemSQL.updateSpiller(idSpiller, fname, ename);
		//								
		//				int mÃ¥l = Integer.parseInt(""+model.getValueAt(i, 3));
		//				int rødt_kort = Integer.parseInt(""+ model.getValueAt(i, 4));
		//				int gult_kort = Integer.parseInt(""+model.getValueAt(i, 5));
		//								
		//				StatistikSQL.updateStatistik(idSpiller, mÃ¥l, rødt_kort, gult_kort);
		//				}
		//			}
		//		});

		// opretter btnTilbage, som hvis klikkes vil lukke vinudet ned (usynligï¿½rer den)
		JButton btnTilbage = new JButton("Tilbage");
		btnTilbage.setBounds(55, 915, 97, 25);
		mainframe.getContentPane().add(btnTilbage);
		
		
		btnTilbage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainframe.setVisible(false);
			}
		});

	}
}
