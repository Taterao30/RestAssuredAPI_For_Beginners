package ArraysPrograms;

public class SecondMax {

	public static void main(String[] args) {

		int arr[] = { 1000, 10, 30, 100, 50, 100, 500, 600, 600 };
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		System.out.println(secondMax);
	}

}
