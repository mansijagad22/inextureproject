package com.example;

import java.util.Scanner;
//  1 convert into binary octal and hex
public class App {
	
	public static void conversion(int caseForConversion,int num) {
		int i = 1, convert = 0, rem;
		switch (caseForConversion) {
		case 1:
			
			while (num != 0) {
				rem = num % 2;
				convert += i * rem;
				num = num / 2;
				i = i * 10;
			}
			System.out.println("Binary Number is : " + convert);
			break;

		case 2:
			while(num>0) {
				rem = num%8;
				convert +=  i*rem;
				num = num/8;
				i=i*10;
			}
			System.out.println("Octal Number is : " + convert);
			break;
		case 3:
			char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			String hexadecimal="";
			while(num!=0) {
				rem = num%16;
				hexadecimal = ch[rem]+hexadecimal;
				num = num/16;
			}
			System.out.println("Hex Number is : " + hexadecimal);
			break;
		default:
			System.out.print("enter valid case ");
		}
		
	}
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("enter a number to convert into bin,oct and hex : ");
			Integer num = sc.nextInt();
			System.out.print("enter 1 for binary, 2 for oct and 3 for hex... ");
			System.out.print("enter a case : ");
			Integer caseForConversion = sc.nextInt();
			conversion(caseForConversion,num);	
		}
		catch(Exception e) {
			System.out.print("Enter valid value..");
			
		}
			}
}
