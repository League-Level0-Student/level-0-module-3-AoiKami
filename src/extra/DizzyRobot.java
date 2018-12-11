//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
		String Dizzy = JOptionPane.showInputDialog("How dizzy you want the robot from 1-10?");
		if(Dizzy.equalsIgnoreCase("1")) {
			dance(1);
		}else {
			if(Dizzy.equalsIgnoreCase("2")) {
			dance(2);
		}else {
			if(Dizzy.equalsIgnoreCase("3")) {
							dance(3);
		}else {
				if(Dizzy.equalsIgnoreCase("4")) {
					dance(4);
				}else {
					if(Dizzy.equalsIgnoreCase("5")) {
						dance(5);
					}else {
						if(Dizzy.equalsIgnoreCase("6")) {
							dance(6);
						}else {
							if(Dizzy.equalsIgnoreCase("7")) {
								dance(7);
							}else {
								if(Dizzy.equalsIgnoreCase("8")) {
									dance(8);
								}else {
									if(Dizzy.equalsIgnoreCase("9")) {
										dance(9);
									}else {
										if(Dizzy.equalsIgnoreCase("10")) {
											dance(10);
			}
				
		}}}}}}}}}
		
 // 1. Use the dance method to make the robot spin.
	

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

