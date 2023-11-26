import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class ScoreCounter extends GraphicsProgram{
	private static final int BOX_SIZE = 70;
	public void run() {
		drawTheSquare();
	}

	private void drawTheSquare() {
		 GRect square = new GRect(BOX_SIZE, BOX_SIZE);
		 int x = getWidth() / 2 - BOX_SIZE / 2;
		 int y = getHeight() / 2 - BOX_SIZE / 2;
		 add(square, x, y);
		
	}

}
