package com.java;

import java.util.Scanner;

public class JavaFlowDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.print("enter the length : ");
//		int length=input.nextInt();
//		System.out.print("enter the width : ");
//		int width=input.nextInt();
//		if(length==width) {
//			System.out.println("It is Square");
//		}
//		else {
//			System.out.println("It is rectangle");
//		}
//		input.close();

//		===============================================
		
//		System.out.print("enter the side 1 : ");
//		int s1=input.nextInt();
//		System.out.print("enter the side 2 : ");
//		int s2=input.nextInt();
//		System.out.print("enter the side 3 : ");
//		int s3=input.nextInt();
//		if(s1==s2 && s2==s3) {
//			System.out.println("it is equilateral triangle");
//		}
//		else if(s1==s2 || s2==s3 || s1==s3) {
//			System.out.println("It is scalene Triangle");
//		}
//		else {
//			if(s3*s3==(s1*s1)+(s2*s2) || s1*s1==(s3*s3)+(s2*s2) ||s2*s2==(s1*s1)+(s3*s3)) {
//				System.out.println("it is rightangle triangle");
//			}
//			else {
//				System.out.println("it is scalene triangle");
//			}
//		}
//		input.close();
		
//		====================switch==============================

//		System.out.println("enter the month in number");
//		int mon=input.nextInt();
//		switch(mon) {
//		case 1:System.out.println("jan");break;
//		case 2:System.out.println("feb");break;
//		case 3:System.out.println("mar");break;
//		case 4:System.out.println("apr");break;
//		case 5:System.out.println("may");break;
//		case 6:System.out.println("jun");break;
//		case 7:System.out.println("july");break;
//		case 8:System.out.println("ags");break;
//		case 9:System.out.println("sep");break;
//		case 10:System.out.println("oct");break;
//		case 11:System.out.println("nov");break;
//		case 12:System.out.println("des");break;
//		default : System.out.println("pls enter the correct number");
//		}
//		=======================for loop==============================
		
//		int result = 0;
//		for (int i = 0; i <= 100; i++) {
//			result += i;
//		}
//		System.out.println(result);
		
//		System.out.print("enter the fact number : ");
//		int fn=input.nextInt();
//		int fact=1;
//		for(int i=1;i<=fn;i++) {
//			fact *= i;
//		}
//		System.out.println("the fact of "+fn+" is : "+fact);
		
//		int[] arr= {10,20,30,40,50,60};
//		int sum=0;
//		for(int num:arr) {
//			sum +=num;
//		}
//		System.out.println("the sum of array is : "+sum);
		
		int guess=7;
		int points=0;
		for(int i=1;i<=3;i++){
			System.out.print("Enter the "+i+"st number : ");
			int num=input.nextInt();
			if(guess<=num) {
				points+=num;
				continue;
			}
		}
		System.out.println("total points : "+points);
	}
}
