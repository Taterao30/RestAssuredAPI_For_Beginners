package Practice;

public class PrintAllNonDuplicateCharFromTheString {

	public static void main(String[] args) {

		String str = "aabbcdeeeeeffghhikkz";

		int[] arr = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 1) {
				System.out.println((char) i+" "+arr[i]);
				break;
			}
		}
	}
}