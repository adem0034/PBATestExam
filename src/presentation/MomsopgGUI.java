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

import dlayer.MomsSQL;
import model.MomsOpg;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class MomsopgGUI {
	public MomsopgGUI() {
		init();
	}

	//field
	private static JTable table; 
	private static JTable table2;
	private static JTable table3;
	private static JTable table4;
	private static JTable table5;
	private static JTable table6;
	private static JTable table7;
	private static JTable table8;




	public static void init() {
		// Opretter en JFrame og  laver designet
		final JFrame mainframe = new JFrame("Momsopgørelse");
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
			scrollPane.setBounds(26, 499, 1736, 189);
			mainframe.getContentPane().add(scrollPane);

			// opretter en jTable og sï¿½tter scrollPane sammen
			table = new JTable();
			scrollPane.setViewportView(table);
			table.setVisible(true);




			JScrollPane scrollPane2 = new JScrollPane();
			scrollPane2.setBounds(919, 61, 314, 56);
			mainframe.getContentPane().add(scrollPane2);


			table2 = new JTable();
			table2.setBounds(135, 229, 650, 64);
			scrollPane2.setViewportView(table2);
			table2.setVisible(true);
			//			scrollPane2.setViewportView(table2);



			JScrollPane scrollPane3 = new JScrollPane();
			scrollPane3.setBounds(919, 155, 314, 56);
			mainframe.getContentPane().add(scrollPane3);


			table3 = new JTable();
			table3.setBounds(135, 229, 650, 64);
			scrollPane3.setViewportView(table3);
			table3.setVisible(true);
			//			scrollPane2.setViewportView(table2)	



			JScrollPane scrollPane4 = new JScrollPane();
			scrollPane4.setBounds(44, 755, 1736, 160);
			mainframe.getContentPane().add(scrollPane4);


			table4 = new JTable();
			table4.setBounds(135, 229, 650, 64);
			scrollPane4.setViewportView(table4);
			table4.setVisible(true);
			//			scrollPane2.setViewportView(table2)



//			Udlandsting .. gem!
//
//			JScrollPane scrollPane5 = new JScrollPane();
//			scrollPane5.setBounds(74, 32, 314, 56);
//			mainframe.getContentPane().add(scrollPane5);
//
//
//			table5 = new JTable();
//			table5.setBounds(135, 229, 650, 64);
//			scrollPane5.setViewportView(table5);
//			table5.setVisible(true);
//			//			scrollPane2.setViewportView(table2);



//			Udlandsting .. gem!
//			JScrollPane scrollPane6 = new JScrollPane();
//			scrollPane6.setBounds(74, 104, 314, 56);
//			mainframe.getContentPane().add(scrollPane6);
//
//
//			table6 = new JTable();
//			table6.setBounds(165, 269, 660, 64);
//			scrollPane6.setViewportView(table6);
//			table6.setVisible(true);


//			Udlandsting .. gem!
//			JScrollPane scrollPane7 = new JScrollPane();
//			scrollPane7.setBounds(74, 191, 314, 40);
//			mainframe.getContentPane().add(scrollPane7);
//
//
//			table7 = new JTable();
//			table7.setBounds(144, 244, 640, 44);
//			scrollPane7.setViewportView(table7);
//			table7.setVisible(true);
//
//			
//			JScrollPane scrollPane8 = new JScrollPane();
//			scrollPane8.setBounds(94, 275, 344, 40);
//			mainframe.getContentPane().add(scrollPane8);
//

//			Udlandsting .. gem!
//			table8 = new JTable();
//			table8.setBounds(114, 214, 610, 44);
//			scrollPane8.setViewportView(table8);
//			table8.setVisible(true);
//


			ArrayList<MomsOpg> results = MomsSQL.moms();


			//			ArrayList<MomsOpg> resultKoebsMoms = MomsSQL.koebsMoms();


			// Opretter object der navngives "header" og giver den parametre. 
			Object[] header = {"idbills","Leverandør", "Udgiftskategori", "Momssats", "valuta", "beskrivelse", 
					"Eksl. moms", "betalt", "dato"};

			//Opretter et todimentionelt array (kaldet data) af Object
			Object[][] data = new Object[results.size()][];

			//Looper igennem hvert element i results ArrayListen  
			int i=0;
			for (MomsOpg momsOpg : results) {

				// toObjectArray returnere et object array, hvilket blive gemt i data[].
				data[i] = momsOpg.toObjectArrayRegning();
				i++;
			}





			// for faktura .. vist alt
			ArrayList<MomsOpg> fakturaRes = MomsSQL.faktura();


			//			ArrayList<MomsOpg> resultKoebsMoms = MomsSQL.koebsMoms();


			// Opretter object der navngives "header" og giver den parametre. 
			Object[] header4 = {"idFaktura","Fornavn", "Efternvn", "Tlf", "Email", "Vej", 
					"Postnummer", "By", "CVR", "Virksomhedsnan", "Kategori", "Beskrivelse","Pris eksl. moms", 
					"Momssats", "Dato", "betalt"};

			//Opretter et todimentionelt array (kaldet data) af Object
			Object[][] dataFak = new Object[fakturaRes.size()][];

			//Looper igennem hvert element i results ArrayListen  
			int m=0;
			for (MomsOpg momsOpg : fakturaRes) {

				// toObjectArray returnere et object array, hvilket blive gemt i data[].
				dataFak[m] = momsOpg.toObjectArrayFaktura();
				m++;
			}











			ArrayList<MomsOpg> resultKoebsMoms = MomsSQL.koebsMoms();


			Object[] header2 = {"indgående moms (købsmoms) i alt"};


			//Opretter et todimentionelt array (kaldet data) af Object
			Object[][] dataSum = new Object[resultKoebsMoms.size()][1];


			//Looper igennem hvert element i results ArrayListen  
			int j=0;
			for (MomsOpg momsOpg : resultKoebsMoms) {

				// toObjectArray returnere et object array, hvilket blive gemt i data[].
				dataSum[j] = momsOpg.toObjectArray2();

				j++;
			}






			ArrayList<MomsOpg> resultSalgsMoms = MomsSQL.salgsMoms();


			Object[] header3 = {"Udgående moms (salgsmoms) i alt"};


			//Opretter et todimentionelt array (kaldet data) af Object
			Object[][] dataSum2 = new Object[resultSalgsMoms.size()][1];


			//Looper igennem hvert element i results ArrayListen  
			int k=0;
			for (MomsOpg momsOpg : resultSalgsMoms) {

				// toObjectArray returnere et object array, hvilket blive gemt i data[].
				dataSum2[k] = momsOpg.toObjectArray3();

				k++;
			}











			ArrayList<MomsOpg> momsVarerUdland = MomsSQL.momsVareUdland();


			// Opretter object der navngives "header" og giver den parametre. 
			Object[] header5 = {"Moms af varer købt i udlandet"};

			Object[][] dataSum5 = new Object[momsVarerUdland.size()][1];



			int l=0;
			for (MomsOpg momsOpg : momsVarerUdland) {

				// toObjectArray returnere et object array, hvilket blive gemt i data[].
				dataSum5[l] = momsOpg.toObjectArray5();

				l++;
			}





//
//			ArrayList<MomsOpg> momsYdelserUdland = MomsSQL.momsYdelseUdland();
//
//
//			// Opretter object der navngives "header" og giver den parametre. 
//			Object[] header6 = {"Moms af ydelser købt i udlandet"};
//
//			Object[][] dataSum6 = new Object[momsYdelserUdland.size()][1];
//
//
//
//			int q=0;
//			for (MomsOpg momsOpg : momsYdelserUdland) {
//
//				// toObjectArray returnere et object array, hvilket blive gemt i data[].
//				dataSum6[q] = momsOpg.toObjectArray6();
//
//				q++;
//			}
//
//
//			
//
//			ArrayList<MomsOpg> rubAVarer = MomsSQL.rubAVarer();


			// Opretter object der navngives "header" og giver den parametre. 
//			Object[] header7 = {"Rubrik A - Varer"};
//
//			Object[][] dataSum7 = new Object[rubAVarer.size()][1];
//
//
//
//			int qq=0;
//			for (MomsOpg momsOpg : rubAVarer) {
//
//				// toObjectArray returnere et object array, hvilket blive gemt i data[].
//				dataSum7[qq] = momsOpg.toObjectArray7();
//
//				qq++;
//			}
// 
////
//			
//
//			ArrayList<MomsOpg> rubAYdelse = MomsSQL.rubAYdelser();
//
//
//			// Opretter object der navngives "header" og giver den parametre. 
//			Object[] header8 = {"Rubrik A - Ydelser"};
//
//			Object[][] dataSum8 = new Object[rubAYdelse.size()][1];
//
//
//
//			int qqw=0;
//			for (MomsOpg momsOpg : rubAYdelse) {
//
//				// toObjectArray returnere et object array, hvilket blive gemt i data[].
//				dataSum8[qqw] = momsOpg.toObjectArray8();
//
//				qqw++;




			//			// Opretter en DefaultTableModel, og indsï¿½tter bï¿½de data og header
			DefaultTableModel model = new DefaultTableModel(data, header);
			model.setColumnIdentifiers(header);
			table.setModel(model);



			//			 Opretter en DefaultTableModel, og indsï¿½tter bï¿½de data og header
			DefaultTableModel modelKoebsMomsSum = new DefaultTableModel(dataSum, header2);
			modelKoebsMomsSum.setColumnIdentifiers(header2);
			table2.setModel(modelKoebsMomsSum);



			//			 Opretter en DefaultTableModel, og indsï¿½tter bï¿½de data og header
			DefaultTableModel modelSalgsMoms = new DefaultTableModel(dataSum2, header3);
			modelSalgsMoms.setColumnIdentifiers(header3);
			table3.setModel(modelSalgsMoms);




			//			 Opretter en DefaultTableModel, og indsï¿½tter bï¿½de data og header
			DefaultTableModel modelFakt = new DefaultTableModel(dataFak, header4);
			modelFakt.setColumnIdentifiers(header4);
			table4.setModel(modelFakt);
			//			




			//			 Opretter en DefaultTableModel, og indsï¿½tter bï¿½de data og header
//			DefaultTableModel modelMomsVarUd = new DefaultTableModel(dataSum5, header5);
//			modelMomsVarUd.setColumnIdentifiers(header5);
//			table5.setModel(modelMomsVarUd);

//
//			//			Opretter en DefaultTableModel, og indsï¿½tter bï¿½de data og header
//			DefaultTableModel modelMomsYdUd = new DefaultTableModel(dataSum6, header6);
//			modelMomsYdUd.setColumnIdentifiers(header6);
//			table6.setModel(modelMomsYdUd);
//
//
//			//			Opretter en DefaultTableModel, og indsï¿½tter bï¿½de data og header
//			DefaultTableModel modelRubAVarer = new DefaultTableModel(dataSum7, header7);
//			modelRubAVarer.setColumnIdentifiers(header7);
//			table7.setModel(modelRubAVarer);
//			
//			//			Opretter en DefaultTableModel, og indsï¿½tter bï¿½de data og header
//			DefaultTableModel modelRubAYdelser = new DefaultTableModel(dataSum8, header8);
//			modelRubAYdelser.setColumnIdentifiers(header8);
//			table8.setModel(modelRubAYdelser);



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

		JLabel lblGrundlagForKbsmoms = new JLabel("Grundlag for k\u00F8bsmoms");
		lblGrundlagForKbsmoms.setFont(new Font("Tahoma", Font.ITALIC, 28));
		lblGrundlagForKbsmoms.setBounds(186, 452, 297, 34);
		mainframe.getContentPane().add(lblGrundlagForKbsmoms);

		JLabel lblSalgsMoms = new JLabel("Grundlag for salgsmoms");
		lblSalgsMoms.setFont(new Font("Tahoma", Font.ITALIC, 28));
		lblSalgsMoms.setBounds(270, 701, 444, 34);
		mainframe.getContentPane().add(lblSalgsMoms);


		btnTilbage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainframe.setVisible(false);
			}
		});

	}
}
