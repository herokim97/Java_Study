package ch15.customer;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		

	}

}
