package PracticingLoops;
//WAP to reduce I__am_on___leave
// to My_aunt_is_late_for_office
public class StringRemoval {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int j=0;
		
		StringBuilder str = new StringBuilder("");
		System.out.println("Initial Length of string builder " + str.length());
		String value = "I__am_on___leave";
		System.out.println("Initial String: " + value );
		for(int i=0; i<value.length();i++)
		{
			if(value.charAt(i)=='_')
			{
				j++;
			}
			if (value.charAt(i)!='_' || j==1)
			{
				str.append(value.charAt(i));
				if(value.charAt(i)!='_')
					j=0;
			}
		}
		System.out.println("Final String: " + str.toString());
		
		
		
	}

}
