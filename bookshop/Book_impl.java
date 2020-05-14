package bookshop;

import java.util.Scanner;

public class Book_impl {
	public static void main(String[] args) {

		int Book_id;
		String Book_Name;
		String AuthorName;
		int Book_prize;
		int count=0;
		int operation;
		int operation2;

		Scanner sc=new Scanner (System.in);
		Book book[]=new Book[10];

		while(true)
		{
			System.out.println("1. Add Book:");
			System.out.println("2. Delete Book:");
			System.out.println("3. Search Book:");
			System.out.println("4. Get All Book:");
			System.out.println("5, Exit:");
			System.out.println(" ");
			System.out.println("Enter the Choice: ");
			operation=sc.nextInt();

			switch(operation)
			{
			case 1:
				System.out.println("ADD BOOK");
				System.out.println("Enter no of book :");
				int a=sc.nextInt();

				for(int i=0;i<a;i++)
				{
					System.out.println("Enter the Book Id: ");
					Book_id=sc.nextInt();
					System.out.println("Enter the Book name: ");
					Book_Name=sc.next();
					System.out.println("Enter the Author Name of this Book:");
					AuthorName=sc.next();
					System.out.println("Enter Prize of this Book:");
					Book_prize=sc.nextInt();


					book[count]=new Book(Book_id, Book_Name, AuthorName, Book_prize);
					count++;
				}
				System.out.println("Book Added Successfully.");
				break;

			case 2:
				System.out.println("DELETE BOOK");
				System.out.println("Enter Book id for delete Book: ");
				Book_id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(book[i]!=null && book[i].getBook_id()==Book_id)
					{
						book[i]=null;
					}

				}
				System.out.println("Book deleted Successfully.");
				break;

			case 3:

				System.out.println("BOOK SEARCH");
				System.out.println("1. Book Search by Book Id.");
				System.out.println("2. Book Search by Book name.");
				System.out.println("3. Book Search by Author name.");
				System.out.println("Enter choice to search book:");
				operation2=sc.nextInt();

				switch(operation2)
				{
				case 1:
					System.out.println("Enter Book id for search Book:");
					Book_id=sc.nextInt();
					for(int i=0;i<count;i++)
					{
						if(book[i]!=null && book[i].getBook_id()==Book_id)
						{
							System.out.println(book[i]);
						}
					}
					System.out.println("Searching Completed.");
					break;
     //case no 2 is not working ,its not going into if statement, directly printing searching completed 
				case 2:
					System.out.println("Enter Book name for search Book:");
					Book_Name=sc.next();
					for(int i=0;i<count;i++)
					{
						if(book[i]!=null && book[i].getBook_Name()==Book_Name)
						{
							System.out.println(book[i]);
						}
					}
					System.out.println("Searching Completed.");
					break;
		//case no 3 also is not working ,its not going into if statement ,directly printing searching completed 
				case 3:
					System.out.println("Enter Author name for search Book:");
					AuthorName=sc.next();
					for(int i=0;i<count;i++)
					{
						if(book[i].getAuthorName()==AuthorName)
						{
							System.out.println("i got it");
						}
					
					//System.out.println(book[i]);
					}
					
					System.out.println("Searching Completed.");
					break;
				}
				break;

			case 4:
				System.out.println("GET ALL BOOKS");
				System.out.println("All book list are:");
				for(int i=0;i<count;i++)
				{
					System.out.println(book[i]);
				}
				System.out.println("Book list Completed");
				break;

			case 5:
				System.exit(0);
			}
		}
	}
}