package Java_Programs;

public class Test1_CountDigit {

	public static void main(String[] args) {

		int no = 12345;

		int length = 0;

		while (no != 0) {
			no = no / 10;

			length = length + 1;
		}
		System.out.println(length);
	}
}
