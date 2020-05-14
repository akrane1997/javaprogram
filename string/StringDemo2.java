package string;

public class StringDemo2 {
	public static void main(String[] args) {
		String str= "Cdac";
		String str1="cdac";
		String str2=new String("Cdac");

		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("str and str1 has same values");
		}
		if(str.equals(str2)) {
			System.out.println("str and str2 has same value");
		}
	}
}
