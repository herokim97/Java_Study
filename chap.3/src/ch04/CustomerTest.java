package ch04;

public class CustomerTest {

	public static void main(String[] args)
	{
		Customer customerKim = new Customer(16111955, "±è¿µ¿õ");		
		customerKim.bonusPoint = 1000;
		int price = customerKim.calcPrice(5000);
		System.out.println(customerKim.showCustomerInfo() + " " + price);
		
		
		VipCustomer customerLee = new VipCustomer(20222455, "¹Ý±Ô¹Î");
		customerLee.bonusPoint = 20000;
		price = customerLee.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo()+ " " + price);
		
		
		GoldCustomer customerJang = new GoldCustomer(16111444, "Àå¼öÈ£");
		price = customerJang.calcPrice(1000);
		System.out.println(customerJang.showCustomerInfo()+ " " + price);
		

		
	}
}
