package Practice;

import java.util.*;

public class OccuranceOfWordsUsingMap {

	public static void main(String[] args) {

		String str = "This is java java is simple";

		String[] splitedString = str.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String value : splitedString) {
			map.put(value, map.getOrDefault(value, 0) + 1);
		}

		System.out.println(map);
	}

}
