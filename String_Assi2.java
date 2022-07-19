package Assigiment;

import java.util.Scanner;

public class String_Assi2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Can you write a stance? ");
		String output = sc.nextLine();
		
		if(output.contains("?")) {
			if(output.contains("Do")) {
				System.out.println("You write a question stance and this stance is simple tense, Thank you");
			}else {
				System.out.println("You write a question stance ,Thank you");
			}
		}else {
			System.out.println("You write a simple stance");
		}
	}
}
