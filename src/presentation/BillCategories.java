package presentation;
import javax.swing.JComboBox;

public class BillCategories {

	

	public void getCombo(JComboBox<String> comboBox) {
		
//		1200 - Salgsomkostninger
		comboBox.addItem("          **** 1200 - Salgsomkostninger ****");
		comboBox.addItem("1210 - Vareinkøb");
//		comboBox.addItem("1220 - Køb af varer i EU");
//		comboBox.addItem("1230 - Køb af ydeleser i EU");
//		comboBox.addItem("1240 - Køb af varer udenfor EU");
//		comboBox.addItem("1250 - Køb af ydelser udenfor EU");
		comboBox.addItem("1260 - Regulering af varelager");
		comboBox.addItem("1270 - Andre direkte omkostninger");
		comboBox.addItem("");

		
//		1400 - Lønomkostninger
		comboBox.addItem("          **** 1400 - Lønomkostninger ****");
		comboBox.addItem("1410 - AM-indkomst");
		comboBox.addItem("1420 - ATP-bidrag");
		comboBox.addItem("1430 - Personalegoder");
		comboBox.addItem("1440 - Personalepleje");
		comboBox.addItem("1450 - Pension");
		comboBox.addItem("1460 - Fradrag");
		comboBox.addItem("1470 - Sociale omkostninger");
		comboBox.addItem("1480 - Tillæg");
		comboBox.addItem("1485 - B-honorar");
		comboBox.addItem("1490 - Feriepenge");
		comboBox.addItem("");

		
//		1500 - Lokaleomkostninger
		comboBox.addItem("          **** 1500 - Lokaleomkostninger ****");
		comboBox.addItem("1510 - Husleje med moms");
		comboBox.addItem("1520 - Husleje uden moms");
		comboBox.addItem("1530 - El, vand og varme");
		comboBox.addItem("1540 - Vedligeholdelse og rengøring");
		comboBox.addItem("1550 - Forsikringer(lokale)");
		comboBox.addItem("");

		
//		1600 - Marketing- og rejseomkostninger
		comboBox.addItem("          **** 1600 - Marketing- og lokaleomkostninger ****");
		comboBox.addItem("1610 - Fragtudgifter");
		comboBox.addItem("1620 - Transport og rejser");
		comboBox.addItem("1630 - Reklamer og markedsføring");
		comboBox.addItem("1640 - Hotel");
		comboBox.addItem("1650 - Repræsentation");
		comboBox.addItem("1660 - Restaurant");
		comboBox.addItem("");

		
//		1700 - Bilomkostninger
//		comboBox.addItem("          **** 1700 - Bilomkostninger ****");
//		comboBox.addItem("1710 - Brændstof");
//		comboBox.addItem("1720 - Vedligeholdelse");
//		comboBox.addItem("1730 - Parkering");
//		comboBox.addItem("1740 - Bilforsikring");
//		comboBox.addItem("1750 - Vægtafgift");
		comboBox.addItem("");

		
//		1800 - Administrationsomkostninger
		comboBox.addItem("          ****  1800 - Administrationsomkostninger ****");
		comboBox.addItem("1810 - Kontorartikler");
		comboBox.addItem("1820 - Website");
		comboBox.addItem("1830 - Telefon og Internet");
		comboBox.addItem("1840 - Små anskaffelser");
		comboBox.addItem("1850 - Kørselsgodtgørelse");
		comboBox.addItem("1860 - Konsulenter og freelancere");
		comboBox.addItem("1870 - Forsikring");
		comboBox.addItem("1880 - Inventar");
		comboBox.addItem("1890 - Tab på kunder");
		comboBox.addItem("1895 - Ej fradragsberretigede omkostninger");
		comboBox.addItem("");
		
		
//		2000 - Afskrivninger
		comboBox.addItem("          **** 2000 - Afskrivninger ****");
		comboBox.addItem("2010 - Afskrivninger");
		comboBox.addItem("");

		
		
//		2300 - Finansielle udgifter
		comboBox.addItem("          **** 2300 Finansielle udgifter ****");
		comboBox.addItem("2310 - Renteudgifter");
		comboBox.addItem("2320 - Gebyrer");
		comboBox.addItem("");


//		2500 - Ekstraordinære poster
		comboBox.addItem("          **** 2500 - Ekstraordinære poster ****");
		comboBox.addItem("2520 - Ekstraordinære poster");
		comboBox.addItem("");

		
//		5200 - Immaterielle anlægsaktiver
		comboBox.addItem("          **** 5200 - Immaterielle anlægsaktiver ****");
		comboBox.addItem("5210 - Immatterielle anlægsaktiver");
		comboBox.addItem("");

		
		
//		5300 - Materielle anlægsaktiver
		comboBox.addItem("          **** 5300 - Materielle anlægsaktiver ****");
		comboBox.addItem("5310 - Driftsmidler og inventar(kostpris)");
		comboBox.addItem("5320 - Driftsmidler og inventar, akkumulerde afskrivninger ");
		comboBox.addItem("");

		
		
//		5400 - Finansielle anlægsaktiver
		comboBox.addItem("          **** 5400 - Finansielle anlægsaktiver ****");
		comboBox.addItem("5410 - Kapitalandele af tilknyttede virksomheder");
		comboBox.addItem("5420 - Kapitalandele af associerede virksomheder");
		comboBox.addItem("5430 - Andre værdipapirer og kapitalandele");
		comboBox.addItem("5440 - Deposita");
		comboBox.addItem("");

		
		
//		5700 - Bank- og kontantbeholdninger
		comboBox.addItem("          **** 5700 - Bank- og kontantbeholdninger ");
		comboBox.addItem("5710 - Bank");
		comboBox.addItem("5720 - Konantbeholdning");
		comboBox.addItem("");

		
		
//		5800 - Omsætningsaktiver
		comboBox.addItem("          **** 5800 - Omsætningsaktiver");
		comboBox.addItem("5810 - Til gode hos kunder");
		comboBox.addItem("5820 - Til gode hos leverandører");
		comboBox.addItem("5830 - Varelager");

		
		
		
		
		
		
		
	}
}