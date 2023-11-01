import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Hierarchy1stRect extends GraphicsProgram{
	private static final double rectLength = 80;
	private static final double rectHeight = 20;
	public void run(){
		double x = (getWidth() / 2 - rectLength / 2);
		double y = getHeight() / 6;
		GRect aboveRect = new GRect (rectLength, rectHeight, x, y);
		add(aboveRect);
		
	}
}
