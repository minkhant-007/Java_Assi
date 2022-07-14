package Assigiment;

import java.util.Scanner;

public class Assi_one {
	public static void main(String[] args) {
		int zero = 0;
		int positive = 0;
		int negative = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("How many numbers you wants to types :");
		int  num1 = sc.nextInt();
		
		for(var i = 0; i< num1; i++) {
			System.out.print("Enter any number:");
			int num2 = sc.nextInt();
			
			if( num2 ==0 ) {
				zero++;
			}
			if( num2 > 0) {
				positive++;
			}
			if(num2 < 0) {
				negative++;
			}
		}
		System.out.println("Number of Zero :" + zero);
		System.out.println("Number of Positeve :" + positive);
		System.out.println("Number of Negative :" + negative);
		
	}
}
