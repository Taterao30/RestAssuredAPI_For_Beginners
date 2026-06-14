package JavaPrograms14;

public class CountDigit {

	public static void main(String[] args) {

		int num = 1234;

		int length = 0;

		while (num != 0) {
			num /= 10;

			length = length + 1;

		}

		System.out.println(length);

	}

}
