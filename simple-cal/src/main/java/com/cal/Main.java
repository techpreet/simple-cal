package com.cal;
import java.util.Scanner;
public class Main {
		public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter First Number");
		Double n1=sc.nextDouble();
		System.out.println("Enter Second Number");
		Double n2=sc.nextDouble();
		

		System.out.println(" Please Select the operator : +,-,*, or /");
		char op=sc.next().charAt(0);
		 
		switch(op) {
			case '+':
				System.out.println("Addition of numbers is "+(n1+n2));
				break;
			case '-':
				System.out.println("Subtraction of numbers is "+(n1-n2));
				break;
		
			case '*':
				System.out.println("Multiplication of numbers is "+(n1*n2));
				break;
			case '/':
				
				if(n2==0) { 
					System.out.println("Please Enter Valid Denominator Value");
					break;
				}
				else {
				System.out.println("Division of numbers is "+(n1/n2));
				break;
				}
		}
		sc.close();
		
		}
}
