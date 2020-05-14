package collection;

import java.util.*;

public class MapDemo {
public static void main(String[] args) {
	Map<Integer,String> m=new HashMap<Integer,String>();
			m.put(1, "akshay");
			m.put(3, "Rahul");
			m.put(2, "Rohan");
			System.out.println(m);
			
			for(Map.Entry s:m.entrySet())
			{
				System.out.println(s.getKey()+" "+s.getValue());
			}
}
}
