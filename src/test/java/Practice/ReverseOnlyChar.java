package Practice;

public class ReverseOnlyChar {

	public static void main(String[] args) {

		String str = "suraj123";

		StringBuilder letter = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {

			if (Character.isAlphabetic(str.charAt(i))) {
				letter.append(str.charAt(i));
			}

		}

		int index = 0;
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				result.append(letter.charAt(index++));
			} else {
				result.append(str.charAt(i));
			}
		}
		System.out.println(result);
	}

}
