import acm.program.ConsoleProgram;

public class IPadress extends ConsoleProgram{
	
	public void run(){
		String address = readLine("enter IP address");
		address = replaceDots(address);
		println(address);
	}

	private String replaceDots(String address) {
		String address2 = address.replace(".", "[.]");
		return address2;
	}

}
