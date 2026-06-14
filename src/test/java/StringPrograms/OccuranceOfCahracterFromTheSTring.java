package StringPrograms;

public class OccuranceOfCahracterFromTheSTring {

	public static void main(String[] args) {

		String str = "banana";

		int arr[] = new int[126];

		// Count frequency
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}

		// Print each character only once
		for (int i = 0; i < str.length(); i++) {

			if (arr[str.charAt(i)] != 0) {

				System.out.println(str.charAt(i) + " = " + arr[str.charAt(i)]);

				arr[str.charAt(i)] = 0; // Prevent duplicate printing
			}
		}
	}
}
