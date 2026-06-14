package JavaPrograms14;

public class Print1To10PrimeNumbers {

	public static void main(String[] args) {

		for (int num = 2; num <= 100; num++) {
			boolean flag = true;
			for (int i = 2; i < num; i++) {

				if (num % i == 0) {

					flag = false;
					break;
				}
			}

			if (flag == true) {
				System.out.println(num + " ");

			}

		}

	}

}
