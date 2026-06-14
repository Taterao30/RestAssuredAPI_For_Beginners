package Practice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWordsInString2 {

	public static void main(String[] args) {

		String str = "Java is Simple simple is java";
		str = str.toLowerCase();
		System.out.println(str);

		String splitedString[] = str.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < splitedString.length; i++) {
			if (map.containsKey(splitedString[i])) {
				map.put(splitedString[i], map.get(splitedString[i]) + 1);
			} else {
				map.put(splitedString[i], 1);
			}
		}
		System.out.println(map);
	}

}
