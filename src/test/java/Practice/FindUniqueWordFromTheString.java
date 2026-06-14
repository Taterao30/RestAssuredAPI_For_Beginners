package Practice;

public class FindUniqueWordFromTheString {

	public static void main(String[] args) {

		String str = "banana apple orange banana apple mango";

		String str1[] = str.split(" ");

		for (int i = 0; i < str1.length; i++) {

			int count = 0;

			for (int j = 0; j < str1.length; j++) {

				if (str1[i].equals(str1[j])) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(str1[i]);
			}
		}

	}
}