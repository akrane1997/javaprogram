package bookshop;

public class Book {

	private int Book_id;
	private String Book_Name;
	private String AuthorName;
	private int Book_prize;

	public Book(int book_id, String book_Name, String authorName, int book_prize) {
		super();
		Book_id = book_id;
		Book_Name = book_Name;
		AuthorName = authorName;
		Book_prize = book_prize;
	}

	public int getBook_id() {
		return Book_id;
	}

	public void setBook_id(int book_id) {
		Book_id = book_id;
	}

	public String getBook_Name() {
		return Book_Name;
	}

	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public int getBook_prize() {
		return Book_prize;
	}

	public void setBook_prize(int book_prize) {
		Book_prize = book_prize;
	}

	@Override
	public String toString() {
		return "Book [Book_id=" + Book_id + ", Book_Name=" + Book_Name + ", AuthorName=" + AuthorName + ", Book_prize="
				+ Book_prize + "]";
	}



}
