import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class problem13 extends GraphicsProgram {
	public void run () {
		
		double y = getHeight()/2 ;
		double x = getWidth();
		GLine horizontalLine = new GLine (0, y, x, y);
		add (horizontalLine);
	}

}
