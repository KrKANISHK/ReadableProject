package AbstractExample;

public class AddClass extends AbstractExample
{
	@Override
	public int operate (int n1, int n2)
	{
		System.out.println("Multiplication Called");
		 return n1*n2;
	}
	public void click()
	{
		System.out.println("I Allow to click");
	}
	
}
