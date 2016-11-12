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

import dlayer.RegningSQL;

public class RegningGUI {
	private static JTextField txtLeverandr;
	private static JTextField txtValuta;
	private static JTextField txtPriseksmoms;
	private static JTextField txtRegningsdag;

	public RegningGUI()
	{
		init();
	} 

	public static void init() 
	{
		// Opretter en JFrame og  laver designet
		final JFrame mainframe = new JFrame("REGNING - opret");
		mainframe.setSize(630,536);
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainframe.getContentPane().setLayout(null);
		mainframe.setLocationRelativeTo(null);

		// Opretter btnTilbage og lukker vinduet ned.
		JButton btnTilbage = new JButton("Tilbage");
		btnTilbage.setBounds(12, 447, 97, 29);
		mainframe.getContentPane().add(btnTilbage);

		JComboBox<String> comboBox = new JComboBox<String>();


		BillCategories billCat = new BillCategories();

		billCat.getCombo(comboBox);


		comboBox.setBounds(255, 32, 331, 22);
		mainframe.getContentPane().add(comboBox);

		JLabel lblKategori = new JLabel("kategori");
		lblKategori.setBounds(12, 35, 87, 16);
		mainframe.getContentPane().add(lblKategori);

		JLabel lblBetaltikkeBetalt = new JLabel("betalt/ikke betalt");
		lblBetaltikkeBetalt.setBounds(12, 139, 95, 16);
		mainframe.getContentPane().add(lblBetaltikkeBetalt);

		JCheckBox chckbxBetalt = new JCheckBox("Betalt");
		chckbxBetalt.setBounds(255, 135, 113, 25);
		mainframe.getContentPane().add(chckbxBetalt);

		JLabel lblLeverandr = new JLabel("Leverand\u00F8r");
		lblLeverandr.setBounds(12, 172, 97, 16);
		mainframe.getContentPane().add(lblLeverandr);

		txtLeverandr = new JTextField();
		txtLeverandr.setText("Leverand\u00F8r");
		txtLeverandr.setBounds(241, 169, 116, 22);
		mainframe.getContentPane().add(txtLeverandr);
		txtLeverandr.setColumns(10);

		JLabel lblValuta = new JLabel("Valuta");
		lblValuta.setBounds(12, 241, 56, 16);
		mainframe.getContentPane().add(lblValuta);

		txtValuta = new JTextField();
		txtValuta.setText("valuta");
		txtValuta.setBounds(241, 245, 116, 22);
		mainframe.getContentPane().add(txtValuta);
		txtValuta.setColumns(10);

		JLabel lblBeskrivelse = new JLabel("Beskrivelse");
		lblBeskrivelse.setBounds(12, 297, 128, 16);
		mainframe.getContentPane().add(lblBeskrivelse);

		JTextPane txtpnBeskrivelse = new JTextPane();
		txtpnBeskrivelse.setText("beskrivelse");
		txtpnBeskrivelse.setBounds(241, 280, 164, 60);
		mainframe.getContentPane().add(txtpnBeskrivelse);

		txtPriseksmoms = new JTextField();
		txtPriseksmoms.setText("prisEksMoms");
		txtPriseksmoms.setBounds(241, 353, 116, 22);
		mainframe.getContentPane().add(txtPriseksmoms);
		txtPriseksmoms.setColumns(10);

		JLabel lblPriseksmoms = new JLabel("prisEksMoms");
		lblPriseksmoms.setBounds(12, 356, 128, 16);
		mainframe.getContentPane().add(lblPriseksmoms);

		JLabel lblUploadBilag = new JLabel("Upload bilag:");
		lblUploadBilag.setBounds(378, 407, 113, 16);
		mainframe.getContentPane().add(lblUploadBilag);

		JButton btnGemRegning = new JButton("Gem Regning");
		btnGemRegning.addActionListener(new ActionListener() {
//			gemRegning(mainframe, comboBox, chckbxBetalt, txtpnBeskrivelse); 

			public void actionPerformed(ActionEvent arg0) {

				//    		 SQL stuff here .... 

				// Gemmer regningen med alle de udfyldte felter
				gemRegning(mainframe, comboBox, chckbxBetalt, txtpnBeskrivelse); 

				/* Udover at gemme regningen, sï¿½ skal disse info ogsï¿½ sendes til
				deres egne tabeller */
				int priceNoVat = Integer.parseInt(txtPriseksmoms.getText());

				//		*** SALGSOMKOSTNINGER **

				if (comboBox.equals("1210 - Vareinkï¿½b")) {
					try {
						RegningSQL.add1210VareIndkoeb(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				else if (comboBox.equals("1220 - Kï¿½b af varer i EU")) {
					try {
						RegningSQL.add1220KoebVarerEU(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1230 - Kï¿½b af ydeleser i EU")) {
					try {
						RegningSQL.add1230KoebYdelseEU(priceNoVat);;
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1240 - Kï¿½b af varer udenfor EU")) {
					try {
						RegningSQL.add1240KoebVarerUdland(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}



				else if (comboBox.equals("1250 - Kï¿½b af ydelser udenfor EU")) {
					try {
						RegningSQL.add1250KoebYdelseUdland(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}



				else if (comboBox.equals("1260 - Regulering af varelager")) {
					try {
						RegningSQL.add1260ReguleringVarerlager(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}



				else if (comboBox.equals("1270 - Andre direkte omkostninger")) {
					try {
						RegningSQL.add1270AndreDivOmkost(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				// **** 	1400 - Lï¿½nomkostninger **** 


				else if (comboBox.equals("1410 - AM-indkomst")) {
					try {
						RegningSQL.add1410AM(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				else if (comboBox.equals("1420 - ATP-bidrag")) {
					try {
						RegningSQL.add1420ATP(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1430 - Personalegoder")) {
					try {
						RegningSQL.add1430Personalegoder(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1440 - Personalepleje")) {
					try {
						RegningSQL.add1440Personalepleje(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1450 - Pension")) {
					try {
						RegningSQL.add1450Pension(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1460 - Fradrag")) {
					try {
						RegningSQL.add1460Fradrag(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}



				else if (comboBox.equals("1470 - Sociale omkostninger")) {
					try {
						RegningSQL.add1470Socialeomkost(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1480 - Tillï¿½g")) {
					try {
						RegningSQL.add1480Tillaeg(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1485 - B-honorar")) {
					try {
						RegningSQL.add1485BHonorar(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1490 - Feriepenge")) {
					try {
						RegningSQL.add1490Feriepenge(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				//			***				1500 - Lokaleomkostninger **** 


				else if (comboBox.equals("1510 - Husleje med moms")) {
					try {
						RegningSQL.add1510HuslejeInkMoms(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1530 - El, vand og varme")) {
					try {
						RegningSQL.add1530ElVandVarme(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1540 - Vedligeholdelse og rengï¿½ring")) {
					try {
						RegningSQL.add1540VedligeholdRengoering(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1550 - Forsikringer(lokale)")) {
					try {
						RegningSQL.add1550ForsikringLokale(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				//		********				1600 - Marketing- og rejseomkostninger

				else if (comboBox.equals("1610 - Fragtudgifter")) {
					try {
						RegningSQL.add1210VareIndkoeb(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1620 - Transport og rejser")) {
					try {
						RegningSQL.add1210VareIndkoeb(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1630 - Reklamer og markedsfï¿½ring")) {
					try {
						RegningSQL.add1210VareIndkoeb(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}



				else if (comboBox.equals("1640 - Hotel")) {
					try {
						RegningSQL.add1640Hotel(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}



				else if (comboBox.equals("1650 - Reprï¿½sentation")) {
					try {
						RegningSQL.add1650Raepraesentation(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1660 - Restaurant")) {
					try {
						RegningSQL.add1660Restaurant(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				//				   ****   1700 - Bilomkostninger ****
				else if (comboBox.equals("1710 - Brï¿½ndstof")) {
					try {
						RegningSQL.add1710Braendstof(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1720 - Vedligeholdelse")) {
					try {
						RegningSQL.add1720Vedligeholdelse(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}



				else if (comboBox.equals("1730 - Parkering")) {
					try {
						RegningSQL.add1730Parkering(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1740 - Bilforsikring")) {
					try {
						RegningSQL.add1740BilForsikring(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1750 - Vï¿½gtafgift")) {
					try {
						RegningSQL.add1750Vaegtafgift(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				//						****  1800 - Administrationsomkostninger

				else if (comboBox.equals("1810 - Kontorartikler")) {
					try {
						RegningSQL.add1810Kontorartikler(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}



				else if (comboBox.equals("1820 - Website")) {
					try {
						RegningSQL.add1820Website(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1830 - Telefon og Internet")) {
					try {
						RegningSQL.add1830TlfInternet(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1840 - Smï¿½ anskaffelser")) {
					try {
						RegningSQL.add1840smaaanskaffelser(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1850 - Kï¿½rselsgodtgï¿½relse")) {
					try {
						RegningSQL.add1850Koerselsgodtgoerelse(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}



				else if (comboBox.equals("1860 - Konsulenter og freelancere")) {
					try {
						RegningSQL.add1860KonsulentFreelance(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1870 - Forsikring")) {
					try {
						RegningSQL.add1870Forsikringer(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1880 - Inventar")) {
					try {
						RegningSQL.add1880Inventar(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("1890 - Tab pï¿½ kunder")) {
					try {
						RegningSQL.add1890TabPaaKunder(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}



				else if (comboBox.equals("1895 - Ej fradragsberretigede omkostninger")) {
					try {
						RegningSQL.add1895IkkeFradragBeretOmkost(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				//						*** 2000 - Afskrivninger


				else if (comboBox.equals("2010 - Afskrivninger")) {
					try {
						RegningSQL.add2010Afskrivninger(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				//				****		2300 - Finansielle udgifter

				else if (comboBox.equals("2310 - Renteudgifter")) {
					try {
						RegningSQL.add2310Renteudgift(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}



				else if (comboBox.equals("2320 - Gebyrer")) {
					try {
						RegningSQL.add2320Gebyrer(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				//				**** 		2500 - Ekstraordinï¿½re poster

				else if (comboBox.equals("2520 - Ekstraordinï¿½re poster")) {
					try {
						RegningSQL.add2520EkstraUdgiftMoms(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				//				***  5200 - Immaterielle anlï¿½gsaktiver


				else if (comboBox.equals("5210 - Immatterielle anlï¿½gsaktiver")) {
					try {
						RegningSQL.add5210ImmatAnlægsaktiv(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				//				***  5300 - Materielle anlï¿½gsaktiver

				else if (comboBox.equals("5310 - Driftsmidler og inventar(kostpris)")) {
					try {
						RegningSQL.add5310DriftInventarKostpris(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("5320 - Driftsmidler og inventar, akkumulerde afskrivninger ")) {
					try {
						RegningSQL.add5320DriftInventarAkkuAfskriv(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				//				***			5400 - Finansielle anlï¿½gsaktiver
				else if (comboBox.equals("5410 - Kapitalandele af tilknyttede virksomheder")) {
					try {
						RegningSQL.add5410KapAndelTilknytVirk(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("5420 - Kapitalandele af associerede virksomheder")) {
					try {
						RegningSQL.add5420KapAndelAssVirk(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("5430 - Andre vï¿½rdipapirer og kapitalandele")) {
					try {
						RegningSQL.add5430AndreVaerdiKapital(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("5440 - Deposita")) {
					try {
						RegningSQL.add5440Deposita(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				//				** 		5700 - Bank- og kontantbeholdninger ** 


				else if (comboBox.equals("5710 - Bank")) {
					try {
						RegningSQL.add5710Bank(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("5720 - Konantbeholdning")) {
					try {
						RegningSQL.add5720Kontantbeholdning(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				//						** 5800 - Omsï¿½tningsaktiver

				else if (comboBox.equals("5810 - Til gode hos kunder")) {
					try {
						RegningSQL.add5810TilgodeKunder(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


				else if (comboBox.equals("5820 - Til gode hos leverandï¿½rer")) {
					try {
						RegningSQL.add5820TilgodeLeverand(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				
				else if (comboBox.equals("5830 - Varelager")) {
					try {
						RegningSQL.add5830Varelager(priceNoVat);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}



			}

			


		});
		btnGemRegning.setBounds(402, 449, 177, 25);
		mainframe.getContentPane().add(btnGemRegning);

		JLabel lblRegningsdag = new JLabel("Regningsdag");
		lblRegningsdag.setBounds(12, 110, 104, 16);
		mainframe.getContentPane().add(lblRegningsdag);

		txtRegningsdag = new JTextField();
		txtRegningsdag.setText("regningsdag");
		txtRegningsdag.setBounds(241, 104, 116, 22);
		mainframe.getContentPane().add(txtRegningsdag);
		txtRegningsdag.setColumns(10);








		//    System.out.println(chckbxBetalt.isSelected());

		btnTilbage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainframe.setVisible(false);
			}
		});




	}
	public static void gemRegning(final JFrame mainframe, JComboBox<String> comboBox, JCheckBox chckbxBetalt,
			JTextPane txtpnBeskrivelse) {
		String supplier = txtLeverandr.getText();
		String category = (String) comboBox.getSelectedItem();
		//				String momsType = (String)  comboBoxMoms.getSelectedItem();
		String currency = txtValuta.getText();
		int priceNoVat = Integer.parseInt(txtPriseksmoms.getText());
		boolean paid = chckbxBetalt.isSelected();
		String date = txtRegningsdag.getText();
		String descript = txtpnBeskrivelse.getText();


		GetCategory getCat = new GetCategory();

		category = getCat.getCat(category, priceNoVat);

		GetMoms getMoms = new GetMoms();

		int momsType = getMoms.getMoms(category);

 



		try {
 
			RegningSQL.addRegning(supplier, category, momsType, descript, currency, priceNoVat, paid, date);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// printer bekrï¿½ftelse og disposer mainframe'en.
		JOptionPane.showMessageDialog(null, "Regningen fra  " + supplier + " " +" er oprettet i Databasen");
		mainframe.dispose();
	}
}