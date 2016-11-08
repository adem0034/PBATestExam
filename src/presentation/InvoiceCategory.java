package presentation;

import javax.swing.JComboBox;

public class InvoiceCategory {

	

	public void getCombo(JComboBox<String> comboBox) {
		
//		1100 - Indt�gter
		comboBox.addItem("          **** 1100 - Indt�gter ****");
		comboBox.addItem("1110 - Salg");
		comboBox.addItem("1115 - Salg af fragt u/moms");
		comboBox.addItem("1116 - Salg af fragt m/moms");
//		comboBox.addItem("1120 - Salg til �vrig udland - varer");
//		comboBox.addItem("1130 - Salg til �vrig udland - ydelser");
//		comboBox.addItem("1140 - Salg til EU - varer");
//		comboBox.addItem("1141 - Salg til EU - varer m/moms");
//		comboBox.addItem("1150 - Salg til EU - ydelser");
//		comboBox.addItem("1151 - Salg til EU - ydelser m/moms");

		
		comboBox.addItem("");

		 
//		2200 - Finansielle indt�gter
		comboBox.addItem("          **** 2200 - Finansielle indt�gter****");
		comboBox.addItem("2220 - Rykkergebyrer");
		comboBox.addItem("2230 - Renteindt�gter");
		comboBox.addItem("2240 - Gebyr indt�gter");
		
		
		comboBox.addItem("");

		
//		2500 - Ekstraordin�re poster
		comboBox.addItem("          **** 2500 - Ekstraordin�re poster ****");
		comboBox.addItem("2510 - Ekstraordin�re indt�gter m/ moms");
		comboBox.addItem("");

		
//		7100 - Egenkapital
		comboBox.addItem("          **** 7100 - Egenkapital****");
//		comboBox.addItem("7130 - Mellemregning med ejer");;
		comboBox.addItem("7140 - Indskudt kapital");
		comboBox.addItem("");
		

		
//		7300 - Kortfristede forpligtelser
		comboBox.addItem("          **** 7300 - Kortfristede forpligtelser ****");
		comboBox.addItem("7330 - Skyldig A-skat");
		comboBox.addItem("7340 - Skyldig AM-bidrag");
		comboBox.addItem("7350 - Skyldig ATP");
		comboBox.addItem("7360 - Hensatte forpligtelser");
//		comboBox.addItem("7370 - Skyldig pension");
//		comboBox.addItem("7380 - Skyldige feriepenge");
//		comboBox.addItem("7390 - Skyldige sociale omkostninger");
		comboBox.addItem("");
		
		
	}
}