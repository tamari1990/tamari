import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class problem12 extends GraphicsProgram{
	
	
	 private static final double HOUSE_WIDTH = 300;
	 private static final double HOUSE_HEIGHT = 350;
	 private static final double DOOR_WIDTH = 80;
	 private static final double DOOR_HEIGHT = 100;
	 private static final double WINDOW_WIDTH = 50;
	 private static final double WINDOW_HEIGHT =90;
	 private static final double ROOF_HEIGHT = 40;
	 
	 public void run (){
		 buildHouse();
	 
}

	private void buildHouse() {
		buildWalls();
	    buildDoor();
		buildWindows();
		buildRoof();
		
	}

	private void buildWindows() {
		int x = (int) (getWidth()/2 + HOUSE_WIDTH/4 );
		double y = getHeight() - HOUSE_HEIGHT + 30;
		GRect window = new GRect (WINDOW_WIDTH, WINDOW_HEIGHT);
		add(window, x, y);
		
	}

	private void buildRoof() {
		double x1 = getWidth()/2 - HOUSE_WIDTH/2;
		double y1 = (getHeight() - HOUSE_HEIGHT);
		double x2 = x1 + HOUSE_WIDTH/2;
		double y2 = y1 - ROOF_HEIGHT;
		GLine firstHalfOfTheRoof = new GLine (x1, y1, x2, y2);
		add (firstHalfOfTheRoof);
		double x3 = x1 + HOUSE_WIDTH;
		
		GLine secondHalfOfTheRoof = new GLine (x2, y2, x3, y1);
		add(secondHalfOfTheRoof);
	}

	private void buildDoor() {
		GRect door = new GRect (DOOR_WIDTH, DOOR_HEIGHT);
		int x = (int) (getWidth()/2 - DOOR_WIDTH/2);
		double y = (getHeight() - DOOR_HEIGHT);
		add (door, x, y);
		
	}

	private void buildWalls() {
		GRect wall = new GRect (HOUSE_WIDTH, HOUSE_HEIGHT);
		int x = (int) (getWidth()/2 - HOUSE_WIDTH/2);
		double y = (getHeight() - HOUSE_HEIGHT);
		add(wall, x, y);
		
	}
}