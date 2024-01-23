import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class ballgame extends GraphicsProgram{
	
	private static final int BALL_SIZE = 50;
	private GOval ball;
	public void run(){
		ball = new GOval(BALL_SIZE * 2, BALL_SIZE * 2);
		add(ball, getWidth() / 2 - BALL_SIZE, getHeight() / 2 - BALL_SIZE);
	}

}
