import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acm.util.ErrorException;

public class Problem67 extends GraphicsProgram{
	
	private JTextField myTextField;
	public void init(){
		myTextField = new JTextField(50);
		add(myTextField, SOUTH);
		myTextField.addActionListener(this);myTextField = new JTextField(20);
		add(myTextField, SOUTH);
		
		myTextField.addActionListener(this);
		addActionListeners();
		
		GImage image = new GImage("bad path");
		double x = getWidth()/ 2 - image.getWidth() / 2;
		double y = getHeight()/ 2 - image.getHeight() / 2;
		add(image, x, y);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == myTextField) {
			try {
				GImage image = new GImage(myTextField.getText());
				double x = getWidth()/ 2 - image.getWidth() / 2;
				double y = getHeight()/ 2 - image.getHeight() / 2;
				add(image, x, y);
			} catch(Exception ex) {
				removeAll();
				add(new GLabel("Error occured"), 20, 20);
			}
			myTextField.setText("");
		}
	}

}
