import java.awt.event.ActionEvent;

import javax.swing.JButton;

import acm.program.ConsoleProgram;

public class Buttons extends ConsoleProgram{

	public void init(){
		setFont("Courier-24");
		add(new JButton("HI"), SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e){
		String command = e.getActionCommand();
		if(command.equals("HI")){
			println("hello");
		}
	}
}
