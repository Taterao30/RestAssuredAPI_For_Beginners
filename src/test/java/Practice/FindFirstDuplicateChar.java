package Practice;

import java.util.HashMap;
import java.util.Map;

public class FindFirstDuplicateChar {

    public static void main(String[] args) {

        String str = "zaabbccddefgz";

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first duplicate character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) > 1) {
                System.out.println("First duplicate character: " + ch);
                break;
            }
        }
    }
}