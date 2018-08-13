
public class Triangle implements test{

	StringBuilder bfr=new StringBuilder("Kanishk");
	
	public static void main(String[] args) 
	{
		
		Triangle tr=new Triangle();
		tr.bfr.append(" is working on C Sharp");
		
		String name = tr.bfr.toString();
		System.out.println(name);
		    int size=10;
		    int i, j;
		    for(i=1;i<=size;i++) {
		      for(j=1;j<=size;j++) {
		        if((i+j)>size) {
		          System.out.print("*");
		          System.out.print(" ");
		        } else {
		          System.out.print(" ");
		        }
		      }
		      System.out.println();
		    }
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	}
	

}
