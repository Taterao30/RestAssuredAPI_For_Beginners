package JavaPrograms_27_06_2026;

public class CountStringWords {

	public static void main(String[] args) {

		String str = "Suraj is good guy I";

		boolean flag = false;
		int count = 1;

		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				flag = true;
			} else if (flag == true) {

				flag = false;
				count = count + 1;
			}
		}
		System.out.println("Total number of words in string: " + count);
	}

}
