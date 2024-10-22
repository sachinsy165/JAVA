package Array;

public class Act 
{

	public static void name() 
	{
		try {
			int x=100/0;
		}
		 
		catch (Exception e) 
		{
			 System.out.println("Handled");
		}
		
	}
	
	public static void main(String[] args) 
	{
		name();
		System.out.println("hey sachin");
	}
}
