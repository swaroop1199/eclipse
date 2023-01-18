package javaproject;

import java.util.Scanner;

public class development {

	public static void main(String[] args) {
		
		int sum;
		System.out.println("Enter first number\n");
		Scanner input = new Scanner(System.in);
		int sum1 = input.nextInt();
		System.out.println("Enter second number\n");
		int sum2 = input.nextInt();
		
		
		sum = sum1 + sum2;
		System.out.println(sum);
		
		}
	}


