package StringProblems;

import java.util.HashMap;

public class first_non_repeating_character {

	public static void main(String[] args) {

		String word = "aabscbdcjkdjks";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (char key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}

		System.out.print("First non-repeating character - ");
		for (char key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.println("First non-repeating character - " + key + " : 1");
				return;
			}
		}
		System.out.println("No non-repeating character");

	}

}