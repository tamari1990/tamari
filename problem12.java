import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class problem12 extends GraphicsProgram{
	
	
	 private static final double HOUSE_WIDTH = 300;
	 private static final double HOUSE_HEIGHT = 350;
	 private static final double DOOR_WIDTH = 80;
	 private static final double DOOR_HEIGHT = 140;
	 private static final double WINDOW_WIDTH = 50;
	 private static final double WINDOW_HEIGHT =90;
	 private static final double ROOF_HEIGHT = 60;
	 
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
		buildLeftWindow();
		buildRightWindow();
		int x = (int) (getWidth()/2 + HOUSE_WIDTH/4 );
		double y = getHeight() - HOUSE_HEIGHT + 30;
		GRect window1 = new GRect (WINDOW_WIDTH, WINDOW_HEIGHT);
		add(window1, x, y);
		
	}

	private void buildRightWindow() {
		int x = (int) (getWidth()/2 + HOUSE_WIDTH/4 );
		double y = getHeight() - HOUSE_HEIGHT + 30;
		GRect rightWindow = new GRect (WINDOW_WIDTH, WINDOW_HEIGHT);
		add(rightWindow, x, y);
		
	}

	private void buildLeftWindow() {
		int x = (int) (getWidth()/2 - HOUSE_WIDTH*3/8);
		double y = getHeight() - HOUSE_HEIGHT + 30;
		GRect leftWindow = new GRect (WINDOW_WIDTH, WINDOW_HEIGHT);
		add(leftWindow, x, y);
		
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