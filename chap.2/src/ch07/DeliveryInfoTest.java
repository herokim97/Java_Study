package ch07;

public class DeliveryInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeliveryInfo Delivery = new DeliveryInfo();
		Delivery.DeliveryNumber = "202011020003";
		Delivery.DeliveryPhoneNumber = "010-2791-1600";
		Delivery.DeliveryAddress = "서울시 강남구 역삼동 111-333";
		Delivery.DeliveryDate = "20201102";
		Delivery.DeliveryTime = "130258";
		Delivery.DeliveryCost = 35000;
		Delivery.DeliveryMenuNumber = "0003";
		
		System.out.println(Delivery.showDeliveryInfo());
		

	}

}
