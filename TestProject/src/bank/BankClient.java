package bank;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class BankClient {
	
	public static void main (String [] args) throws IOException {
		
		final int SBAP_PORT = 8888;
		
		Socket socket = new Socket("localhost",SBAP_PORT);
		InputStream inputStream = socket.getInputStream();
		OutputStream outputStream = socket.getOutputStream();
		Scanner scanner = new Scanner(inputStream);
		PrintWriter printWriter = new PrintWriter(outputStream);
		
		String command = "DEPOSIT 3 1000\n";
		System.out.println("Sending " +command);
		printWriter.print(command);
		printWriter.flush();
		String response = scanner.nextLine();
		System.out.println("Receiving " +response);
		
		socket.close();
		
	}

}
