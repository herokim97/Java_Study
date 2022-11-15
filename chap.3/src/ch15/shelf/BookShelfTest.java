package ch15.shelf;

public class BookShelfTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("옛날에 못생긴 조개가 있었어");
		bookQueue.enQueue("개가 너무 못생겨서 사람들이 모두 죽었어");
		bookQueue.enQueue("끝이야.");
		
		bookQueue.enQueue("더 우울해 졌어..");
		
		
		
		bookQueue.getSize();
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		
	}

}
