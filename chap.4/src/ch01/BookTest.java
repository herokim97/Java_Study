package ch01;

class Book
{
	private String Title;
	private String Author;
	public Book(String Title, String Author)
	{
		this.Author = Author;
		this.Title = Title;
	}
	@Override
	public String toString()
	{
		return Title + ", " + Author;
	}
}


public class BookTest {

	public static void main(String[] args) {
		

		Book book = new Book("Damian", "Kim");
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str.toString());
	}

}
