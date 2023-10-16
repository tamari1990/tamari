import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class problem12 extends GraphicsProgram{
	
	public void run (){
	drawWalls();
	drawTheDoorAndTheDoorKnob();
	drawWindows();
	/*
	
    GRect window = new GRect (30, 60);
    add(window, 300, 310);
    GRect theOtherWindow = new GRect (30, 60);
    add(theOtherWindow, 390,310);
   */}

	private void drawWindows() {
		
		
	}

	private void drawTheDoorAndTheDoorKnob() {
		GRect door = new GRect (40, 80);
		add(door, 230, 400);
	    GOval doorknob = new GOval (5,10);
	    add(doorknob, 240,430);
		
	}

	private void drawWalls() {
		GRect walls = new GRect (300, 180);
		add(walls, 200, 300);
		
	}
}