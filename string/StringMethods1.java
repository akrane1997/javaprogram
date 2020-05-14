package string;

public class StringMethods1 {
	public static void main(String[] args) {
		String str="java is simple, secure and robust language";
		
		System.out.println("first index of s: "+(str.indexOf('s')));
		
		System.out.println();
		System.out.println("last index of s: "+(str.lastIndexOf('s')));
		
		System.out.println();
		System.out.println("Index of charachter after 10: "+(str.indexOf('s', 10)));
		
		System.out.println();
		System.out.println("Index of String after 10: "+(str.indexOf("sec", 10)));
		
		System.out.println();
		boolean result=str.startsWith("java");
		System.out.println("String start with java: "+result);
		
		System.out.println();
		boolean result1=str.endsWith("language");
		System.out.println("String end with language: "+result1);
	}
}
