package Numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class set_of_prime_numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter start value:");
		int start = sc.nextInt();
		System.out.println("Enter end value:");
		int end = sc.nextInt();

		if (start > end || start < 0) {
			System.out.println("Invalid entries");
		} else {
			ArrayList<Integer> list = new ArrayList<Integer>();

			for (int num = start; num <= end; num++) {
				boolean IsPrime = true;

				for (int i = 2; i <= (num / 2); i++) {
					if (num % i == 0) {
						IsPrime = false;
						break;
					}
				}
				if (num != 0 && num != 1) {
					if (IsPrime) {
						list.add(num);
					}
				}

			}
			if (list.size() == 0) {
				System.out.println("There are no prime numbers in the range");
			} else {
				System.out.println("There are " + list.size() + " prime numbers,  They are:");
				for (int i : list) {
					System.out.println(i + " ");
				}
			}
		}

	}

}
