package collection;

import java.util.*;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(100, "AKshay");
	hm.put(101, "Hitesh");
	hm.put(102,"Rohan");
	hm.put(104, "Satish");
	
	System.out.println(hm);
	
	System.out.println("Get Value using Key: "+hm.get(102));
	System.out.println(hm.size());
	System.out.println(hm.remove(102));
	System.out.println(hm);
	System.out.println("checking this key is available or not in map: "+hm.containsKey(101));
	System.out.println("checking this key is available or not in map: "+hm.containsValue("Satish"));
	hm.replace(101, "Rohan");
	System.out.println("after replacing the value: "+hm);
	
	for(Map.Entry s:hm.entrySet())
	{
		System.out.println(s.getKey()+" "+s.getValue());
	}
	System.out.println(hm.keySet());
	System.out.println(hm.values());
}
}
