package com.cubic.assessmentTest;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
       
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the elements you want in array:");
		int a=scan.nextInt();
		
		int num[]= new int[a];
		System.out.println("Enter all numbers:");
		
		
		for(int i=0;i<a;i++){
			
		  num[i]= scan.nextInt();
		  
			
		}
		
		int temp;
		for(int i=0;i<=a/2;i++){
			temp = num[i];
			
			num[i]=num[(a-1)-i];
			num[(a-1)-i]=temp;
			
			
			}
		
		for(int i=0;i<a;i++){
			
			System.out.println(num[i]);
				
			}
		
		


	}
}
