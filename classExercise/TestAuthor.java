package classExercise;
class Author
{
	private String name;
	private String email;
	private String gender;
	
	public Author(String n,String e,String gender)
	{
		this.name=n;
		this.email=e;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
}
public class TestAuthor {
	public static void main (String[]args)
	{
		Author a=new Author("Akshay","Akshay@gmail.com","male");
		
		System.out.println(a);
		a.setName("Hitesh");
		a.setEmail("hitesh@gmail.com");
		a.setGender("f");
		System.out.println("Name is :"+a.getName());
		System.out.println("Name is :"+a.getEmail());
		System.out.println("Name is :"+a.getGender());
	}
}
