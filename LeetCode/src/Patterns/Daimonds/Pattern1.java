/**
 * *
 * **
 * ***
 * ****
 * *****
 * 
 */
package Patterns.Daimonds;

import java.util.regex.Pattern;

public class Pattern1 {

	public static void SimplePattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void reverse(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void outLine(int n) {

		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == n)
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			else {
				for (int j = 1; j <= i; j++) {
					if (j == 1 || j == i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

		/*
		 * for (int i = 1; i <= n; i++) { if (i == 1 || i == n) for (int j = 1;
		 * j <= i; j++) { System.out.print("*"); } else { for (int j = 1; j <=
		 * i; j++) { if (j == 1 || j == i) System.out.print("*"); else
		 * System.out.print(" "); } } System.out.println();
		 
	}*/

	}

	public static void main(String[] args) {
		// SimplePattern(5);
		// reverse(5);
		outLine(5);

	}

}
