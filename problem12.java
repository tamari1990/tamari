import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class problem12 extends GraphicsProgram{
	
	
	 private static final double HOUSE_WIDTH = 300;
	 private static final double HOUSE_HEIGHT = 350;
	 private static final double DOOR_WIDTH = 80;
	 private static final double DOOR_HEIGHT = 60;
	 private static final double WINDOW_WIDTH = 30;
	 private static final double WINDOW_HEIGHT =50;
	 
	 public void run (){
		 buildHouse();
	 
}

	private void buildHouse() {
		buildWalls();
//	    buildDoor();
//		buildWindows();
//		buildRoof();
		
	}

/*	private void buildWindows() {
		// TODO Auto-generated method stub
		
	}

	private void buildRoof() {
		// TODO Auto-generated method stub
		
	}

	private void buildDoor() {
		// TODO Auto-generated method stub
		
	}
*/
	private void buildWalls() {
		GRect wall = new GRect (HOUSE_WIDTH, HOUSE_HEIGHT);
		int x = (int) (getWidth()/2 - HOUSE_WIDTH/2);
		double y = (getHeight() - HOUSE_HEIGHT);
		add(wall, x, y);
		
	}
}