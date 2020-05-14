package corejava;

import java.util.Scanner;

public class For_Each {
public static void main(String[] args) {
	int add=0,n=5;

	int arr[]= {1,2,3,4,5};
	Scanner sc=new Scanner(System.in);
	/*for(int i:arr)
	{
		arr[i]=sc.nextInt();
	}*/
	for(int i:arr)
	{
		
		System.out.println(i);
	}
}
}
