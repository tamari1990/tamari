import acm.program.ConsoleProgram;

public class problem18 extends ConsoleProgram {
	
	public void run(){
		
	int num1= readInt ("Enter first number:");
	int num2= readInt ("Enter seciond number:");
	if (num1 >= num2) {
		print(num1);
	}
	else {
		print(num2);
	}
}
}