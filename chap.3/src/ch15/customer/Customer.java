package ch15.customer;

public class Customer implements Buy, Sell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("�Ǹ� �Ǿ���.");
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("�����Ͽ���.");
		
	}
	
	public void sayHello()
	{
		System.out.println("hi");
	}

	@Override
	public void order()
	{
		System.out.println("customer order");
	}

}
