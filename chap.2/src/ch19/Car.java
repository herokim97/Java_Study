package ch19;

public class Car {
	
	private static int SerialNum = 10001;
	private int carNum;
	
	public Car()
	{
		carNum = SerialNum;
		SerialNum++;
	}

	public int getCarNum() {
		return carNum;
	}

	public static void setSerialNum(int serialNum) {
		SerialNum = serialNum;
	}
	
	
	


	
	

	

}
