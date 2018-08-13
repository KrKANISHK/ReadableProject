package Inheritance;

public class MountainBike extends Bycycle
{
	int seatheight;
	public MountainBike (int Gear, int Speed)
	{
		super(Gear,Speed);
	}
	
	public void setHeight(int height)
	{
		this.seatheight = height;
		System.out.println("seat Height of a mountain bike is " + seatheight);
	}
}
