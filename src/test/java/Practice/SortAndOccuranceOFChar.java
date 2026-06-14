package Practice;

import java.util.Arrays;

public class SortAndOccuranceOFChar {

	public static void main(String[] args) {

		String str = "zzaabbccddeefgggghi";
		str = str.replaceAll("\\s+", "");

		char[] ch = str.toCharArray();
		Arrays.sort(ch);

		System.out.println("Sorted String: " + new String(ch));

		int arr[] = new int[126];

		for (char c : ch) {
			arr[c]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.println((char) i + " : " + arr[i]);
			}
		}
	}
}
