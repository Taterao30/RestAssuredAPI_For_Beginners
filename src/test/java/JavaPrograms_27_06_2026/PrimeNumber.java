package JavaPrograms_27_06_2026;

public class PrimeNumber {

	public static void main(String[] args) {

		int no = 7;
		boolean flag = false;

		for (int i = 2; i < no; i++) {

			if (no % i == 0) {
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println(no + " is Prime");
		} else {
			System.out.println(no + " is Not Prime");
		}
	}
}