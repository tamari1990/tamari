import java.awt.event.ActionEvent;

import javax.swing.JButton;

import acm.program.ConsoleProgram;

public class Buttons extends ConsoleProgram{

	private JButton button;
	public void init(){
		setFont("Courier-24");
		button = new JButton("HI");
		add(button, SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e){
		String command = e.getActionCommand();
		//if(command.equals("HI")){
			//println("hello");
		//}
		if(e.getSource() == button){
			println("hello");
		}
	}
}
