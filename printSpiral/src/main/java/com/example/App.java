package com.example;

import java.util.Scanner;

// 3 print spiral numbers
public class App {

	static void printSpiralPattern(int size) {
		int row = 0, col = 0;
		int boundary = size - 1;
		int sizeLeft = size - 1;
		int flag = 1;
		char move = 'r';

		int[][] matrix = new int[size][size];
		for (int i = 1; i < size * size + 1; i++) {

			matrix[row][col] = i;

			switch (move) {

			case 'r':
				col += 1;
				break;

			case 'l':
				col -= 1;
				break;

			case 'u':
				row -= 1;
				break;

			case 'd':
				row += 1;
				break;
			}

			if (i == boundary) {

				boundary = boundary + sizeLeft;

				if (flag != 2) {
					flag = 2;
				} else {
					flag = 1;
					sizeLeft -= 1;
				}

				switch (move) {

				case 'r':
					move = 'd';
					break;

				case 'd':
					move = 'l';
					break;

				case 'l':
					move = 'u';
					break;

				case 'u':
					move = 'r';
					break;
				}
			}
		}

		for (row = 0; row < size; row++) {
			// inner for loop for columns
			for (col = 0; col < size; col++) {
				int n = matrix[row][col];
				if (n < 10)
					System.out.print(n + "    ");
				else if(n>=10 && n<100)
					System.out.print(n + "   ");
				else if(n>=100 && n<1000){
					System.out.print(n+"  ");
				}
				else {
					System.out.print(n+" ");
				}
			}
			System.out.println();
		}
	}

	public static void printAntiSpiralPattern(int size) {

		int row = 0, col = size - 1;
		int boundary = size - 1;
		int sizeLeft = size - 1;
		int flag = 1;

		char move = 'l';

		int[][] matrix = new int[size][size];
		for (int i = 1; i < size * size + 1; i++) {
			matrix[row][col] = i;

			switch (move) {

			case 'r':
				col += 1;
				break;

			case 'l':
				col -= 1;
				break;

			case 'u':
				row -= 1;
				break;

			case 'd':
				row += 1;
				break;
			}

			if (i == boundary) {

				boundary = boundary + sizeLeft;

				if (flag != 2) {
					flag = 2;
				} else {
					flag = 1;
					sizeLeft -= 1;
				}

				switch (move) {

				case 'l':
					move = 'd';
					break;

				case 'd':
					move = 'r';
					break;

				case 'r':
					move = 'u';
					break;
				// if up, rotate to right
				case 'u':
					move = 'l';
					break;
				}
			}
		}

		for (row = 0; row < size; row++) {

			for (col = 0; col < size; col++) {
				int n = matrix[row][col];
				if (n < 10)
					System.out.print(n + "    ");
				else if(n>=10 && n<100)
					System.out.print(n + "   ");
				else if(n>=100 && n<1000){
					System.out.print(n+"  ");
				}
				else {
					System.out.print(n+" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		// enter the number of elements.
		System.out.print("Enter the number of elements for pattern : ");
		int size = sc.nextInt();
		System.out.print("Press 1 for clock-wise and 2 for anti-clock-wise output : ");
		int choice = sc.nextInt();
		if (choice == 1) {
			printSpiralPattern(size);
		} else if (choice == 2) {
			printAntiSpiralPattern(size);
		} else {
			System.out.print("Enter a valid input..");
		}
	}
}
