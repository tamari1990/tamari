import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class ballgame extends GraphicsProgram{
	
	private RandomGenerator rgen = new RandomGenerator();
	private static final int BALL_SIZE = 20;
	private int DELAY = 10000;
	private GOval ball;
	public void run(){
		ball = new GOval(BALL_SIZE * 2, BALL_SIZE * 2);
		ball.setFilled(true);
		add(ball, getWidth() / 2 - BALL_SIZE, getHeight() / 2 - BALL_SIZE);
		int vx = rgen.nextInt();
		int vy = rgen.nextInt();
		ball.move(vx, vy);
		pause(DELAY);
	}

}
