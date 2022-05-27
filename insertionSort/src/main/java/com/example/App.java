package com.example;

import java.util.Scanner;

// 5  insertion sort
public class App {
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int key = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = key;
				j--;

			}
		}
	}

	public static void insertintoarray(int arr[], int key) {

		int i, j = 0;
		int new_arr[] = new int[arr.length + 1];
		for (i = 0; i < new_arr.length; i++) {
			if (key <= arr[i]) {
				new_arr[i] = key;
				break;
			} else {
				new_arr[i] = arr[j++];
			}
		}
		for (int k = i + 1; k < new_arr.length; k++)
			new_arr[k] = arr[j++];
		for (i = 0; i < new_arr.length; i++)
			System.out.print(new_arr[i] + " ");
	}

	public static int[] deletefromarray(int arr[], int index) {
		if (index < 0 || index >= arr.length || arr == null) {
			System.out.println("No deletion can be done");
			return arr;
		}
		int rmarr[] = new int[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
				continue;
			}
			rmarr[k++] = arr[i];
		}
		return rmarr;
	}

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter size : ");
			Integer n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
//       int[] arr = {1,90,56,22,13,84,95,61,78,8,999,100,11,212,3,205,40,5,7,131,14,190,141,170,118,195,2};
			sort(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
//       System.out.println("\nArray size is: "+arr.length);
//       Scanner sc = new Scanner(System.in);
			String c = "";

			do {
				System.out.print("\nPress Y to continue and 0 to exit: ");
				Scanner scanner = new Scanner(System.in);
				c = scanner.next();
				if (c.equals("Y") || c.equals("y")) {

					System.out.println("\nEnter 1 to insert and 2 to delete from an array : ");
					System.out.print("\nEnter a case : ");
					Integer obj = sc.nextInt();
					switch (obj) {
					case 1:
						System.out.print("\nEnter the value to insert: ");
						int key = sc.nextInt();
//               System.out.println(key);
						System.out.print("\nAfter Insertion: ");
						insertintoarray(arr, key);
						break;
					case 2:
						Scanner sc1 = new Scanner(System.in);
						System.out.print("\nEnter index to delete: ");
						int indexfordelete = sc1.nextInt();
						arr = deletefromarray(arr, indexfordelete);
						System.out.println("Array after deletion :");
						for (int i = 0; i < arr.length; i++) {
							System.out.print(arr[i] + " ");
						}
						if (arr.length == 0) {
							System.out.print("All array elements are removed.");
							System.exit(0);
						}
//        	   System.out.println("Array after deletion :"+ arr.toString());
						break;

					default:
						System.out.println("Please enter valid value..");

					}
				}
			}
			while(!c.equals("0"));{
				System.exit(0);
			}
			
		} catch (Exception e) {
			System.out.print("Exception occured...Can not have character value.. ");
		}
	}
}
