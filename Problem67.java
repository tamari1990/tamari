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
		myTextField.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String photoAdress = e.getActionCommand();
		try{
			GImage image = new GImage(photoAdress);
			double x = getWidth()/ 2 - image.getWidth() / 2;
			double y = getHeight()/ 2 - image.getHeight() / 2;
			add(image, x, y);
		}catch(Exception ex){
			add(new GLabel("Invalid adress"), 20, 20);
			removeAll();
		}
		myTextField.setText("");
	}

}
