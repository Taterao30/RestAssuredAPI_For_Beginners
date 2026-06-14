package Java_Programs;

public class MaxumimOccuranceOfChar {

	public static void main(String[] args) {
	
		        String str = "banana";

		        int minCount = str.length();
		        char minChar = ' ';

		        for(int i = 0; i < str.length(); i++)
		        {
		            int count = 0;

		            // Count occurrences of current character
		            for(int j = 0; j < str.length(); j++)
		            {
		                if(str.charAt(i) == str.charAt(j))
		                {
		                    count++;
		                }
		            }

		            // Check if character appeared before
		            boolean firstOccurrence = true;

		            for(int k = 0; k < i; k++)
		            {
		                if(str.charAt(i) == str.charAt(k))
		                {
		                    firstOccurrence = false;
		                    break;
		                }
		            }

		            // Update minimum count
		            if(firstOccurrence && count < minCount)
		            {
		                minCount = count;
		                minChar = str.charAt(i);
		            }
		        }

		        System.out.println("Minimum Occurring Character = " + minChar);
		        System.out.println("Count = " + minCount);
		    }
		}