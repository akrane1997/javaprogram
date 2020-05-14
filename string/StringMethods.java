package string;

public class StringMethods {
	public static void main(String[] args) {
		String str="Cdac Chennai";
		System.out.println("Find character at 7th Index position : "+(str.charAt(7)));
		
		System.out.println();
		System.out.println("Convert hole string into uppercase: "+(str.toUpperCase()));
		
		System.out.println();
		System.out.println("Convert hole String into lowercase: "+(str.toLowerCase()));
		
		System.out.println();
		String str1="             Akshay Rane  ";
		System.out.println("After removing space: "+(str1.trim()));
		
		System.out.println();
		System.out.println("After replacing character: "+(str.replace('e', 'u')));
	}
}
