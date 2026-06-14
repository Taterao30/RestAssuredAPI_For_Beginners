package JavaPrograms14;

public class ReverseString {

	public static void main(String[] args) {

		String str = "madam";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		// System.out.print(rev + " Is reversed");

		if (str.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
