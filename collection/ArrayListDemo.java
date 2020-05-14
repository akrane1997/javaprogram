package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("akshay");
		al.add("hitesh");
		al.add("kirti");
		al.add("archana");
		al.add("madhan");
		System.out.println(al);
		
		System.out.println();
		System.out.println("traversing through Iterator: ");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("traversing through For each: ");
		for(String obj:al)
		{
			System.out.println(obj);
		}
	}

}
