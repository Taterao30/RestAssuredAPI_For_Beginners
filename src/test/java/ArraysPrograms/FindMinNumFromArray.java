package ArraysPrograms;

public class FindMinNumFromArray {

	public static void main(String[] args) {

		int arr[] = { 1000, 10, 30, 100, 50, 100, 500 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
