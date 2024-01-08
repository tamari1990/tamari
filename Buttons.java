import java.awt.event.ActionEvent;

import javax.swing.JButton;

import acm.program.ConsoleProgram;

public class Buttons extends ConsoleProgram{

	public void init(){
		JButton button = new JButton ("HI");
		add(button, SOUTH);
		addActionListeners();
	}
	
	public void ActionPerformed(ActionEvent e){
		String command = e.getActionCommand();
		if(command.equals("HI")){
			println("hello");
		}
	}
}
