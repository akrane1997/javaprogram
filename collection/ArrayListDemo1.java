package collection;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList <Integer> list=new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(10);
		list.add(2);
		list.add(5);
		
		System.out.println(list);
		
		System.out.println();
		System.out.println("set value at index 3:");
		list.set(3, 6);
		System.out.println(list);
		
		System.out.println();
		System.out.println("check value present in collection or not: ");
		System.out.println("Contains 40 in list: "+list.contains(40));
		System.out.println("Contains 10 in list: "+list.contains(10));
		
		System.out.println();
		System.out.println("remove eliment in the list: ");
		list.remove(1);
		System.out.println("After removing index 1: "+list);
		
		System.out.println();
		System.out.println("size of list: "+list.size());
		
		System.out.println();
		System.out.println("Find the index of element 5 :"+list.indexOf(5));
		
		System.out.println();
		System.out.println("add value with index: ");
		list.add(1, 20);
		System.out.println("after adding value with index: "+list);
		
		System.out.println();
		System.out.println("Retrive element "+list.get(2));
		
		System.out.println();
		System.out.println("check list is empty or not: ");
		System.out.println("is List empty: "+list.isEmpty());
		
		
	}
}
