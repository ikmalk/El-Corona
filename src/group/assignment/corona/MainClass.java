package group.assignment.corona;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		
		MovementSimulatorFrame object = new MovementSimulatorFrame();
		object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		object.setSize(677,713);
		object.setVisible(true);
		object.setLocationRelativeTo(null);
		
	}
	
}
