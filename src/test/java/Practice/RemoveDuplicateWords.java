package Practice;

import java.util.*;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String str = "java is simple java is oopps";

		String[] words = str.split(" ");

		Set<String> set = new LinkedHashSet<>();

		for (String word : words) {
			set.add(word);
		}
		System.out.println(set);
		for (String word : set) {
			System.out.print(word + " ");
		}
	}
}