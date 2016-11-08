package model;

public class ResOpg {
	
	private int sumIncome;
	private double sumExp;
		
	
	
	private int divUdgifter;
	private int IT;
	private int kontorartikler;
	private int k�rsel;
	private int reklame;
	private int website;
	private int sm�anskaffelser;
	


	
public ResOpg(int sumIncome, double sumExp, int divUdgifter, int iT, int kontorartikler,
		int k�rsel, int reklame, int website, int sm�anskaffelser) {
		super();
		this.sumIncome = sumIncome;
		this.sumExp = sumExp;
		this.divUdgifter = divUdgifter;
		this.IT = iT;
		this.kontorartikler = kontorartikler;
		this.k�rsel = k�rsel;
		this.reklame = reklame;
		this.website = website;
		this.sm�anskaffelser = sm�anskaffelser;
	}




	public ResOpg(int divUd, int IT2, int kontor, int koersel, int reklame2, int web, int smaa) {
	// TODO Auto-generated constructor stub
		this.divUdgifter = divUd;
		this.IT = IT2;
		this.kontorartikler = kontor;
		this.k�rsel = koersel;
		this.reklame = reklame2;
		this.website = web;
		this.sm�anskaffelser = smaa;
}




	public Object[] toObjectArray() {
		Object[] array = new Object[1];
		array[0] = this.sumIncome;
		return array;

	}

	
	public Object[] toObjectArray2() {
		Object[] array = new Object[1];
		array[0] = this.sumExp;
		return array;

	}
	
	public Object[] toObjectArray3() {
		Object[] array = new Object[7];
		

		array[0] = this.divUdgifter;
		array[1] = this.IT;
		array[2] = this.kontorartikler;
		array[3] = this.k�rsel;
		array[4] = this.reklame;
		array[5] = this.website;
		array[6] = this.sm�anskaffelser;
		
		return array;
			
		
	
	}
	
	
}
