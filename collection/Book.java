package collection;

public class Book implements Comparable<Book>{

	int id;
	String BookName,author;
	int quantity;
	public Book(int id,String BookName,String author,int quantity) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.BookName=BookName;
		this.author=author;
		this.quantity=quantity;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", BookName=" + BookName + ", author=" + author + ", quantity=" + quantity + "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(id>o.id)
		{
			return 1;
		}
		else if(id<o.id)
		{
			return -1;
		}
		else
		return 0;
	}

}
