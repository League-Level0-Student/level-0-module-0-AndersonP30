package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
 String code = JOptionPane.showInputDialog("What is the color of the sky?");
 if (code.equalsIgnoreCase("blue")){
		JOptionPane.showMessageDialog(null, "Correct!");
		score += 1;
 }
 else 
	 score -= 1;
				// 2.  Ask the user a question 
String q2 = JOptionPane.showInputDialog("How many letters are in the alphabet?");
				// 3.  Use an if statement to check if their answer is correct
// || means or
if (q2.equalsIgnoreCase("twenty six")|| q2.equalsIgnoreCase("26")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 1;
}
else 
	 score -= 1;
JOptionPane.showMessageDialog(null, "Your final score was " + score + "!");
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
