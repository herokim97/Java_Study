package ch07;

public class DeliveryInfo {

	public String DeliveryNumber;
	public String DeliveryPhoneNumber;
	public String DeliveryAddress;
	public String DeliveryDate;
	public String DeliveryTime;
	public int DeliveryCost;
	public String DeliveryMenuNumber;
	
	public DeliveryInfo() {}
	
	public DeliveryInfo(String DeliveryNumber, String DeliveryPhoneNumber, String DeliveryAddress, String DeliveryDate, String DeliveryTime, int DeliveryCost, String DeliveryMenuNumber)
	{
		this.DeliveryNumber = DeliveryNumber;
		this.DeliveryPhoneNumber = DeliveryPhoneNumber;
		this.DeliveryAddress = DeliveryAddress;
		this.DeliveryDate = DeliveryDate;
		this.DeliveryTime = DeliveryTime;
		this.DeliveryCost = DeliveryCost;
		this.DeliveryMenuNumber = DeliveryMenuNumber;
		
	}
	
	public String showDeliveryInfo()
	{
		return 
				"주문 접수 번호 : " + DeliveryNumber + "\n" +
				"주문 핸드폰 번호 : " + DeliveryPhoneNumber + "\n" +
				"주문 집 주소 : " + DeliveryAddress + "\n" +
				"주문 날짜 : " + DeliveryDate + "\n" +
				"주문 시간 : " + DeliveryTime + "\n" +
				"주문 가격 : " + DeliveryCost + "\n" +
				"메뉴 번호 : " + DeliveryMenuNumber ;
				
	}
}
