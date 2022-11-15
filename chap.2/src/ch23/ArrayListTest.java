package ch23;
import java.util.*;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("±×¶© ¿Ö ±×·¨À»±î", "±è¿µ¿õ"));
		library.add(new Book("³Ê¹« ¾î·È´ø °É±î", "±è¿µ¿õ"));
		library.add(new Book("±×·¡µµ ³¯ »ç¶ûÇØ Áà¼­ °í¸¶¿ö", "±è¿µ¿õ"));
		library.add(new Book("³» Ã¹»ç¶û¿¡°Ô", "±è¿µ¿õ"));
		
		for(int i =0; i < library.size(); i++)
		{
			library.get(i).showBookInfo();
		}
		

	}

}
