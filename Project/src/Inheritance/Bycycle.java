package Inheritance;

public class Bycycle 
{
	int gear, speed;
	
	public Bycycle(int Gear, int Speed)
	{
		this.gear=Gear;
		this.speed=Speed;
		System.out.println("Initial Speed is " + speed + " and Gear is " + gear);
		
	}
	
	void applyBrake(int decrement)
	{
		speed -=decrement;
		System.out.println("brakes applied Speed is now" + speed);
		
	}
	public void speedUp(int increment)
	{
		speed +=increment;
		System.out.println("New Speed " + speed);
	}
}
