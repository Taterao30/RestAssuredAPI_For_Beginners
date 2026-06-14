package JavaPrograms14;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;

		for (int i = 0; i <= 5; i++) {

			int c = a + b;

			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}
