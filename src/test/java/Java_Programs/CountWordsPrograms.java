package Java_Programs;

public class CountWordsPrograms {

	 public static void main(String[] args)
	    {
	        String str = " Java is easy to learn";

	        int count = 1;

	        for(int i = 0; i < str.length(); i++)
	        {
	            if(str.charAt(i) == ' ')
	            {
	                count++;
	            }
	        }

	        System.out.println("Total Words = " + count);
	    }
	}