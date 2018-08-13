package StringReversal;

public class Reverse 
{
	static String reveresed="";
	public static void reverse( String value)
	{
		int length = value.length();
		for(int i=length-1;i>=0;i--)
		{
			reveresed += value.charAt(i);
		}
		
		System.out.println(reveresed.toLowerCase());
	}
	
	
	public static void main(String[] args)
	{
		reverse("Kanishk");
	}
	
}
