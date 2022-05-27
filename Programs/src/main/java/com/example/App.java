package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

//  2 print pattern 
public class App {

	static void pattern() {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		if (n <= 0) {
			System.out.print("Invalid Number..\nPlease Enter a positive number: ");
			n = sc.nextInt();
		}
		if (n > 0) {
			int i, j, k;
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= i; j++) {
					System.out.print(" " + j + " ");
				}
				for (k = n - 1; k >= i; k--) {
					if (k >= 9)
						System.out.print("    ");
					else
						System.out.print("   ");
				}
				for (int l = n - 2; l >= i; l--) {
					if (l >= 9)
						System.out.print("    ");
					else
						System.out.print("   ");
				}
				for (int m = i; m >= 1; m--) {
					if (m != n)
						System.out.print(" " + m + " ");

				}
//        	for(j=i;j>=1;j--) {
//        		System.out.print(j);
//        	}
				System.out.println("\n");
			}
		}
	}

	public static void main(String args[]) {

		try {
			pattern();
			String c = "";
			while (!c.equals("0")) {
				System.out.print("\nPress Y to continue and 0 to exit: ");
				Scanner scanner = new Scanner(System.in);
				c = scanner.next();
				if (c.equals("Y")||c.equals("y")) {
					pattern();
				}
				else if(c.equals("0")) {
//					System.out.print("\nProgram is terminated");
					System.exit(0);
					break;
				}
				else {
					System.out.print("Please enter valid characters..");
					break;
				}
			}
		}catch (Exception e) {
			System.out.print("Please enter numeric value");

		}
	}
}
