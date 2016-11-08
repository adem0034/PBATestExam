package model;


public class MomsOpg
{
	private int bilagNr;
	private String supplier;
	private String category;
	private String date;
	private boolean paid;
	private String descript;
	private String valuta;
	private int priceNoVat;
	private int priceVat;
	private int koebsmoms;
	private double salgsMoms;

	private int idFaktura;
	private String fornavn;
	private String efternavn;
	private String tlf;
	private String email;
	private String vej;
	private String postnummer;
	private String by;
	private String cvr;
	private String virksomhedsnavn;
	private String produkt;
	private String beskrivelse;
	private int antal;
	private String valuta2;
	private int enhedspris;
	private int ialtEksklMoms;
	private int ialtInklMoms;
	private String dato;
	private String betalingsfrist;
	private boolean paid2;
	
	private int vareUdlandMoms;
	private int ydelseUdlandMoms;
	private int rubA;
	private int rubAYdelse;
	
	private int momsType;
	
	private String kategori;

	private int prisEksMoms;
	
	private String eksMoms;
	
	private int momssats;
	private String momssats2;
	private String momsTypeStr;

	

	// for faktura
	public MomsOpg(int idFaktura4, String fornavn4, String efternavn4, String tlf4, String email4,
			String vej4, String postnummer4, String by4, String cvr4, String virksomhedsnavn4, 
			String kategori4, String beskrivelse4, String eksMoms4, int momsType4, String date4, boolean paid4) {
		
		super();

		this.idFaktura = idFaktura4;
		this.fornavn = fornavn4;
		this.efternavn = efternavn4;
		this.tlf = tlf4;
		this.email = email4;
		this.vej = vej4;
		this.postnummer = postnummer4;  
		this.by = by4;
		this.cvr = cvr4;
		this.virksomhedsnavn = virksomhedsnavn4;
		this.kategori = kategori4;
		this.beskrivelse = beskrivelse4;
		this.eksMoms = eksMoms4;
		this.momsType = momsType4;
		this.dato = date4;
		this.paid = paid4;
	}




 




	public MomsOpg(int bilagNr, String supplier, String category, String date, boolean paid, String descript,
			String valuta, int priceNoVat, int priceVat) {
		super();
		this.bilagNr = bilagNr;
		this.supplier = supplier;
		this.category = category;
		this.date = date;
		this.paid = paid;
		this.descript = descript;
		this.valuta = valuta;
		this.priceNoVat = priceNoVat;
		this.priceVat = priceVat;

	}

	public MomsOpg() {

	}


// for regning! grundlag
	public MomsOpg(int bilagNr2, String supplier2, String category2, String momsTypeStr, String descript2, 
			String valuta3,	int priceNoVat2, boolean paid3, String date2) {
		// TODO Auto-generated constructor stub
		super();
		this.bilagNr = bilagNr2;
		this.supplier = supplier2;
		this.category = category2;
		this.momsTypeStr = momsTypeStr;
		this.descript = descript2;
		this.valuta = valuta3;
		this.priceNoVat = priceNoVat2;
		this.paid = paid3;
		this.date = date2;
	}




	public MomsOpg(int koebsmoms) {
		// TODO Auto-generated constructor stub
		this.koebsmoms = koebsmoms;
	}



	public  MomsOpg(int salgsMoms, int sumting) {
		// TODO Auto-generated constructor stub
		this.salgsMoms = salgsMoms;
	}

	
	public  MomsOpg(int vareUdlandMoms, int vareUdlandMoms2, int vareUdlandMoms3) {
		// TODO Auto-generated constructor stub
		this.vareUdlandMoms = vareUdlandMoms;
	
	}
	
	public  MomsOpg(int ydelseUdlandMoms, int ydelseUdlandMoms2, int ydelseUdlandMoms3, int ydelseUdlandMoms4) {
		// TODO Auto-generated constructor stub
		this.ydelseUdlandMoms = ydelseUdlandMoms;
	
	}
	


	public MomsOpg(int rubA, int rubA2, int rubA3, int rubA4, int rubA5) {
		// TODO Auto-generated constructor stub
		this.rubA = rubA;
	}

	public MomsOpg(int rubAYdelse, int rubA2, int rubA3, int rubA4, int rubA5, int rubA6) {
		// TODO Auto-generated constructor stub
		this.rubAYdelse = rubAYdelse;
	}

	














