package classExercise;

 class Date {
	private int dd;
	private int mm;
	private int yy;
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "TheDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
}
	public class TheDate {
		
	
	public static void main(String[]args)
	{
		Date d=new Date(12,11,1997);
		System.out.println(d);
		System.out.println();
		System.out.println("Setting Date :");
		d.setDd(23);
		d.setMm(04);
		d.setYy(1997);
		System.out.println(d);

	}

}
