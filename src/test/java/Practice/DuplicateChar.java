package Practice;

public class DuplicateChar {

	public static void main(String[] args) {

		String str = "            zzaabbccddeefgggghi";
		str = str.replaceAll("\\s+", "");

		int arr[] = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 1) {
				System.out.println((char) i + ":  " + arr[i]);
			}
		}
	}

}
