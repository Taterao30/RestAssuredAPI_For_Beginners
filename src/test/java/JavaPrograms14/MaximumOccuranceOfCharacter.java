package JavaPrograms14;

public class MaximumOccuranceOfCharacter {

	public static void main(String[] args) {

		String str = "banana";

		int[] arr = new int[126];

		for (int i = 0; i < str.length(); i++) {

			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;

		}

		int maxCount = -1;

		char c = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (maxCount < arr[str.charAt(i)]) {
				maxCount = arr[str.charAt(i)];
				c = str.charAt(i);

			}
		}
		System.out.println(c);

	}

}
