import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class problem12 extends GraphicsProgram{
	
	public void run (){
	
	GRect walls = new GRect (300, 180);
	add(walls, 200, 300);
	GRect door = new GRect (40, 80);
	add(door, 230, 400);
    GOval doorknob = new GOval (5,10);
    add(doorknob, 240,430);
   }
}