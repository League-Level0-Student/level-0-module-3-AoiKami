package MethodWriting;

import org.jointheleague.graphical.robot.Robot;

public class ObidientRobot {
	public static void main(String[] args) {
		Robot Billy  = new Robot();
			Billy.setSpeed(500);
			Billy.setPenWidth(10);
			Billy.penDown();
			
			for (int i = 0; i < 5; i++) {
				Billy.move(100);
				Billy.turn(90);				
			}
			
			for (int i = 0; i < 4; i++) {
				Billy.turn(-90);
				Billy.move(100);
				
				
				
			}
			
	}

}
