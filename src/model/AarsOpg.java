package model;


public class AarsOpg
{
	private int r320;
	private int r323;
	private int r325;
	private int r327;
	private int r330;
	private int r331;
	private int r332;
	private int r333;
	private int r336;

	
	


	
 




	public AarsOpg(int r320, int r323, int r325, int r327, int r330, int r331, int r332, int r333, int r336) {
		super();
		this.r320 = r320;
		this.r323 = r323;
		this.r325 = r325;
		this.r327 = r327;
		this.r330 = r330;
		this.r331 = r331;
		this.r332 = r332;
		this.r333 = r333;
		this.r336 = r336;

	}




	public Object[] toObjectArray() {
		Object[] array = new Object[9];
		array[0] = this.r320;
		array[1] = this.r323;
		array[2] = this.r325;
		array[3] = this.r327;
		array[4] = this.r330;
		array[5] = this.r331;
		array[6] = this.r332;
		array[7] = this.r333;
		array[8] = this.r336;


		return array;

	}

}