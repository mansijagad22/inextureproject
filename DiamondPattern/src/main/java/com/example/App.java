
package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

///  print diamond in fibonacci series
public class App {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    
	        System.out.println("Enter number");
	        int a = 0, b = 1, c = a + b;
	        Integer n = sc.nextInt();	
	        int mid = n/2;
	        int num = 1;   
	        for (int i = mid; i > 0; i--)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print("   ");
	            }
	            for (int j = 1; j <= num; j++)
	            {
	            		System.out.print(c+"	");
	                c=a+b;
	                a=b;
	                b=c;
	            }
	  
	            System.out.println();
	            num++;
	        }
	         
	       for (int i = 0; i <= mid; i++) 
	        {     
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print("   ");
	            }
	             
	          	             
	            for (int j = num; j > 0; j--) 
	            {System.out.print(c+"	");
	                c=a+b;
	                a=b;
	                b=c;
	            }
	             
	            System.out.println();
	             
	            num--;
	        }
//		int n, i, j, k = 1;
//		int a = 0, b = 1, c = a + b;
//		System.out.print("Enter the number : ");
//		Scanner s = new Scanner(System.in);
//		n = s.nextInt();
//		k = n - 1;
//		for (j = 1; j <= n; j++) {
//			for (i = 1; i <= k*2; i++) {
//				System.out.print("   ");
//			}
//			k--;
//			for (i = 1; i <= 2 * j - 1; i++) {
//
//					System.out.print(c+"	");
//				c = a + b;
//				a = b;
//				b = c;
//			}
//			System.out.println();
//		}
//		k = 1;
//		for (j = 1; j <= n - 1; j++) {
//			for (i = 1; i <= k*2; i++) {
//				System.out.print("   ");
//			}
//			k++;
//			for (i = 1; i <= 2 * (n - j) - 1; i++) {			
//					System.out.print(c+"	");//7//6
////					
////				else if(c > 10 && c < 100)
////					System.out.print(c+" ");//6
////				else if (c > 100 && c < 1000)
////					System.out.print(" "+c+"  ");//5//6
////				else if (c > 1000 && c < 10000)
////					System.out.print(" "+c+" ");//6
////				else if (c > 10000 && c < 100000)
////					System.out.print(c + " ");//6
//////				if (c < 100)
//////					System.out.print(c + "  ");
//////				if (c > 100)
////				else
////					System.out.print(c + " ");
////				if (c > 1000 && c < 10000)
////					System.out.print(c + " ");
////				if (c > 10000 && c < 100000)
////					System.out.print(c + " ");
//////				if (c > 100000 && c < 1000000)
//////					System.out.print(c + "   ");
////				if (c > 1000000)
////				else
////					System.out.print(c + " ");
//
//				c = a + b;
//				a = b;
//				b = c;
//			}
//			System.out.println();
//		}

	}
}

//if(c<10)
//	System.out.print(" "+c+" ");//7//6
//else if(c > 10 && c < 100)
//	System.out.print(c+"  ");//6
//else if (c > 100 && c < 1000)
//	System.out.print(" "+c+"  ");//5//6
//else if (c > 1000 && c < 10000)
//	System.out.print(" "+c+" ");//6
//else if (c > 10000 && c < 100000)
//	System.out.print(c + " ");//6
////if (c < 100)
////	System.out.print(c + "  ");
////if (c > 100)
//else

//package com.example;
//
//import java.util.Scanner;
//
///**
// * Hello world!
// *
// */
//public class App {
//	public static void main(String[] args) {
//
//		int n;
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
////          sc.close();
//		int half = n / 2;
//		long[] values = new long[n * n]; // space O(N) used
//		values[0] = 0;
//		values[1] = 1;
//		long a = 0, b = 1, c = a + b;
//		for (int i = 2; i < n * n; i++)
//			values[i] = values[i - 1] + values[i - 2]; // single traversal O(N)
////         
//		// to get last number in fibonacci series
//		int any = n * half + half + 1;
//		System.out.print(any);
//String padded = String.format("%-20s", str);
//		System.out.println("The nth fibonacci number is " + values[any]);
//		int count = 0;
//		while (values[any] != 0) {
//			values[any] = values[any] / 10;
//			count++;
//		}
//		System.out.println("fibonacci number total digits are " + count);
//		int noOfSpaces = count;
//
//		int noOfColumns = 1;
//		for (int i = 1; i <= n + 1; i++) {
//			for (int j = 1; j <= noOfSpaces; j++) {
//				System.out.print("\t");
//			}
//			if (i < (n / 2) + 1) {
//				noOfSpaces=noOfSpaces-2;
//			} else
//				noOfSpaces=noOfSpaces+2;
//			for (int j = 1; j <= noOfColumns; j++) {
//				String spaces = String.format("%6s", " ");
//				System.out.print(c+spaces);
//
//				c = a + b;
//				a = b;
//				b = c;
//
//			}
//
////			System.out.println();
//			System.out.println();
//			if (i < (n / 2) + 1)
//				noOfColumns = noOfColumns + 2;
//			else
//				noOfColumns = noOfColumns - 2;
//
//		}
//	}
//}
//
////
////for(int j=1;j<=noOfColumns;j++) {
////		if(c>0 && c<1000000)
////			System.out.print(c+"	");
////		else if(c>1000000 && c < 100000000)
////			System.out.print(""+c+" ");
////		else{
////			System.out.print(c+"_");
////		}
////		c=a+b;
////		a=b;
////		b=c;
////	}
//
////    	Scanner sc=new Scanner(System.in);
////    	System.out.print("Enter a number : ");
////    	Integer num = sc.nextInt();
////    	
////    	long[] c = new long[num];
////    	c[0]=0;
////    	c[1]=1;
////    	for(int i=2;i<num;i++) {
////    		System.out.println(c[i]);
////    		c[i]=c[i-1]+c[i-2];
////    			
////    	}
////    	int half = num/2;
////    	int noOfSpaces=num/2+1;              
//
////if(c>0 && c<10)
////	System.out.print(c+"         ");
////else if(c>10 && c<100)
////	System.out.print(c+"          ");
////else if(c>100 && c<1000)
////	System.out.print(c+"         ");
////else if(c>1000 && c<10000)
////	System.out.print(c+"        ");
////else if(c>10000 && c<100000)
////	System.out.print(c+"       ");
////else if(c>100000 && c<1000000)
////	System.out.print(c+"      ");
////else if(c>1000000 && c<10000000)
////	System.out.print(c+"     ");
////else if(c>10000000 && c<10000000)
////	System.out.print(c+"    ");
////else if(c>10000000 && c<100000000)
////	System.out.print(c+"   ");
////else if(c>100000000 && c<1000000000)
////	System.out.print(c+"  ");
//////else if(c>1000000000 && c<10000000000)
////else
////	System.out.print(c+" ");
////	System.out.print("*"+c+" ");
////	else if(c>1000000 && c < 100000000)
////	System.out.print("_"+c);
////else{
////	System.out.print("!"+c);
