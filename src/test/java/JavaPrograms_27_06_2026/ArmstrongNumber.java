package JavaPrograms_27_06_2026;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int temp1 = num;
		int count = 0;

		while (temp1 != 0) {

			count = count + 1;
			temp1 = temp1 / 10;

		}

		int temp2 = num;
		int rem = 0;
		int sum = 0;

		while (temp2 != 0) {
			rem = temp2 % 10;

			temp2 = temp2 / 10;

			int mul = 1;

			for (int i = 1; i <= count; i++) {
				mul = mul * rem;
			}
			sum = sum + mul;

		}
		System.out.println(sum);

	}

}
