package com.example.Exception;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
 
    	
    	/// 1
//        try {
//        	int a=10/0;
//        	int b[] = new int[5];
//        	b[5]=7;
//        	
//        }
//        catch(Exception e) {
//        	System.out.println( "Exception occured..." );
//        }
//        catch(ArrayIndexOutOfBoundException e) {
//        	System.out.println( "ArrayIndexOutOfBoundException occured..." );
//        }
    	
    	/// 2
    	
//    static int show() {
//    	try {
//    		System.out.print("Hello\n");
//    		return 10/2;
//    		
//    	}
////    	catch(Exception e) {
////    		return 5/2;
////    	}
//    	finally 
//    	{
//    		return 4/2;
//    	}
////    	  return 9/2;  // here i got un reachable code
////    	System.out.print("Hello"); // here i got un reachable code
//    	
//  // try and finally we can do and finally will be executed in that case
//    }
    	
    public static void main( String[] args )
    {
    	
    	   Scanner sc =new Scanner(System.in);
    	    String s1 = sc.next();
    	    String s2 = sc.nextLine();
    	    String s3 = sc.nextLine();
    	    System.out.println(s1);
    	    System.out.println(s2);
    	    System.out.println(s3);
    	    
//    	String s1 = "Hello";
//    	String s2 = "Hello";
//    	String s3 = new String();
//    	if(s1==s3) {
//    		System.out.print("true");
//    	}
//    	else {
//    		System.out.print("fail");
//    	}
    	
//    	try {
//			int b = show();
//			System.out.println(b);
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }
}
