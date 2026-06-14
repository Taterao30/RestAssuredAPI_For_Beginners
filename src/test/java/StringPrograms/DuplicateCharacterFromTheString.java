package StringPrograms;

public class DuplicateCharacterFromTheString {

	public static void main(String[] args) {
		String str = "abdbcdbdd";

		str = str.replaceAll("\\s", "");
		// System.out.println(str);

		int[] arr = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 1) {
				System.out.println((char) i + " repeated " + arr[i] + " times");
			}
		}
	}

}
