package Numbers;

import java.util.Scanner;

public class Get_comma_seperated_numbers {

	public static void main(String[] args) {

		System.out.println("Enter comma seperated numbers");
		Scanner s = new Scanner(System.in);

		String input = s.nextLine();
		String[] string_inputs = input.split(",");
		int[] int_inputs = new int[string_inputs.length];

		for (int i = 0; i < string_inputs.length; i++) {
			String value = string_inputs[i].trim();
			int_inputs[i] = Integer.parseInt(value);

		}

		for (int i : int_inputs) {
			System.out.println(i);
		}
	}

}
