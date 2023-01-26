package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class development {

	public static void main(String[] args) {
	
		int deposit=0,sum;
		int current =1000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		deposit = sc.nextInt();
		try {
			if (deposit<0) {
				throw new AmountException();	
			}else{
				sum = deposit + current;
				System.out.println("Total Amount is: "+sum);	
			}
			
		} catch(Exception e) {
				System.out.println(e);
		}
		
	}
	}



