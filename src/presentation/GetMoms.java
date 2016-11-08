package presentation;

public class GetMoms {

	public int getMoms(String category) {
		if (category.equals("1220 - Køb af varer i EU")) {

			return 0;

		}

		else if (category.equals("1230 - Køb af ydeleser i EU")) {
			return 0;
		}

		else if (category.equals("1240 - Køb af varer udenfor EU")) {
			return 0;
		}


		else if (category.equals("1250 - Køb af ydelser udenfor EU")) {
			return 0;
		}



		else if (category.equals("1260 - Regulering af varelager")) {
			return 0;
		}



		else if (category.equals("1410 - AM-indkomst")) {
			return 0;
		}



		else if (category.equals("1420 - ATP-bidrag")) {
			return 0;
		}

		else if (category.equals("1430 - Personalegoder")) {
			return 0;
		}


		else if (category.equals("1440 - Personalepleje")) {
			return 0;
		}


		else if (category.equals("1450 - Pension")) {
			return 0;
		}


		else if (category.equals("1460 - Fradrag")) {
			return 0;
		}


		else if (category.equals("1470 - Sociale omkostninger")) {
			return 0;
		}


		else if (category.equals("1480 - Tillæg")) {
			return 0;
		}


		else if (category.equals("1485 - B-honorar")) {
			return 0;
		}


		else if (category.equals("1490 - Feriepenge")) {
			return 0;
		}


		else if (category.equals("1520 - Husleje uden moms")) {
			return 0;
		}


		else if (category.equals("1530 - El, vand og varme")) {
			return 0;
		}


		else if (category.equals("1550 - Forsikringer(lokale)")) {
			return 0;
		}


		else if (category.equals("1610 - Fragtudgifter")) {
			return 0;
		}


		else if (category.equals("1620 - Transport og rejser")) {
			return 0;
		}


		else if (category.equals("1640 - Hotel")) {
			return 0;
		}


		else if (category.equals("1650 - Repræsentation")) {
			return 0;
		}


		else if (category.equals("1710 - Brændstof")) {
			return 0;
		}


		else if (category.equals("1720 - Vedligeholdelse")) {
			return 0;
		}



		else if (category.equals("1730 - Parkering")) {
			return 0;
		}



		else if (category.equals("1740 - Bilforsikring")) {
			return 0;
		}



		else if (category.equals("1750 - Vægtafgift")) {
			return 0;
		}

		else if (category.equals("1850 - Kørselsgodtgørelse")) {
			return 0;
		}

		else if (category.equals("1870 - Forsikring")) {
			return 0;
		}

		else if (category.equals("1890 - Tab på kunder")) {
			return 0;
		}

		else if (category.equals("1895 - Ej fradragsberretigede omkostninger")) {
			return 0;
		}

		else if (category.equals("2010 - Afskrivninger")) {
			return 0;
		}

		else if (category.equals("2310 - Renteudgifter")) {
			return 0;
		}

		else if (category.equals("2320 - Gebyrer")) {
			return 0;
		}

		else if (category.equals("5210 - Immatterielle anlægsaktiver")) {
			return 0;
		}

		else if (category.equals("5310 - Driftsmidler og inventar(kostpris)")) {
			return 0;
		}

		else if (category.equals("5320 - Driftsmidler og inventar, akkumulerde afskrivninger ")) {
			return 0;
		}

		else if (category.equals("5410 - Kapitalandele af tilknyttede virksomheder")) {
			return 0;
		}

		else if (category.equals("5420 - Kapitalandele af associerede virksomheder")) {
			return 0;
		}

		else if (category.equals("5430 - Andre værdipapirer og kapitalandele")) {
			return 0;
		}

		else if (category.equals("5440 - Deposita")) {
			return 0;
		}

		else if (category.equals("5710 - Bank")) {
			return 0;
		}


		else if (category.equals("5720 - Konantbeholdning")) {
			return 0;
		}


		else if (category.equals("5810 - Til gode hos kunder")) {
			return 0;
		}


		else if (category.equals("5820 - Til gode hos leverandører")) {
			return 0;
		}


		else if (category.equals("5830 - Varelager")) {
			return 0;
		}



		//		
		//		else if (category.equals("")) {
		//			return 0;
		//		}





		// If it's not 0 ... make it 25% by default
		else {
			return 25;
		}

	}


	public int getMomsInvoice(String product) {
		if (product.equals("1115 - Salg af fragt u/moms")) {

			return 0;
		}



		else if (product.equals("1120 - Salg til øvrig udland - varer")) {
			return 0;
		}
		
		
		else if (product.equals("1130 - Salg til øvrig udland - ydelser")) {
			return 0;
		}
		
		else if (product.equals("1140 - Salg til EU - varer")) {
			return 0;
		}
		
		
		else if (product.equals("1150 - Salg til EU - ydelser")) {
			return 0;
		}
		
		
		
		
		
		
		
		else if (product.equals("")) {
			return 0;
		}
		
		
		else if (product.equals("")) {
			return 0;
		}
		
		else if (product.equals("")) {
			return 0;
		}
		
		
		else if (product.equals("")) {
			return 0;
		}
		
		
		

		// If it's not 0 ... make it 25% by default
		else {
			return 25;
		}
	}

}
