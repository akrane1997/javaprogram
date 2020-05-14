package corejava;

import java.util.Scanner;

public class Array_Avg {
public static void main(String[] args) {
	int arr[]=new int[5];
    int i,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array:");
	for(i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		
		System.out.print(" "+arr[i]);
	}
	
	for(i=0;i<arr.length;i++) 
	{
		sum=sum+arr[i];
	}
	double avg=sum/arr.length;
	System.out.println("\nAverage of Array:"+avg);
	
}
}
