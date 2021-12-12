package StringProblems;

public class string_encoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "aabscccccccccccbdj";
		String encoded_word = encode(word);
		System.out.println(encoded_word);

		String decoded_word = decode(encoded_word);
		System.out.println(decoded_word);
	}

	private static String decode(String encoded_word) {

		String decoded_word = "";

		int occurences = 0;

		for (int i = 0; i < encoded_word.length(); i++) {

			char ch = encoded_word.charAt(i);

			if (Character.isDigit(encoded_word.charAt(i))) {
				if (occurences == 0) {
					occurences = Character.getNumericValue(ch);
				} else {
					occurences = (occurences * 10) + Character.getNumericValue(ch);
				}
			} else {
				for (int occurence = 0; occurence < occurences; occurence++) {
					decoded_word += Character.toString(ch);
				}
				System.out.println(occurences + "*" + ch);
				occurences = 0;
			}
		}

		return decoded_word;

	}

	private static String encode(String word) {

		String encoded_word = "";
		int counter = 1;
		int previous_character = word.charAt(0);

		for (int i = 1; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == previous_character) {
				counter++;
			} else {
				encoded_word += counter + Character.toString(previous_character);
				previous_character = ch;
				counter = 1;
			}
		}

		return encoded_word;
	}

}
