package string;

public class ToArray {
	public static void main(String[] args) {
		String str="cdac chennai";
		char ch[]=str.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
}
