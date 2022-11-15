package ch21;

public class BookArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] library = new Book[5];
		

		
		library[0] = new Book("еб╧И╩Й╦ф1","╠Х©╣©У");
		library[1] = new Book("еб╧И╩Й╦ф2","╠Х©╣©У");
		library[2] = new Book("еб╧И╩Й╦ф3","╠Х©╣©У");
		library[3] = new Book("еб╧И╩Й╦ф4","╠Х©╣©У");
		library[4] = new Book("еб╧И╩Й╦ф5","╠Х©╣©У");
		
		for(int i = 0; i < library.length; i++)
		{
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
		
	}

}
