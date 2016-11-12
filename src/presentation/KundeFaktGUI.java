/*
 * Medlem der indeholder de 3 undermetoders knapper (opret,oversigt,slet)
 */
package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import dlayer.FakturaSQL;

public class KundeFaktGUI {
	private static JTextField txtFornavn;
	private static JTextField txtEfternavn;
	private static JTextField txtEmail;
	private static JTextField txtTlf; 
	private static JTextField txtVej;
	private static JTextField txtPostnummer;
	private static JTextField txtBy;
	private static JTextField txtCvr;
	private static JTextField txtVirknavn;
	private static JTextField txtEksmomssum;
	private static JTextField txtDato;

	public KundeFaktGUI()
	{
		init();
	}

	public static void init() 
	{
		// Opretter en JFrame og  laver designet
		final JFrame mainframe = new JFrame("GJKFK");
		mainframe.setSize(869,908);
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainframe.setLocationRelativeTo(null);
		mainframe.getContentPane().setLayout(null);


		JComboBox<String> comboBox = new JComboBox<String>();

		InvoiceCategory invCat = new InvoiceCategory();

		invCat.getCombo(comboBox);


		comboBox.setBounds(250, 334, 282, 22);
		mainframe.getContentPane().add(comboBox);




		// Opretter btnTilbage og lukker vinduet ned.
		JButton btnTilbage = new JButton("Tilbage");
		btnTilbage.setBounds(23, 819, 97, 29);
		mainframe.getContentPane().add(btnTilbage);

		JLabel lblBetaltikkeBetalt = new JLabel("betalt/ikke betalt");
		lblBetaltikkeBetalt.setBounds(23, 612, 95, 16);
		mainframe.getContentPane().add(lblBetaltikkeBetalt);

		JCheckBox chckbxBetalt = new JCheckBox("Betalt");
		chckbxBetalt.setBounds(243, 608, 113, 25);
		mainframe.getContentPane().add(chckbxBetalt);

		JLabel lblBeskrivelse = new JLabel("Beskrivelse");
		lblBeskrivelse.setBounds(12, 369, 128, 16);
		mainframe.getContentPane().add(lblBeskrivelse);

		JTextPane txtBeskrivelse = new JTextPane();
		txtBeskrivelse.setBounds(240, 369, 164, 60);
		txtBeskrivelse.setText("beskrivelse");
		mainframe.getContentPane().add(txtBeskrivelse);

		JLabel lblUploadBilag = new JLabel("Upload bilag:");
		lblUploadBilag.setBounds(531, 369, 113, 16);
		mainframe.getContentPane().add(lblUploadBilag);

		JButton btnGemRegning = new JButton("Gem kundefaktura");
		btnGemRegning.setBounds(414, 821, 177, 25);
		btnGemRegning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				//    		 SQL stuff here .... 

				String fornavn = txtFornavn.getText();
				String efternavn = txtEfternavn.getText();
				String tlf = txtTlf.getText();
				String email = txtEmail.getText();
				String vej = txtVej.getText();
				String postnummer = txtPostnummer.getText();
				String by = txtBy.getText();
				String cvr = txtCvr.getText();
				String virkNavn = txtVirknavn.getText();

				String kategori = (String) comboBox.getSelectedItem();
				String beskrivelse = txtBeskrivelse.getText();
				int eksMoms = Integer.parseInt(txtEksmomssum.getText());



				GetCategory getCat = new GetCategory();

				String category = getCat.getCat(kategori, eksMoms);

				GetMoms getMoms = new GetMoms();

				int momsType = getMoms.getMomsInvoice(category);





				String dato = txtDato.getText();
				boolean betalt = chckbxBetalt.isSelected();



				try {
					// her sender/videregiver den variablerne til .addSpiller
					FakturaSQL.addFaktura(fornavn, efternavn, tlf, email, vej, postnummer, by,
							cvr, virkNavn, kategori, beskrivelse, eksMoms, momsType, dato, betalt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


				addExtra(kategori, eksMoms);



				// printer bekrï¿½ftelse og disposer mainframe'en.
				JOptionPane.showMessageDialog(null, "Fakturaen for " + fornavn + "  " + virkNavn + " " +" er oprettet i Databasen");
//				mainframe.dispose(); 




			}

			public void addExtra(String kategori, int eksMoms) {
				//		1100 - Indtï¿½gter

				if (kategori.equals("1110 - Salg")) {
					try {
						FakturaSQL.add1110Salg(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if (kategori.equals("1115 - Salg af fragt u/moms")) {
					try {
						FakturaSQL.add1115SalgFragtUdenMoms(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("1116 - Salg af fragt m/moms")) {
					try {
						FakturaSQL.add1116SalgFragtMedMoms(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("1120 - Salg til ï¿½vrig udland - varer")) {
					try {
						FakturaSQL.add1120SalgVarerUdland(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("1130 - Salg til ï¿½vrig udland - ydelser")) {
					try {
						FakturaSQL.add1130SalgYdelseUdland(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("1140 - Salg til EU - varer")) {
					try {
						FakturaSQL.add1140SalgVarerEU(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("1141 - Salg til EU - varer m/moms")) {
					try {
						FakturaSQL.add1141SalgVarerEUInklMoms(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("1150 - Salg til EU - ydelser")) {
					try {
						FakturaSQL.add1150SalgYdelseEU(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("1151 - Salg til EU - ydelser m/moms")) {
					try {
						FakturaSQL.add1151SalgYdelseEUInklMoms(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


//					2200 - Finansielle indtï¿½gter

				}	else if (kategori.equals("2220 - Rykkergebyrer")) {
					try {
						FakturaSQL.add2220RykkerGebyr(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("2230 - Renteindtï¿½gter")) {
					try {
						FakturaSQL.add2230RenteIndtægt(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("2240 - Gebyr indtï¿½gter")) {
					try {
						FakturaSQL.add2240GebyrIndtægt(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
//					2500 - Ekstraordinï¿½re poster
				}	else if (kategori.equals("2510 - Ekstraordinï¿½re indtï¿½gter m/ moms")) {
					try {
						FakturaSQL.add2510EkstraOrdIndtInklMoms(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

//					7100 - Egenkapital
				}	else if (kategori.equals("7130 - Mellemregning med ejer")) {
					try {
						FakturaSQL.add7130MellemRegnEjer(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("7140 - Indskudt kapital")) {
					try {
						FakturaSQL.add7140indskudtKapital(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					
//					7300 - Kortfristede forpligtelser

				}	else if (kategori.equals("7330 - Skyldig A-skat")) {
					try {
						FakturaSQL.add7330SkyldigASkat(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("7340 - Skyldig AM-bidrag")) {
					try {
						FakturaSQL.add7340SkyldigAM(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				

				}	else if (kategori.equals("7350 - Skyldig ATP")) {
					try {
						FakturaSQL.add7350SkyldigATP(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("7360 - Hensatte forpligtelser")) {
					try {
						FakturaSQL.add7360HensatteForpligt(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("7370 - Skyldig pension")) {
					try {
						FakturaSQL.add7370SkyldigPension(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("7380 - Skyldige feriepenge")) {
					try {
						FakturaSQL.add7380SkyldigeFeriepenge(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}	else if (kategori.equals("7390 - Skyldige sociale omkostninger")) {
					try {
						FakturaSQL.add7390SkyldigSocialOmk(eksMoms);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		});
		mainframe.getContentPane().add(btnGemRegning);

		JLabel lblFornavn = new JLabel("Fornavn");
		lblFornavn.setBounds(12, 36, 110, 16);
		mainframe.getContentPane().add(lblFornavn);

		JLabel lblEfternavn = new JLabel("Efternavn");
		lblEfternavn.setBounds(12, 65, 56, 16);
		mainframe.getContentPane().add(lblEfternavn);

		txtFornavn = new JTextField();
		txtFornavn.setText("Fornavn");
		txtFornavn.setBounds(240, 33, 116, 22);
		mainframe.getContentPane().add(txtFornavn);
		txtFornavn.setColumns(10);

		txtEfternavn = new JTextField();
		txtEfternavn.setText("Efternavn");
		txtEfternavn.setBounds(240, 62, 116, 22);
		mainframe.getContentPane().add(txtEfternavn);
		txtEfternavn.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(240, 121, 116, 22);
		mainframe.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblTlf = new JLabel("Tlf");
		lblTlf.setBounds(12, 91, 56, 16);
		mainframe.getContentPane().add(lblTlf);

		txtTlf = new JTextField();
		txtTlf.setText("tlf");
		txtTlf.setBounds(240, 88, 116, 22);
		mainframe.getContentPane().add(txtTlf);
		txtTlf.setColumns(10);

		JLabel lblVej = new JLabel("Vej");
		lblVej.setBounds(12, 155, 56, 16);
		mainframe.getContentPane().add(lblVej);

		txtVej = new JTextField();
		txtVej.setText("vej");
		txtVej.setBounds(240, 149, 116, 22);
		mainframe.getContentPane().add(txtVej);
		txtVej.setColumns(10);

		JLabel lblPostnummer = new JLabel("postnummer");
		lblPostnummer.setBounds(12, 196, 110, 16);
		mainframe.getContentPane().add(lblPostnummer);

		txtPostnummer = new JTextField();
		txtPostnummer.setText("postnummer");
		txtPostnummer.setBounds(240, 190, 116, 22);
		mainframe.getContentPane().add(txtPostnummer);
		txtPostnummer.setColumns(10);

		txtBy = new JTextField();
		txtBy.setText("by");
		txtBy.setBounds(240, 227, 116, 22);
		mainframe.getContentPane().add(txtBy);
		txtBy.setColumns(10);

		JLabel lblBy = new JLabel("by");
		lblBy.setBounds(23, 234, 56, 16);
		mainframe.getContentPane().add(lblBy);

		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(12, 120, 56, 16);
		mainframe.getContentPane().add(lblEmail);

		JLabel lblCvr = new JLabel("cvr");
		lblCvr.setBounds(12, 264, 56, 16);
		mainframe.getContentPane().add(lblCvr);

		txtCvr = new JTextField();
		txtCvr.setText("cvr");
		txtCvr.setBounds(240, 261, 116, 22);
		mainframe.getContentPane().add(txtCvr);
		txtCvr.setColumns(10);

		JLabel lblVirksomhedsnavn = new JLabel("virksomhedsnavn");
		lblVirksomhedsnavn.setBounds(12, 296, 128, 16);
		mainframe.getContentPane().add(lblVirksomhedsnavn);

		txtVirknavn = new JTextField();
		txtVirknavn.setText("virkNavn");
		txtVirknavn.setBounds(240, 293, 116, 22);
		mainframe.getContentPane().add(txtVirknavn);
		txtVirknavn.setColumns(10);

		JLabel lblEksmomssum = new JLabel("eksMomsSum");
		lblEksmomssum.setBounds(23, 482, 97, 16);
		mainframe.getContentPane().add(lblEksmomssum);

		txtEksmomssum = new JTextField();
		txtEksmomssum.setText("EksMomsSum");
		txtEksmomssum.setBounds(250, 479, 116, 22);
		mainframe.getContentPane().add(txtEksmomssum);
		txtEksmomssum.setColumns(10);

		JLabel lblDato = new JLabel("Dato");
		lblDato.setBounds(23, 536, 56, 16);
		mainframe.getContentPane().add(lblDato);

		txtDato = new JTextField();
		txtDato.setText("dato");
		txtDato.setBounds(250, 533, 116, 22);
		mainframe.getContentPane().add(txtDato);
		txtDato.setColumns(10);

		JLabel lblKategori = new JLabel("Kategori");
		lblKategori.setBounds(12, 338, 56, 16);
		mainframe.getContentPane().add(lblKategori);








		//    System.out.println(chckbxBetalt.isSelected());

		btnTilbage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainframe.setVisible(false);
			}
		});




	}
}