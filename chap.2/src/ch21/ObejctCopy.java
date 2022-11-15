package ch21;

public class ObejctCopy {

	public static void main(String[] args)
	{
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];

		
		library[0] = new Book("ÅÂ¹é»ê¸Æ1","±è¿µ¿õ");
		library[1] = new Book("ÅÂ¹é»ê¸Æ2","±è¿µ¿õ");
		library[2] = new Book("ÅÂ¹é»ê¸Æ3","±è¿µ¿õ");
		library[3] = new Book("ÅÂ¹é»ê¸Æ4","±è¿µ¿õ");
		library[4] = new Book("ÅÂ¹é»ê¸Æ5","±è¿µ¿õ");
		
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
		
		
		library[0].setAuthor("ÀÌ¿¹Áø");
		library[0].setTitle("¿ì¸®°¡ »ç¶ûÇß´ø ÀÌ¾ß±â");
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

