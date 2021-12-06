package StringProblems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String word = s.next();
		
		String reversed_word = new StringBuffer(word).reverse().toString();
		
		if(word.equals(reversed_word)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		

	}

}
