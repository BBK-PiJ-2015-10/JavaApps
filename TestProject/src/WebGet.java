import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import org.neo4j.cypher.internal.frontend.v2_3.perty.gen.scalaDocGen;


public class WebGet {

	public static void main(String[] args) throws IOException {
	
		
		String host;
		
		String resource;
		
		if (args.length ==2){
			host = args[0];
			resource = args[1];
		}
		else {
			System.out.println("Getting / from linkedin.com");
			host = "linkedin.com";
			resource = "/";
		}
		
		//Open socket
		
		final int HTTP_PORT = 80;
		
		Socket mySocket = new Socket(host,HTTP_PORT);
		
		//Get streams
		
		InputStream instream = mySocket.getInputStream();
		OutputStream outstream = mySocket.getOutputStream();
		
		//Turns streams into scanners and writers
		
		Scanner in = new Scanner(instream);
		PrintWriter out = new PrintWriter(outstream);
		
		//Send command
		
		String command = "GET" + resource + " HTTP/1.1\n"
			+ "Host: " +host +"\n\n";
		out.print(command);
		out.flush();
		
		//Read the server response
		
		while (in.hasNext()){
			String line = in.next();
			System.out.println(line);
		}	
		
		mySocket.close();
		
	}

}
