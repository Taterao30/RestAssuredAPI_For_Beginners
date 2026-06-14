package Practice;

public class CharacterScenarios {

	public static void main(String[] args) {

		String str = "aabbcdeeeeeffghhikkz";

		int[] arr = new int[126];

		// Count frequency
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}

		System.out.println("All Duplicates:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1) {
				System.out.println((char) i + " " + arr[i]);
			}
		}

		System.out.println("\nAll Non Duplicates:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				System.out.println((char) i + " " + arr[i]);
			}
		}

		System.out.println("\nFirst Duplicate:");
		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] > 1) {
				System.out.println(str.charAt(i));
				break;
			}
		}

		System.out.println("\nFirst Non Duplicate:");
		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] == 1) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}