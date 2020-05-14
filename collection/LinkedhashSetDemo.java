package collection;

import java.util.*;

public class LinkedhashSetDemo {
public static void main(String[] args) {
	Set<String> s=new LinkedHashSet<String>();
	s.add("hitesh");
	s.add("akshay");
	s.add("xyz");
	s.add("abc");
	
	System.out.println(s);
	
	for(String name:s)
	{
		System.out.println(name);
	}
	
	LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
	lhs.add(2);
	lhs.add(1);
	lhs.add(5);
	lhs.add(3);
	lhs.add(4);
	System.out.println(lhs);
	
	
}
}
