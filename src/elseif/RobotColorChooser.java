//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Genos = new Robot();
		//3. Ask the user what color they would like the robot to draw
for (int i = 0; i < 5; i++) {
		String color = JOptionPane.showInputDialog("What is your desired color?");
		//5. Use an if/else statement to set the pen color that the user requested
if (color.equals("white")) {
	
}
else {
	boolean colour = color.equals("black");
}


	
} 
for (int i = 0; i < 6; i++) {
Genos.setPenWidth(10);
Genos.penDown();
Genos.setSpeed(100);
Genos.move(200);
Genos.turn(90);
Genos.move(200);
Genos.turn(90);
}




        //6. If the user doesn’t enter anything, choose a random color


        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
