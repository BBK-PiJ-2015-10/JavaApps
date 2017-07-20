package bank;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BankServer {
	
	public static void main (String[] args) throws IOException {
		
		final int ACCOUNT_LENGTH = 10;
		Bank bank = new Bank(ACCOUNT_LENGTH);
		final int SBAP_PORT = 8888;
		ServerSocket server = new ServerSocket(SBAP_PORT);
		
		System.out.println("I am about to run");
		
		while (true){
			Socket socket = server.accept();
			System.out.println("Client connected.");
			BankService service = new BankService(socket,bank);
			Thread t = new Thread(service);
			t.start();
		}
		
		
		
	}

}
