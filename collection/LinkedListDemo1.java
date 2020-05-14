package collection;

import java.util.*;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integers:");
		for(int i=0;i<5;i++)
		{
			l.add(sc.nextInt());
		}
		System.out.println(l);
	
	System.out.println();
	System.out.println("set value: ");
	l.set(2, 20);
	System.out.println("after set value: "+l);
	
	l.remove(1);
	System.out.println("After remove: "+l);
	System.out.println("Size of list: "+l.size());
	
	l.add(1, 7);
	System.out.println("After adding elemts: "+l);
	
	}
	
	
}
