package ch10;

public class ManualCar extends Car {
	
	@Override
	public void drive()
	{
		System.out.println("man's drive");
		System.out.println("person control handle");
	}
	
	@Override
	public void stop()
	{
		System.out.println("push of break");
	}
	
	@Override
	public void wiper()
	{
		System.out.println("Use wiper");
	}

}
