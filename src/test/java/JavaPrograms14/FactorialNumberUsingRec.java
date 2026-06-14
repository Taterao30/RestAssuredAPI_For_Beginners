package JavaPrograms14;

public class FactorialNumberUsingRec {
	
	
	public static int fact(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fact(n-1)+fact(n-2);
	}
	
	
	public static void main(String[] args) {
		
		
		for(int i=0;i<=5;i++)
		{
			
			System.out.print(fact(i)+" ");
		}
	}

}
