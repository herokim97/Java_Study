package ch15.shelf;

public class BookShelfTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("������ ������ ������ �־���");
		bookQueue.enQueue("���� �ʹ� �����ܼ� ������� ��� �׾���");
		bookQueue.enQueue("���̾�.");
		
		bookQueue.enQueue("�� ����� ����..");
		
		
		
		bookQueue.getSize();
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		
	}

}
