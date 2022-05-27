package com.example.FibonacciDiamondLast;

import java.util.Scanner;


/// print fibonacci in diamond pattern
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter a number : ");
    	Integer num = sc.nextInt();
//    	int half = num/2;
    	
    	
    	
    	
    	
//    	String padded = String.format("%-18d"," ");
    	long[] values = new long[num * num]; // space O(N) used
		values[0] = 0;
		values[1] = 1;
		long a = 0, b = 1, c = a + b;
		int half = num/2;
		for (int i = 2; i < num * num; i++)
			values[i] = values[i - 1] + values[i - 2]; // single traversal O(N)
////         
//		// to get last number in fibonacci series
		int any = num * (num/2) + half + 1;
//		System.out.print(any);
//String padded = String.format("%-20s", str);
//		System.out.println("The nth fibonacci number is " + values[any]);
		int count = 1;
		while (values[any] != 0) {
			values[any] = values[any] / 10;
			count++;
		}
//		System.out.println("fibonacci number total digits are " + count);
//		System.out.println(any);
//		System.out.println();
    	    	
    	int noOfSpaces=count;
    	System.out.print(count);
    	System.out.println();
    	int noOfColumns = 1;
        for(int i=1;i<=num+1;i++) {
        	for(int j=1;j<=noOfSpaces;j++)
        	{
        		if(count>9)
        			System.out.print("          ");
        		else
        			System.out.print("     ");
        	}
        	if(i<(num/2)+1) {
        		noOfSpaces=noOfSpaces-2;
        	}
        	else
        		noOfSpaces=noOfSpaces+2;
        	
        	for(int j=1;j<=noOfColumns;j++) {
//        		if(c>0 && c<1000000)
//        			System.out.print(c+"\t\t");
        			if(count>9)
        				System.out.printf("%-20d",c);
        			else
        				System.out.printf("%-10d",c);
        		
        		c=a+b;
        		a=b;
        		b=c;
        	}
 
        	System.out.println();
        	if(i< (num/2)+1)
        		noOfColumns=noOfColumns+2;
        	else
        		noOfColumns=noOfColumns-2;
        	
        }
    }
}
