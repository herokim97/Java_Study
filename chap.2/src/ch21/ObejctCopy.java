package ch21;

public class ObejctCopy {

	public static void main(String[] args)
	{
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];

		
		library[0] = new Book("�¹���1","�迵��");
		library[1] = new Book("�¹���2","�迵��");
		library[2] = new Book("�¹���3","�迵��");
		library[3] = new Book("�¹���4","�迵��");
		library[4] = new Book("�¹���5","�迵��");
		
		copylibrary[0] = new Book();
		copylibrary[1] = new Book();
		copylibrary[2] = new Book();
		copylibrary[3] = new Book();
		copylibrary[4] = new Book();
		
		for(int i = 0; i<library.length; i++)
		{
			copylibrary[i].setTitle(library[i].getTitle());
			copylibrary[i].setAuthor(library[i].getAuthor());
		}
		
		
		library[0].setAuthor("�̿���");
		library[0].setTitle("�츮�� ����ߴ� �̾߱�");
		System.out.println("==copy==");
		for(Book book : copylibrary)
		{
			book.showBookInfo();
		}
		
		System.out.println("==Lib==");
		for(Book book : library)
		{
			book.showBookInfo();
		}
		
	
	}
}

