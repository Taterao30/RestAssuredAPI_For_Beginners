package JavaPrograms_27_06_2026;

public class Print_1_To_100_PrimeNumber {

	public static void main(String[] args) {
		for (int no = 2; no <= 100; no++) {

			boolean isPrime = true;

			for (int i = 2; i <= Math.sqrt(no); i++) {
				if (no % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime == false) {
				System.out.print(no + " ");
			}
		}

	}
}
