package Recurssion;

public class Print1tonandreverse {

//code base(conditon to stop) : hypothisis :induction
	public static void print1ton(int n) {
		if (n == 1) {
			System.out.print(1 + ",");
			return;
		}
		print1ton(n - 1);
		System.out.print(n + ",");
	}

	public static void printNto1(int n) {
		if (n == 1) {
			System.out.print(1 + ",");
			return;
		}
		System.out.print(n + ",");
		printNto1(n - 1);
	}

	public static void main(String[] args) {
		print1ton(7);
		System.out.println();
		printNto1(7);
		System.out.println();
		for (int i = 0; i < 5; i++)
			System.out.println(fibonnaci(i));
	}

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public static int fibonnaci(int n) {
		int sum = 0;
		if (n < 0)
			return -1;
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonnaci(n - 1) + fibonnaci(n - 2);
		}
	}

}
