package bank;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class BankService implements Runnable {
	
	private Socket socket;
	
	private Scanner scanner;
	
	private PrintWriter printWriter;
	
	private Bank bank;
	
	public BankService(Socket aSocket, Bank aBank){
		socket = aSocket;
		bank = aBank;
	}
	
	public void run() {
		try {
			try {
				scanner = new Scanner(socket.getInputStream());
				printWriter = new PrintWriter(socket.getOutputStream());
				doService();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			finally {
				socket.close();
			}
		} catch(IOException ex){
			ex.printStackTrace();
		}
		
	}
	
	public void doService() throws IOException, InterruptedException {
		while (true){
			if (!scanner.hasNext()) return;
			String command = scanner.next();
			if (command.equals("QUIT")) return;
			else executeCommand(command);
		}
	}
	
	public void executeCommand(String command) throws InterruptedException{
		int account = scanner.nextInt();
		if (command.equals("DEPOSIT")){
			double amount = scanner.nextDouble();
			bank.deposit(account,amount);
		}
		else if (command.equals("WITHDRAW")){
			double amount = scanner.nextDouble();
			bank.withdraw(account,amount);
		}
		else if (command.equals("BALANCE")){
			printWriter.println("Invalid command");
			printWriter.flush();
			return;
		}
		printWriter.print(account +" " +bank.getBalance(account));
		printWriter.flush();
	}

}
