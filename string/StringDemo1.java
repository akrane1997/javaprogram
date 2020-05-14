package string;

public class StringDemo1 {
	public static void main(String[] args) {
		String str="Hello";
		String str1="hello";
		String str2=new String("Hello");
		
		if(str.equals(str1))
		{
			System.out.println("str and str1 has same values");
		}
				
		if(str.equals(str2))
		{
			System.out.println("str and str2 has same values");
		}
	}
}
