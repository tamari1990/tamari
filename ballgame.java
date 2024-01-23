import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class ballgame extends GraphicsProgram {

	private RandomGenerator rgen = new RandomGenerator();
	private static final int BALL_SIZE = 20;
	private int DELAY = 20;
	private GOval ball;
	private JTextField xVelocity;
	private JTextField yVelocity;
	private int vx;
	private int vy;

	public void init() {
		xVelocity = new JTextField(10);
		yVelocity = new JTextField(10);
		add(xVelocity, SOUTH);
		add(yVelocity, SOUTH);
		addActionListeners();
		xVelocity.addActionListener(this);
		yVelocity.addActionListener(this);
	}

	public void run() {
		ball = new GOval(BALL_SIZE * 2, BALL_SIZE * 2);
		ball.setFilled(true);
		add(ball, getWidth() / 2 - BALL_SIZE, getHeight() / 2 - BALL_SIZE);
		vx = rgen.nextInt(10);
		vy = rgen.nextInt(10);
		while (true) {
			ball.move(vx, vy);
			pause(DELAY);

			// Check for collisions with the edges of the window
			if (ball.getX() + 2 * BALL_SIZE >= getWidth() || ball.getX() <= 0) {
				vx = -vx;
			}
			if(ball.getY() + 2 * BALL_SIZE >= getHeight() || ball.getY() <= 0){
				vy = -vy; 
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == xVelocity){
			String v1 = xVelocity.getText();
			vx = Integer.parseInt(v1);
		}
		if(e.getSource() == yVelocity){
			String v2 = yVelocity.getText();
			vy = Integer.parseInt(v2);
		}
	}
}
