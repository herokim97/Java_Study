package ch10;

public class AICar extends Car{
	
	@Override
	public void drive()
	{
		System.out.println("Auto drive on");
		System.out.println("Car self change root");
		
	}

	@Override
	public void stop() {
		System.out.println("self Stop");
		
	}
	
	@Override
	public void wiper()
	{
		System.out.println("Wiper On");
	}
	

}
