package string;

public class StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer();
		System.out.println("length of String Buffer: "+(str.length()));
		System.out.println("capacity of String Buffer: "+(str.capacity()));

		System.out.println();
		StringBuffer str1=new StringBuffer("Hello");
		System.out.println("length of str1: "+(str1.length()));
		System.out.println("capacity of str1: "+(str1.capacity()));

		System.out.println();
		StringBuffer str2=new StringBuffer(str1);
		System.out.println("length: "+(str2.length()));
		System.out.println("capacity: "+(str2.capacity()));

		System.out.println();
		str1.setLength(2);
		System.out.println(str1);
	}
}
