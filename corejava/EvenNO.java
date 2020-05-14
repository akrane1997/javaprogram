package corejava;
import java.util.Scanner;

public class EvenNO {
public static void main(String[] args) {
	
	int i;
	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Numbers upto length 5");
	for(i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	System.out.println("Array: ");
	for(i=0;i<arr.length;i++)
	{
		System.out.print(" "+arr[i]);
		
	}
	
	
	
	for(i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			System.out.print("\nEven number: "+arr[i]);
		}
		else
		{
			System.out.print("\nodd Number: "+arr[i]);
		}
	}
}
}
