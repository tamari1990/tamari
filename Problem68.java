import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Problem68 extends GraphicsProgram{
	
	private JTextField textField;
	private JButton button;
	public void init(){
		textField = new JTextField(20);
		add(textField, SOUTH);
		button = new JButton("Enter");
		add(button, SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e){
		println("here");
		if(e.getSource() == textField || e.getSource() == button){
			String text = textField.getText();
			println(text);
			if(text == null || text.equals("")){
				return;
			}
			int x = 40;
			int y = 40;
			add(new GLabel(text), x, y);
			y += 40;
			textField.setText("");
		}
	}

}
