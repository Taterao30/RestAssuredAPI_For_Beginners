package ArraysPrograms;

public class FindMaxNumFromArray {

	public static void main(String[] args) {

		int arr[] = { 1000, 10, 30, 100, 50, 100, 500 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}
}
