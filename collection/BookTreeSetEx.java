package collection;

import java.util.*;

public class BookTreeSetEx {
public static void main(String[] args) {
	Set<Book> set=new TreeSet<Book>();
	Book b1=new Book(110,"c language","YT",10);
	Book b2=new Book(200,"c++ ","Danish",50);
	Book b3=new Book(340,"java","Beens",100);
	
	set.add(b1);
	set.add(b2);
	set.add(b3);
	
	for(Book b:set)
	{
		System.out.println(b.id+" "+b.BookName+"  "+b.author+" "+b.quantity);
	}
	
}
}
