package Practice;

public class ReverseOnlyCharacterFromTheString {

	public static void main(String[] args) {

		String str = "su45raj123";

		StringBuilder letters = new StringBuilder();

		// Collect letters in reverse order
		for (int i = str.length() - 1; i >= 0; i--) {
			if (Character.isAlphabetic(str.charAt(i))) {
				letters.append(str.charAt(i));
			}
		}

		int index = 0;
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isAlphabetic(str.charAt(i))) {
				result.append(letters.charAt(index++));
			} else {
				result.append(str.charAt(i));
			}
		}

		System.out.println(result);
	}
}

//int index = 0;
//
//char[] arr = {'A', 'B', 'C'};
//
//System.out.println(arr[index++]);
//System.out.println(index);