package AbstractExample;

public class Addition extends AbstractExample
{

	@Override
	int operate(int n1, int n2) {

		System.out.println("Addition Called ");
		return n1+n2;
	}
	
}
