
public class ArraySecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,22,54,88,23,24,56};
		int largest= a[0];
		int secondlargest = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>largest)
			{
				secondlargest = largest;
				largest = a[i];
			}
			else if (a[i] > secondlargest)
			{
				secondlargest = a[i];
			}
		}
		
		System.out.println("Second Largest " + secondlargest);
	}

}
