package StringPrograms;

public class OccuranceOfWords {

	public static void main(String[] args) {

		String str = "banana apple orange banana apple banana";

		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {

			int count = 1;

			if (words[i].equals("")) {
				continue;
			}

			for (int j = i + 1; j < words.length; j++) {

				if (words[i].equals(words[j])) {
					count++;
					words[j] = ""; // Mark as visited
				}
			}

			System.out.println(words[i] + " = " + count);
		}
	}
}
