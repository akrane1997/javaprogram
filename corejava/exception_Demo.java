package corejava;

import java.util.Scanner;

public class exception_Demo {
public static void main(String[] args) {
	int a;
	int b;
	int div=0;
	System.out.println("Enter Number of A:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	System.out.println("Enter NUmber of B:");
	b=sc.nextInt();
	try {
		div=a/b;
		System.out.println("Division:"+div);
	}
	
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
}
}
