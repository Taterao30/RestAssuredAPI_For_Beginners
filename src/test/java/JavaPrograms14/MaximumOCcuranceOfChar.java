package JavaPrograms14;

public class MaximumOCcuranceOfChar {

	public static void main(String[] args) {

		String str = "aaaaabbccddefggggg";

		int arr[] = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		char c = ' ';
		int max = -1;

		for (int i = 0; i <str.length(); i++) {
			if (max < arr[str.charAt(i)]) {
				max=arr[str.charAt(i)];
				c = str.charAt(i);
			}
		}
		System.out.println("Maximum occurance of character is: " + c);

	}
	

}
