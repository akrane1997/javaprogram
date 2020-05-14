package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudent {
public static void main(String[] args) {
	Student s1=new Student(1, "Akshay", 22);
	Student s2=new Student(2,"Hitesh",22);
	Student s3=new Student(3,"madhan",24);
	
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	Iterator itr=al.iterator();
	System.out.println("Iterating students information using Iterator: ");
	while(itr.hasNext())
	{
		Student st=(Student)itr.next();
		System.out.println(st.rollNo+" "+st.name+" "+st.age);
	}
	
	System.out.println();
	System.out.println("Iterating student Information using For each: ");
	for(Student s:al)
	{
		System.out.println(s.rollNo+" "+s.name+" "+s.age);
	}
}
}
