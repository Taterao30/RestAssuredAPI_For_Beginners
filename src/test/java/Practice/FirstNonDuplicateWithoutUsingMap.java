package Practice;

public class FirstNonDuplicateWithoutUsingMap {

	public static void main(String[] args) {

		String str = "aabbc";

		for (int i = 0; i < str.length(); i++) {

			int count = 0;

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {// 1,2,3,4
					count++;// a=2,
				}
			}

			if (count == 1) {
				System.out.println("First non-duplicate character: " + str.charAt(i));
				break;
			}
		}
	}
}
