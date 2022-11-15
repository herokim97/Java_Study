package ch01;

public class CustomerTest {

	public static void main(String[] args)
	{
		Customer customerKim = new Customer(16111955, "±è¿µ¿õ");
		;
		customerKim.bonusPoint = 15000;
		System.out.println(customerKim.showCustomerInfo());
		
		
		VipCustomer customerLee = new VipCustomer(20222455, "°­½Ã¿¬");
		
		customerLee.bonusPoint = 20000;
		System.out.println(customerLee.showCustomerInfo());
		
		GoldCustomer customerJang = new GoldCustomer(16111444, "Àå¼öÈ£");

		customerJang.bonusPoint = 10000;
		System.out.println(customerJang.showCustomerInfo());
		
	}
}
