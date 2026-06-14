package Practice;

import java.util.*;

public class OccuranceOfCharUsingMap2 {

	public static void main(String[] args) {

		String str = "aabbcdff";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : str.toCharArray()) {

			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);
	}

}
