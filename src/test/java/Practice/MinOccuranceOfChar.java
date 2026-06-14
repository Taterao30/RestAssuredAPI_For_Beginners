package Practice;

public class MinOccuranceOfChar {

	public static void main(String[] args) {

		String str = "banana";

		int arr[] = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		int max = str.length();

		char c = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (max > arr[str.charAt(i)]) {
				max = arr[str.charAt(i)];
				c = str.charAt(i);
			}
		}
		System.out.println(c + " min occurance of char");
	}

}
