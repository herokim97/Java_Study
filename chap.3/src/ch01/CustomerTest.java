package ch01;

public class CustomerTest {

	public static void main(String[] args)
	{
		Customer customerKim = new Customer(16111955, "�迵��");
		;
		customerKim.bonusPoint = 15000;
		System.out.println(customerKim.showCustomerInfo());
		
		
		VipCustomer customerLee = new VipCustomer(20222455, "���ÿ�");
		
		customerLee.bonusPoint = 20000;
		System.out.println(customerLee.showCustomerInfo());
		
		GoldCustomer customerJang = new GoldCustomer(16111444, "���ȣ");

		customerJang.bonusPoint = 10000;
		System.out.println(customerJang.showCustomerInfo());
		
	}
}
