import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class problem12 extends GraphicsProgram{
	
	
	 private static final double HOUSE_WIDTH = 300;
	 private static final double HOUSE_HEIGHT = 350;
	 private static final double DOOR_WIDTH = 80;
	 private static final double DOOR_HEIGHT = 100;
	 private static final double WINDOW_WIDTH = 30;
	 private static final double WINDOW_HEIGHT =50;
	 
	 public void run (){
		 buildHouse();
	 
}

	private void buildHouse() {
		buildWalls();
	    buildDoor();
//		buildWindows();
		buildRoof();
		
	}

//	private void buildWindows() {
		// TODO Auto-generated method stub
		
//	}

	private void buildRoof() {
		
		
	}

	private void buildDoor() {
		GRect door = new GRect (DOOR_WIDTH, DOOR_HEIGHT);
		int x1 = (int) (getWidth()/2 - DOOR_WIDTH/2);
		double y1 = (getHeight() - DOOR_HEIGHT);
		add (door, x1, y1);
		
	}

	private void buildWalls() {
		GRect wall = new GRect (HOUSE_WIDTH, HOUSE_HEIGHT);
		int x = (int) (getWidth()/2 - HOUSE_WIDTH/2);
		double y = (getHeight() - HOUSE_HEIGHT);
		add(wall, x, y);
		
	}
}