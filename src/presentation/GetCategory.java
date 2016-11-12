package presentation;

import java.sql.SQLException;

import dlayer.RegningSQL;

public class GetCategory {


	public String getCat(String category, int priceNoVat) {
		// TODO Auto-generated method stub

		//		1200 - Salgsomkostninger

		if (category.equals("1210 - Vareinkï¿½b")) {


			try {
				// her sender/videregiver den variablerne til .add
				RegningSQL.add1210VareIndkoeb(priceNoVat);;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else if (category.equals("1220 - Kï¿½b af varer i EU")) {
			try {
				RegningSQL.add1220KoebVarerEU(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1230 - Kï¿½b af ydeleser i EU")) {
			try {
				RegningSQL.add1230KoebYdelseEU(priceNoVat);

			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1240 - Kï¿½b af varer udenfor EU")) {
			try {
				RegningSQL.add1240KoebVarerUdland(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1250 - Kï¿½b af ydelser udenfor EU")) {
			try {
				RegningSQL.add1250KoebYdelseUdland(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}


		else if (category.equals("1260 - Regulering af varelager")) {
			try {
				RegningSQL.add1260ReguleringVarerlager(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}


		else if (category.equals("1270 - Andre direkte omkostninger")) {
			try {
				RegningSQL.add1270AndreDivOmkost(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}



		//		1400 - Lï¿½nomkostninger


		else if (category.equals("1410 - AM-indkomst")) {
			try {
				RegningSQL.add1410AM(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1420 - ATP-bidrag")) {
			try {
				RegningSQL.add1220KoebVarerEU(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}




		else if (category.equals("1430 - Personalegoder")) {
			try {
				RegningSQL.add1430Personalegoder(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("1440 - Personalepleje")) {
			try {
				RegningSQL.add1440Personalepleje(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("1450 - Pension")) {
			try {
				RegningSQL.add1450Pension(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("1460 - Fradrag")) {
			try {
				RegningSQL.add1460Fradrag(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("1470 - Sociale omkostninger")) {
			try {
				RegningSQL.add1470Socialeomkost(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("1480 - Tillï¿½g")) {
			try {
				RegningSQL.add1480Tillaeg(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}


		else if (category.equals("1485 - B-honorar")) {
			try {
				RegningSQL.add1485BHonorar(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("1490 - Feriepenge")) {
			try {
				RegningSQL.add1490Feriepenge(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}


		//		1500 - Lokaleomkostninger

		else if (category.equals("1510 - Husleje med moms")) {
			try {
				RegningSQL.add1510HuslejeInkMoms(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("1520 - Husleje uden moms")) {
			try {
				RegningSQL.add1520HuslejeEksMoms(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("1530 - El, vand og varme")) {
			try {
				RegningSQL.add1530ElVandVarme(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
		else if (category.equals("1540 - Vedligeholdelse og rengï¿½ring")) {
			try {
				RegningSQL.add1540VedligeholdRengoering(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
		
		else if (category.equals("1550 - Forsikringer(lokale)")) {
			try {
				RegningSQL.add1550ForsikringLokale(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
		
//		1600 - Marketing- og rejseomkostninger

		else if (category.equals("1610 - Fragtudgifter")) {
			try {
				RegningSQL.add1610Fragtudgifter(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1620 - Transport og rejser")) {
			try {
				RegningSQL.add1620TransportRejser(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1630 - Reklamer og markedsfï¿½ring")) {
			try {
				RegningSQL.add1630ReklameMarketing(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}


		else if (category.equals("1640 - Hotel")) {
			try {
				RegningSQL.add1640Hotel(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1650 - Reprï¿½sentation")) {
			try {
				RegningSQL.add1650Raepraesentation(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1660 - Restaurant")) {
			try {
				RegningSQL.add1660Restaurant(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}


//		1700 - Bilomkostninger
		
		else if (category.equals("1710 - Brï¿½ndstof")) {
			try {
				RegningSQL.add1710Braendstof(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1720 - Vedligeholdelse")) {
			try {
				RegningSQL.add1720Vedligeholdelse(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1730 - Parkering")) {
			try {
				RegningSQL.add1730Parkering(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1740 - Bilforsikring")) {
			try {
				RegningSQL.add1740BilForsikring(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
		else if (category.equals("1750 - Vï¿½gtafgift")) {
			try {
				RegningSQL.add1750Vaegtafgift(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
		
//		1800 - Administrationsomkostninger

		else if (category.equals("1810 - Kontorartikler")) {
			try {
				RegningSQL.add1810Kontorartikler(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1820 - Website")) {
			try {
				RegningSQL.add1820Website(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1830 - Telefon og Internet")) {
			try {
				RegningSQL.add1830TlfInternet(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		



		else if (category.equals("1840 - Smï¿½ anskaffelser")) {
			try {
				RegningSQL.add1840smaaanskaffelser(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1850 - Kï¿½rselsgodtgï¿½relse")) {
			try {
				RegningSQL.add1850Koerselsgodtgoerelse(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1860 - Konsulenter og freelancere")) {
			try {
				RegningSQL.add1860KonsulentFreelance(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1870 - Forsikring")) {
			try {
				RegningSQL.add1870Forsikringer(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1880 - Inventar")) {
			try {
				RegningSQL.add1880Inventar(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1890 - Tab pï¿½ kunder")) {
			try {
				RegningSQL.add1890TabPaaKunder(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		else if (category.equals("1895 - Ej fradragsberretigede omkostninger")) {
			try {
				RegningSQL.add1895IkkeFradragBeretOmkost(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
//		2000 - Afskrivninger


		else if (category.equals("2010 - Afskrivninger")) {
			try {
				RegningSQL.add2010Afskrivninger(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
//		2300 - Finansielle udgifter
		
		
		else if (category.equals("2310 - Renteudgifter")) {
			try {
				RegningSQL.add2310Renteudgift(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("2320 - Gebyrer")) {
			try {
				RegningSQL.add2320Gebyrer(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

//		2500 - Ekstraordinï¿½re poster

		else if (category.equals("2520 - Ekstraordinï¿½re poster")) {
			try {
				RegningSQL.add2520EkstraUdgiftMoms(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
		
//		5200 - Immaterielle anlï¿½gsaktiver

		else if (category.equals("5210 - Immatterielle anlï¿½gsaktiver")) {
			try {
				RegningSQL.add5210ImmatAnlægsaktiv(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
//		5300 - Materielle anlï¿½gsaktiver
		

		else if (category.equals("5310 - Driftsmidler og inventar(kostpris)")) {
			try {
				RegningSQL.add5310DriftInventarKostpris(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("5320 - Driftsmidler og inventar, akkumulerde afskrivninger ")) {
			try {
				RegningSQL.add5320DriftInventarAkkuAfskriv(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
//		5400 - Finansielle anlï¿½gsaktiver

		else if (category.equals("5410 - Kapitalandele af tilknyttede virksomheder")) {
			try {
				RegningSQL.add5410KapAndelTilknytVirk(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("5420 - Kapitalandele af associerede virksomheder")) {
			try {
				RegningSQL.add5420KapAndelAssVirk(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("5430 - Andre vï¿½rdipapirer og kapitalandele")) {
			try {
				RegningSQL.add5430AndreVaerdiKapital(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		else if (category.equals("5440 - Deposita")) {
			try {
				RegningSQL.add5440Deposita(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
		
//		5700 - Bank- og kontantbeholdninger
		
		else if (category.equals("5710 - Bank")) {
			try {
				RegningSQL.add5710Bank(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
		else if (category.equals("5720 - Konantbeholdning")) {
			try {
				RegningSQL.add5720Kontantbeholdning(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		
//		5800 - Omsï¿½tningsaktiver
		else if (category.equals("5810 - Til gode hos kunder")) {
			try {
				RegningSQL.add5810TilgodeKunder(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
		else if (category.equals("5820 - Til gode hos leverandï¿½rer")) {
			try {
				RegningSQL.add5820TilgodeLeverand(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
		
		else if (category.equals("5830 - Varelager")) {
			try {
				RegningSQL.add5830Varelager(priceNoVat);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
//		else if (category.equals("")) {
//			try {
//				RegningSQL.add
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//
//		}
		
		

		
		
		return category;

	}

}
