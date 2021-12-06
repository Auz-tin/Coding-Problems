package Numbers;
import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		char choice;
		do {
			System.out.println("Enter the number to check if it is a prime number:");
			int number = s.nextInt();
			
			number = Math.abs(number);
			
			if(number==0 || number == 1) {
				System.out.println("unsure!!");
			}
			else {
				boolean IsPrime = true;
				iteration:
				for(int i=2; i<=(number/2); i++) {
					if(number%i==0) {
						IsPrime = false;
						break iteration;
					}
				}
				if(IsPrime) {
					System.out.println("Prime number");
				}
				else {
					System.out.println("Not a Prime number");
				}
			}
			System.out.println("Want to check for another number(Y/N):");
			choice=s.next().charAt(0);
		} while(choice == 'Y' || choice == 'y');
		
		System.out.println("--------------------");

	}

}
