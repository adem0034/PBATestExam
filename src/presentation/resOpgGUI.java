/*
 * Medlem der indeholder de 3 undermetoders knapper (opret,oversigt,slet)
 */
package presentation;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dlayer.ResopgSQL;
import model.ResOpg;

public class resOpgGUI {

	private static JTable table;
	private static JTable table2;
	private static JTable table3;
	private static JTable table_1;
	private static JTextField txtNettores;

	
	
  public resOpgGUI()
  {
   init();
  }
  
  public static void init() 
  {
	  // Opretter en JFrame og  laver designet
	final JFrame mainframe = new JFrame("GJKFK");
    mainframe.setSize(1013,730);
    mainframe.setVisible(true);
    mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    mainframe.setLocationRelativeTo(null);
    mainframe.getContentPane().setLayout(null);
    
    
    
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(46, 101, 184, 66);
	mainframe.getContentPane().add(scrollPane);
	
	table = new JTable();
	scrollPane.setViewportView(table);
	table.setVisible(true);
	
	
	
	JScrollPane scrollPane2 = new JScrollPane();
	scrollPane2.setBounds(46, 239, 184, 66);
	mainframe.getContentPane().add(scrollPane2);
	
	
	table2 = new JTable();
	scrollPane2.setViewportView(table2);
	table2.setVisible(true);
	

	
	JScrollPane scrollPane3 = new JScrollPane();
	scrollPane3.setBounds(42, 381, 695, 87);
	mainframe.getContentPane().add(scrollPane3);
	
	
	table3 = new JTable();
	scrollPane3.setViewportView(table3);
	table3.setVisible(true);
	
	
	

    // Opretter btnTilbage og lukker vinduet ned.
    JButton btnTilbage = new JButton("Tilbage");
    btnTilbage.setBounds(12, 641, 97, 29);
    mainframe.getContentPane().add(btnTilbage);
    
    JComboBox comboYear = new JComboBox();
    comboYear.setBounds(188, 13, 238, 22);
    mainframe.getContentPane().add(comboYear);
    
    JLabel lblIndtgter = new JLabel("Indt\u00E6gter (bruttores)");
    lblIndtgter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
    lblIndtgter.setBounds(49, 65, 203, 21);
    mainframe.getContentPane().add(lblIndtgter);
    
    JLabel lblVlgr = new JLabel("V\u00E6lg \u00E5r");
    lblVlgr.setBounds(90, 16, 86, 16);
    mainframe.getContentPane().add(lblVlgr);
    
    
    
    
//    
//    txtSumsalg.setText("sumSalg");
//    txtSumsalg.setBounds(213, 96, 116, 22);
//    mainframe.getContentPane().add(txtSumsalg);
//    txtSumsalg.setColumns(10);
    
    JLabel lblUdgifter = new JLabel("Udgifter");
    lblUdgifter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
    lblUdgifter.setBounds(49, 199, 109, 21);
    mainframe.getContentPane().add(lblUdgifter);
    
    JLabel lblNettoresultat = new JLabel("Nettoresultat");
    lblNettoresultat.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
    lblNettoresultat.setBounds(34, 479, 134, 16);
    mainframe.getContentPane().add(lblNettoresultat);
    btnTilbage.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
     mainframe.setVisible(false);
    }
   });
    
    
   
	
	
    
	ArrayList<ResOpg> resop = null;
	try {
		resop = ResopgSQL.sumIncome();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	Object[][] data = new Object[resop.size()][];

	
	
	int i=0;
	for (ResOpg resOpg : resop) {

		// toObjectArray returnere et object array, hvilket blive gemt i data[].
		data[i] = resOpg.toObjectArray();
		i++;
	}

	
	Object[] header = {"Totale indtægter"};
			
   
	
	DefaultTableModel model = new DefaultTableModel(data, header);
	model.setColumnIdentifiers(header);
	table.setModel(model);
	
	
	
	
	
	
	
	
	
	
	ArrayList<ResOpg> resopEx = null;
	try {
		resopEx = ResopgSQL.sumExpense();
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	
	Object[][] data2 = new Object[resopEx.size()][];

	
	
	int j=0;
	for (ResOpg resOpg : resopEx) {

		// toObjectArray returnere et object array, hvilket blive gemt i data[].
		data2[j] = resOpg.toObjectArray2();
		j++;
	}

	
	Object[] header2 = {"Totale udgifter"};
			
   
	
	DefaultTableModel model2 = new DefaultTableModel(data2, header2);
	model2.setColumnIdentifiers(header2);
	table2.setModel(model2);
	
	
	
	
	
//	For grundlag
	
	ArrayList<ResOpg> resGrund = null;
	try {
		resGrund = ResopgSQL.sumGrund();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	Object[][] data3 = new Object[resGrund.size()][];

	
	
	int l=0;
	for (ResOpg resOpg : resGrund) {

		// toObjectArray returnere et object array, hvilket blive gemt i data[].
		data3[l] = resOpg.toObjectArray3();
		l++;
	}

	
	Object[] header3 = {"Div udgifter", "IT", "Kontorartikler", "Reklame", 
							"Website", "Småanskaffelser"};
			
   
	
	DefaultTableModel model3 = new DefaultTableModel(data3, header3);
	model3.setColumnIdentifiers(header3);
	table3.setModel(model3);
	
	JLabel lblUdgifterForklaret = new JLabel("Udgifter forklaret: ");
	lblUdgifterForklaret.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
	lblUdgifterForklaret.setBounds(49, 337, 203, 21);
	mainframe.getContentPane().add(lblUdgifterForklaret);
	
	txtNettores = new JTextField();
	txtNettores.setText("nettoRes");
	txtNettores.setBounds(42, 533, 116, 22);
	mainframe.getContentPane().add(txtNettores);
	txtNettores.setColumns(10);
	

	
	
	
////	For nettoresultat
	ArrayList<ResOpg> resNet = null;
	try {
		resNet = ResopgSQL.sumIncome();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	
	
	Object[] header4 = {"Nettoresultat (indtægt - udgifter"};
			
   
	
	DefaultTableModel model4 = new DefaultTableModel(data3, header4);
	model4.setColumnIdentifiers(header4);
	
	
		

	int inc = (int) table.getModel().getValueAt(0, 0);
	double exp = (double) table2.getModel().getValueAt(0, 0);
	double total = inc - exp;
	
	txtNettores.setText("" + total);
	
	
	
    
   }
 }