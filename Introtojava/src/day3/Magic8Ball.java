package day3;




	// Copyright Wintriss Technical Schools 2013
	import java.util.Random;

import javax.swing.JOptionPane;
	public class Magic8Ball {
public static void main(String[] args) {


		// 1. Make a main method that includes all the steps below….

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
				int number = new Random().nextInt(4);
		// 3. Print out this variable
				System.out.print(number);
		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Ask Me A Question Below...");
		// 5. If the random number is 0
				if(number==0){
		// -- tell the user "Yes"
				speak("yes");}
		// 6. If the random number is 1
					if(number==1){
		// -- tell the user "No"
						speak("no");}
		// 7. If the random number is 2
					if(number==1){
		// -- tell the user "Maybe you should ask Google?"
						speak("Maybe you should ask google?");}
		// 8. If the random number is 3
					if(number==3){
		// -- write your own answer
}					speak("write your own answer");}
				static void speak(String words) {
					try {
						Runtime.getRuntime().exec("say " + words).waitFor();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}


	}






