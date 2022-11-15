package ch09;

public abstract class Computer {
	
	abstract void display();
	abstract void typing();
	
	public void turnOn()
	{
		System.out.println("power On");		
	}
	
	public void turnOff()
	{
		System.out.println("power Off");
	}
	

}
