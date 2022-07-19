package Assigiment;

import java.util.Scanner;

public class String_Assi3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your NRC number:");
		String nrc = sc.nextLine();
		
		String Towship = nrc.substring(nrc.indexOf("/")+1,nrc.indexOf("("));
		System.out.println( "Your Towship is "+Towship);
		
		String Number = nrc.substring(nrc.indexOf(")")+1);
		System.out.println("Your Number is " + Number);
	}
}