	// for faktura - grundlag
	public MomsOpg(int idFaktura2, String fornavn2, String efternavn2, String tlf2, String email2, String vej2,
			String postnummer2, String by2, String cvr2, String virksomhedsnavn2, String kategori, String beskrivelse2,
			int prisEksMoms, int momsType, String dato2, boolean paid3) {
		
		super();
		this.idFaktura = idFaktura2;
		this.fornavn = fornavn2;
		this.efternavn = efternavn2;
		this.tlf = tlf2;
		this.email = email2;
		this.vej = vej2;
		this.postnummer = postnummer2;
		this.by = by2;
		this.cvr = cvr2;
		this.virksomhedsnavn = virksomhedsnavn2;
		this.kategori = kategori;
		this.beskrivelse = beskrivelse2;
		this.prisEksMoms = prisEksMoms;
		this.momsType = momsType;
		this.dato = dato2;
		this.paid = paid3;
		
	}









	public Object[] toObjectArray2() {
		Object[] array = new Object[1];
		array[0] = this.koebsmoms;
		return array;

	}

	
	
	



	public Object[] toObjectArray() {
		Object[] array = new Object[9];
		array[0] = this.bilagNr;
		array[1] = this.supplier;
		array[2] = this.category;
		array[3] = this.date;
		array[4] = this.paid;
		array[5] = this.descript;
		array[6] = this.valuta;
		array[7] = this.priceNoVat;
		array[8] = this.priceVat;
		return array;
	}





	public Object[] toObjectArray3() {
		// TODO Auto-generated method stub
		Object[] array = new Object[1];
		array[0] = this.salgsMoms;
		return array;
	}



	public Object[] toObjectArray4() {
		Object[] array = new Object[20];
		array[0] = this.idFaktura;
		array[1] = this.fornavn;
		array[2] = this.efternavn;
		array[3] = this.tlf;
		array[4] = this.email;
		array[5] = this.vej;
		array[6] = this.postnummer;
		array[7] = this.by;
		array[8] = this.cvr;
		array[9] = this.virksomhedsnavn;
		array[10] = this.produkt;
		array[11] = this.beskrivelse;
		array[12] = this.antal;
		array[13] = this.valuta2;
		array[14] = this.enhedspris;
		array[15] = this.ialtEksklMoms;
		array[16] = this.ialtInklMoms;
		array[17] = this.dato;
		array[18] = this.betalingsfrist;
		array[19] = this.paid2;


		return array;
	}
	
	public Object[] toObjectArray5() {
		// TODO Auto-generated method stub
		Object[] array = new Object[1];
		array[0] = this.vareUdlandMoms;
		return array;
	}
	public Object[] toObjectArray6() {
		// TODO Auto-generated method stub
		Object[] array = new Object[1];
		array[0] = this.ydelseUdlandMoms;
		return array;
	}
	public Object[] toObjectArray7() {
		Object[] array = new Object[1];
		array[0] = this.rubA;
		return array;

	}
	
	public Object[] toObjectArray8() {
		Object[] array = new Object[1];
		array[0] = this.rubAYdelse;
		return array;

	}









	public Object[] toObjectArrayRegning() {
		Object[] array = new Object[9];
		array[0] = this.bilagNr;
		array[1] = this.supplier;
		array[2] = this.category;
		array[3] = this.momsTypeStr;
		array[4] = this.descript;
		array[5] = this.valuta;
		array[6] = this.priceNoVat;
		array[7] = this.paid;
		array[8] = this.date;
		
	
		return array;
	}









	public Object[] toObjectArrayFaktura() {
		Object[] array = new Object[16];
		array[0] = this.idFaktura;
		array[1] = this.fornavn;
		array[2] = this.efternavn;
		array[3] = this.tlf;
		array[4] = this.email;
		array[5] = this.vej;
		array[6] = this.postnummer;
		array[7] = this.by;
		array[8] = this.cvr;
		array[9] = this.virksomhedsnavn;
		array[10] = this.kategori;
		array[11] = this.beskrivelse;
		array[12] = this.eksMoms;
		array[13] = this.momsType;
		array[14] = this.dato;
		array[15] = this.paid;
		
	
		
		return array;
	}
	
	
	
}