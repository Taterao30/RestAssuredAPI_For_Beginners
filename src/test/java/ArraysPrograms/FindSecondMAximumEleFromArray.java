package ArraysPrograms;

public class FindSecondMAximumEleFromArray {

	public static void main(String[] args) {

		int arr[] = { 40, 10, 50, 55, 100, 60 };

		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				secMax = max;
				max = arr[i];
			} else if (arr[i] > secMax && arr[i] != max) {
				secMax = arr[i];
			}
		}

		System.out.println("Max = " + max);
		System.out.println("Second Max = " + secMax);
	}
}

//for (int num : arr) {
//    if (num > max) {
//        secMax = max;
//        max = num;
//    } else if (num > secMax && num != max) {
//        secMax = num;
//    }
//}