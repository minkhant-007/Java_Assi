package Assigiment;

import java.util.Scanner;

public class Assi_two {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter bed time:");
		int bed  = sc.nextInt();
		System.out.print("Enter up time");
		int up = sc.nextInt();
		int start = 0;
		int end = 0;
		if(bed<12 || bed>up) {
			start = (up+12)-bed;
			System.out.println(start);
			
		}else {
			end = up - bed;
			System.out.println(end);
			
		}
		int total;
		 total = start - end;
		 System.out.println(total);
		if(total>=5 && total <=8) {
			System.out.println("You take care your health well!");
		}
		if(total<5) {
			System.out.println("You are very hardworking:");
		}
		if(total>8){
			System.out.println("Your are abnormal");
		}
			
	}
}
