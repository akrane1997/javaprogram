package collection;

import java.util.*;

public class ArrayListEnumration {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(5);
		
		Enumeration<Integer> em=Collections.enumeration(al);
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
	}
}
