package collection;

import java.util.*;

public class ArrayListScanner {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integers: ");
		for(int i=0;i<5;i++)
		{
			al.add(sc.nextInt());
		}
		
		System.out.println("List of integers: ");
		System.out.println(al);
	}
}
