package JavaPrograms_27_06_2026;

public class MaximumOccuranceOfCharacters {

	public static void main(String[] args) {

		String str = "aabbccddeefghi";

		int arr[] = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		int max = 0;
		char c = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (max < arr[str.charAt(i)]) {
				max = arr[str.charAt(i)];
				c = str.charAt(i);
			}
		}

		System.out.println(c + " Times: " + max);

	}

//	  int max = 0; char ch = ' ';
//	  
//	  for (int i = 0; i < arr.length; i++) {
//	  
//	  if (arr[i] > max)
//	  {
//		  max = arr[i]; 
//		  ch = (char) i;
//	  
//	  } }
//	  
//	  System.out.println(ch + " = " + max);
//	 

}
