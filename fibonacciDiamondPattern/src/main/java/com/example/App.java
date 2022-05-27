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
	        long a = 0, b = 1, c = a + b;
	        Integer n = sc.nextInt();	
	        int mid = n/2;
	        int num = 1;   
	        for (int i = mid; i > 0; i--)
	        {
	            for (int j = 1; j <= i/2; j++)
	            {
	                System.out.print("	");
	            }
	  
	            for (int j = 1; j <= num; j++)
	            {
//	            	if(c<10)
	            		System.out.print(c+"	");
//	            	else if(c>10 && c<100)
//	            		System.out.print(c+"     ");
//	            	else if(c>100 && c<1000)
//	            		System.out.print(c+"    ");
//	            	else if(c>1000 && c<10000){
//	            		System.out.print(c+"   ");
//	            	}
//	            	else if(c>10000 && c<100000)
//	            		System.out.print(c+"  ");
//	            	else
//	            		System.out.print(c+" ");
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
	            {
	            	if(c<10)
	            		System.out.print(c+"      ");
	            	else if(c>10 && c<100)
	            		System.out.print(c+"     ");
	            	else if(c>100 && c<1000)
	            		System.out.print(c+"    ");
	            	else if(c>1000 && c<10000){
	            		System.out.print(c+"   ");
	            	}
	            	else if(c>10000 && c<100000)
	            		System.out.print(c+"  ");
	            	else
	            		System.out.print(c+" ");
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

//		 Scanner sc = new Scanner(System.in);
//		    
//	        System.out.println("Enter number");
//	        int a = 0, b = 1, c = a + b;
//	        Integer n = sc.nextInt();	
//	        int mid = n/2;
//	        int num = 1;   
//	        for (int i = mid; i > 0; i--)
//	        {
//	            for (int j = 1; j <= i; j++)
//	            {
//	                System.out.print("	");
//	            }
//	            for (int j = 1; j <= num; j++)
//	            {
////	            	if(c<10)
////	            		System.out.print("   "+c+"   ");
////	            	else if(c>10 && c<100)
////	            		System.out.print("  "+c+"   ");
////	            	else if(c>100 && c<1000)
////	            		System.out.print(" "+c+" ");
////	            	else if(c>1000 && c<10000){
////	            		System.out.print(" "+c+"  ");
////	            	}
////	            	else if(c>10000 && c<100000)
////	            		System.out.print(c+"  ");
////	            	else
//	            		System.out.print(c+"	");
//	                c=a+b;
//	                a=b;
//	                b=c;
//	            }
//	  
//	            System.out.println();
//	            num++;
//	        }
//	         
//	       for (int i = 0; i <= mid; i++) 
//	        {
//	           
//	             
//	            for (int j = 1; j <= i; j++) 
//	            {
//	                System.out.print("	");
//	            }
//	             
//	          	             
//	            for (int j = num; j > 0; j--) 
//	            {
////	            	if(c<10)
////	            		System.out.print("   "+c+"   ");
////	            	else if(c>10 && c<100)
////	            		System.out.print("  "+c+"   ");
////	            	else if(c>100 && c<1000)
////	            		System.out.print(" "+c+" ");
////	            	else if(c>1000 && c<10000){
////	            		System.out.print(" "+c+"  ");
////	            	}
////	            	else if(c>10000 && c<100000)
////	            		System.out.print(" "+c+" ");
////	            	else
//	            		System.out.print(c+"	");
//	                c=a+b;
//	                a=b;
//	                b=c;
//	            }
//	             
//	            System.out.println();
//	             
//	            num--;
//	        }
////		int n, i, j, k = 1;
////		int a = 0, b = 1, c = a + b;
////		System.out.print("Enter the number : ");
////		Scanner s = new Scanner(System.in);
////		n = s.nextInt();
////		k = n - 1;
////		for (j = 1; j <= n; j++) {
////			for (i = 1; i <= k*2; i++) {
////				System.out.print("   ");
////			}
////			k--;
////			for (i = 1; i <= 2 * j - 1; i++) {
////
////					System.out.print(c+"	");
////				c = a + b;
////				a = b;
////				b = c;
////			}
////			System.out.println();
////		}
////		k = 1;
////		for (j = 1; j <= n - 1; j++) {
////			for (i = 1; i <= k*2; i++) {
////				System.out.print("   ");
////			}
////			k++;
////			for (i = 1; i <= 2 * (n - j) - 1; i++) {			
////					System.out.print(c+"	");//7//6
//////					
//////				else if(c > 10 && c < 100)
//////					System.out.print(c+" ");//6
//////				else if (c > 100 && c < 1000)
//////					System.out.print(" "+c+"  ");//5//6
//////				else if (c > 1000 && c < 10000)
//////					System.out.print(" "+c+" ");//6
//////				else if (c > 10000 && c < 100000)
//////					System.out.print(c + " ");//6
////////				if (c < 100)
////////					System.out.print(c + "  ");
////////				if (c > 100)
//////				else
//////					System.out.print(c + " ");
//////				if (c > 1000 && c < 10000)
//////					System.out.print(c + " ");
//////				if (c > 10000 && c < 100000)
//////					System.out.print(c + " ");
////////				if (c > 100000 && c < 1000000)
////////					System.out.print(c + "   ");
//////				if (c > 1000000)
//////				else
//////					System.out.print(c + " ");
////
////				c = a + b;
////				a = b;
////				b = c;
////			}
////			System.out.println();
////		}

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
