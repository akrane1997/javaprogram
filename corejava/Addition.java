package corejava;

import java.util.Scanner;

public class Addition {
public static void main(String[] args) {
	int a;
	int b;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number of A:");
	a=sc.nextInt();
	System.out.println("\nEnter Number of B: ");
	b=sc.nextInt();
	
	System.out.println("Addition is:"+(a+b));
}
}
