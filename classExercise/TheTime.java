package classExercise;

public class TheTime {
	private int hours;
	private int minuts;
	private int seconds;
	public TheTime (int hh, int mm, int ss) {

		this.hours = hh;
		this.minuts= mm;
		this.seconds = ss;
	}


	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinuts() {
		return minuts;
	}

	public void setMinuts(int minuts) {
		this.minuts = minuts;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public void Date(int x,int y,int z)
	{
		System.out.println("Date :- "+x+":"+y+":"+z);
	}

	@Override
	public String toString() {
		return "TheTime [hh=" + hours + ", mm=" + minuts + ", ss=" + seconds + "]";
	}




	public static void main(String[]args)
	{
		TheTime t=new TheTime(10,5,03);
		System.out.println(t);
		t.Date(13, 04, 2020);
		t.setHours(18);
		t.setMinuts(56);
		t.setSeconds(01);
		System.out.println("After setting time");
		System.out.println(t);
	}
}
