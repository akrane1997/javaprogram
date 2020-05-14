package collection;

import java.util.*;

public class PriorityQueueDemo {
	public static void main(String[] args) {


		PriorityQueue<String> q=new PriorityQueue<String>();
		
		q.add("akshay");
		q.add("Hitesh");
		q.add("satish");
		q.add("aditya");
		q.add("pritesh");
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		q.offer("nirzer");
		System.out.println(q);
		
		q.element();
		System.out.println(q);
		System.out.println(q.peek());
		q.remove();
		System.out.println(q);
	}
}
