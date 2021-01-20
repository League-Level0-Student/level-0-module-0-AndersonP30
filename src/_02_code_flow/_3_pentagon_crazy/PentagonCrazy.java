package _02_code_flow._3_pentagon_crazy;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class PentagonCrazy {
	
	public static void main(String[] args) {
		
		//  Create a new Robot
Robot rob = new Robot();
rob.miniaturize();
		//  Put the robot's pen down
rob.penDown();
		//  SPEED. Make the robot go at maximum speed (100)
rob.setSpeed(5);
		//  COLOR. Set the pen to a color that you like for the shape
rob.setPenColor(255,0,0);
		//  NUMBER OF SIDES. Make an int variable for the number of sides the shape will have.
		//  				(Hint: its called PentagonCrazy)
int sides = 5;
int angle = 360/sides;
		//  TURN ANGLE. Make another int variable for the angle the robot must turn. 
		//  			Hint: Divide 360 by the number of sides the shape has to get the angle.
int count = 0;
		//  COUNT. Make another int variable to count how many times the loop has repeated
		//         Set its start value to zero.

		//  LOOP. Start a while loop to repeat the DRAW, TURN, and INCREASE COUNT code 200 times. 
		while (count<200) {
			rob.move(count);
			rob.turn(360/sides + 1);
			count += 1;
		}
				//  DRAW.  Make the robot move the amount in your count variable
		
				//  TURN.  Turn the robot the amount in your angle variable + 1

				//  INCREASE COUNT. Increase the count by 1
		
		//  End the while loop here

		//  Now hide the robot so you can see the pattern it has drawn.
		
		//  Run the program. 
		//  Check the pattern against the picture in the recipe. If it matches, you are done!
	

	
	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	}
}
