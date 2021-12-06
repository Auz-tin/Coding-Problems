package Numbers;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Series Length:");
		int series_length = s.nextInt();
		
		if(series_length <= 0) {
			System.out.println("Invalid entry");
		}
		else if(series_length == 1) {
			System.out.println("0");
		}
		else {
			
			int count = 2;
			int first_number = 0;
			int second_number = 1;
			System.out.print(first_number+", "+second_number);
			while(count < series_length) {
				int sum = first_number + second_number;
				System.out.print(", "+sum);
				first_number = second_number;
				second_number = sum;
				count ++;
			}
			
		}
				

	}

}
