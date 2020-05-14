package string;

public class StringJoin {
public static void main(String[] args) {
	String str="cdac";
	String str1=str.concat(" Placements");
	System.out.println(str1);
	System.out.println();
	String str2="cdac "+10;
	System.out.println("Concat using + operator: "+str2);
	System.out.println();
	String str3=10+" cdac";
	System.out.println("concat using + operator: "+str3);
}
}
