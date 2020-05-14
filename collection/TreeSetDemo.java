package collection;

import java.util.*;

public class TreeSetDemo {
public static void main(String[] args) {
	SortedSet<Integer> ss=new TreeSet<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number: ");
	for(int i=0;i<5;i++)
	{
		ss.add(sc.nextInt());
		
	}
	for(int j:ss)
	{
		System.out.println(j);
	}
}
}
