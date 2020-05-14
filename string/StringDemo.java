package string;

public class StringDemo {
	public static void main(String[] args) {
		String str="Cdac";
		String str1="Cdac";
		String str2=new String("Cdac");
		String str3=new String("Cdac");

		if(str==str1)
		{
			System.out.println("str and str1 are the same");
		}
		if(str2==str3)
		{
			System.out.println("str2 and str3 are the same");
		}
		if (str==str2)
		{
			System.out.println("str and str2 are the same");
		}
	}
}
