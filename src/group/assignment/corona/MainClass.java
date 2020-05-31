package group.assignment.corona;

import javax.swing.JFrame;

public class MainClass {

	/*
	 * ******************************************************************
	 ***Created at 31/5/2020
	 *
	 * This is where the program will start.
	 * It start by calling the Movement GUI JFrame class
	 * 
	 * ********************************************************************
	 */
	
	public static void main(String[] args) {
		
		MovementSimulatorFrame object = new MovementSimulatorFrame();
		object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		object.setSize(677,713);
		object.setVisible(true);
		object.setLocationRelativeTo(null);
		
	}
	
}
