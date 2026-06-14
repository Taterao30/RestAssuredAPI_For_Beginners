package JavaPrograms14;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 1211;
		int rev = 0;
		int temp = num;
		int rem;

		while (temp != 0) {
			rem = temp % 10;

			rev = rev * 10 + rem;

			temp = temp / 10;

		}

		if (num == rev) {
			System.out.println(num + " is palindrome");
		} else {
			System.out.println(num + " is not palindrome");
		}

	}

}
