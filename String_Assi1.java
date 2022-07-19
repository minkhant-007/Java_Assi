package Assigiment;

public class String_Assi1 {
	public static void main(String[] args) {
		String bio = "NLP techniques are becomeing widely popular scientific researsh areas as"
				+ " well as Information Tegechnology industry.Language technology together with"
				+ "Information Technology can enhance the lives of people with different capabilities.This system implsmemts voice command mobile phone dialer application.";
		int word = bio.split(" ").length;
		
		
		int stance = bio.split("\\.").length;
//		System.out.println(stance);
		
		System.out.println("Word :" + word);
		System.out.println("stance length :" + stance);
	}
}	
