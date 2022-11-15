package ch20;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];
		int total = 0;
		
		for (int i = 0, num =1; i < array.length; i++, num++ )
		{
			array[i] = num;
			System.out.println(array[i]);
		}
		
		for(int i = 0; i<array.length; i++)
		{
			total += array[i];
			System.out.println(total);
		}
		
//		for(int num : array)
//		{
//			total += num;
//		}
		
		System.out.println(total);
	}

}
