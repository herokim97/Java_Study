package ch23;
import java.util.*;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("�׶� �� �׷�����", "�迵��"));
		library.add(new Book("�ʹ� ��ȴ� �ɱ�", "�迵��"));
		library.add(new Book("�׷��� �� ����� �༭ ����", "�迵��"));
		library.add(new Book("�� ù�������", "�迵��"));
		
		for(int i =0; i < library.size(); i++)
		{
			library.get(i).showBookInfo();
		}
		

	}

}
