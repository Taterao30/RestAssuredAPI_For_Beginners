package JavaPrograms14;

public class FibonacciSeriesUsingRec {
	
	
	public static int factorial(int n)
	{
		if(n<=1)
		{
			return n;
		}
		
		
		return n*(factorial(n-1));
		

	}
	
	
	public static void main(String[] args) {
		
		int result=factorial(5);
		
		System.out.println(result);
		
	}

}
