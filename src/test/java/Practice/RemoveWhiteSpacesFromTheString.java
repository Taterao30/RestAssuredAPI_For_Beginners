package Practice;

public class RemoveWhiteSpacesFromTheString {

	public static void main(String[] args) {

		String str = "           Suraj Ram Gaikwad";

		str = str.replaceAll("\\s+", "").trim();

		System.out.println(str);
	}

}
