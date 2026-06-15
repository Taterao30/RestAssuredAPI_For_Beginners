package Practice;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueWordsUsingMap {

	public static void main(String[] args) {

		String str = "banana apple orange banana apple mango";

		String[] str1 = str.split("\\W");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String value : str1) {

			map.put(value, map.getOrDefault(value, 0) + 1);

		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());

			}
		}
	}

}
