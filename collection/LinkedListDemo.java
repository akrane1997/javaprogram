package collection;

import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {

		
		List<String> list=new LinkedList<String>();
		list.add("a");
		list.add("c");
		list.add("b");
		list.add("d");
		System.out.println();
		System.out.println(list);
		
		Deque<Integer> dl=new LinkedList<Integer>();
		dl.add(1);
		dl.add(2);
		dl.add(3);
		dl.add(4);
		System.out.println();
		System.out.println(dl);
		
		System.out.println();
		System.out.println("Add element at first: ");
		dl.addFirst(10);
		System.out.println("After adding element at first: "+dl);

		
		System.out.println();
		System.out.println("Add element at last: ");
		dl.addLast(40);
		System.out.println("After Adding element at last: "+dl);
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(4);
		ll.add(10);
		ll.add(2);
		System.out.println();
		System.out.println(ll);
		
		System.out.println();
		System.out.println("Add element at Starting index: ");
		ll.addFirst(20);
		System.out.println("after adding: "+ll);
		
		System.out.println();
		System.out.println("Add element at last index");
		ll.addLast(30);
		System.out.println("After adding: "+ll);
		
		System.out.println();
		System.out.println("remove first element: ");
		ll.removeFirst();
		System.out.println("after removing: "+ll);
	}
}
