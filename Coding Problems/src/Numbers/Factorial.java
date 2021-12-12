package Numbers;

public class Factorial {

	public static void main(String[] args) {

		int num = 5;
		int fibo = recursion_method(num);
		System.out.println(fibo);

	}

	private static int recursion_method(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * recursion_method(num - 1);
		}
	}

}
