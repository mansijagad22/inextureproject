package com.example;

import java.util.Scanner;
import java.util.Stack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StackOperationsMavenSpringApplication {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter length for stack : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("enter value for " + i + "position in the stack : ");
			int m = sc.nextInt();
			System.out.println();
			stack.add(m);
		}
		String a = "y";
//		stack.push(7);
//		stack.push(3);
//		stack.push(36);
//		stack.push(78);
//		stack.push(55);
//		stack.push(21);
//		stack.push(37);
		System.out.println("Stack values are " + stack);

		// Popping items from the Stack
		int cardAtTop = stack.pop();
		int removed = stack.pop();
		System.out.println("Stack.pop() => " + cardAtTop);
		System.out.println("Stack.pop() => " + removed);
//		System.out.println("Stack.pop() => " + remove);
		System.out.println("Current Stack => " + stack);
		System.out.println();

		// get the top item from stack without removing it
		cardAtTop = stack.peek();
		System.out.println("Stack.peek() => " + cardAtTop);
		System.out.println("Current Stack => " + stack);
		System.out.println();
		if (!stack.isEmpty()) {
			int position = stack.search(7);
			System.out.println("position of 7 number in the stack is " + position);
		}
		System.out.println("enter index to remove from stack : ");
		int rm = sc.nextInt();
		int rem_ele = stack.remove(rm);
		// Print the removed element
		System.out.println("Removed element: " + rem_ele);

		// Print the final Stack
		System.out.println("Final Stack: " + stack);
		System.out.println("size of stack is : " + stack.size());

		while (a.equals("Y") || a.equals("y")) {
			System.out.println("Please enter index to insert into stack ");
			int index = sc.nextInt();
			if (!(index > stack.size())) {
				System.out.println("Enter Value to insert into stack ");
				int val = sc.nextInt();
				stack.insertElementAt(val, index);
				System.out.println("Stack after insert value is : " + stack);
				a="N";
			} else {
				System.out.println("Please enter valid index...");
				System.out.println("Do you want to continue enter the index ? Press Y/N ");
				a = sc.next();
				if (a == "N") {
					System.exit(0);
				}
			}
		}
//        if(position != -1) {
//            System.out.println("Found the element \"Queen\" at position : " + position);
//        } else {
//            System.out.println("Element not found");
//        }

	}

}
