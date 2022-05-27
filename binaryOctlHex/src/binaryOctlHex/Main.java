package binaryOctlHex;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class Main {

	static int choice;
	static Scanner sc = new Scanner(System.in);

	public static void convert() {
		String str = "", hexa = "", octal = "";
		// get a decimal number from user
		System.out.println("Enter The Decimal Number : ");
		int inputNumber = sc.nextInt();
		char hexaDecimals[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int rem = 0;
		// connvert into hexaDecimal
		if (choice == 1) {
			while (inputNumber > 0) {
				rem = inputNumber % 16;
				hexa = hexaDecimals[rem] + hexa;
				inputNumber = inputNumber / 16;
			}
			System.out.println("HexaDecimal Equivalent is" + inputNumber + " = " + hexa);

		}
		// connvert into Binary
		else if (choice == 2) {
			while (inputNumber > 0) {
				rem = inputNumber % 2;
				str = rem + str;
				inputNumber = inputNumber / 2;
			}
			System.out.println("Binary Equivalent is :" + str);
		}
		// convert into Octal
		else if (choice == 3) {
			while (inputNumber > 0) {
				rem = inputNumber % 8;
				octal = rem + octal;
				inputNumber = inputNumber / 8;
			}
			System.out.println("Octal Equivalent is :" + octal);
		}

	}

	public static void main(String[] args) {
		boolean exit = false;
		while (!exit)// loop for continue the program
		{
			try {
				System.out.println("\nConvert Number into HexaDecimal,Binary and Octal");
				System.out.println("Press 1 For Convert into HexaDecimal");
				System.out.println("Press 2 For convert into Binary");
				System.out.println("Press 3 For convert into Octal");
				System.out.println("Press 4 For Exit");
				System.out.println("Enter Your Choice");
				choice = sc.nextInt();
				switch (choice) {

				case 1:
					convert();
					break;

				case 2:
					convert();
					break;

				case 3:
					convert();
					break;

				case 4:
					exit = true;
					break;

				default:
					System.out.println("Invalid Choice");
				}
			}

			catch (InputMismatchException e)// catch for invalid input
			{
				sc.nextLine();
				System.out.println("Enter Numeric value only ");
			}
		}
	}
}
