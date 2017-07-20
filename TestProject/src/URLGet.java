import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLGet {

	public static void main(String[] args) throws IOException {
	
		String urlString;
		if (args.length==1){
			urlString=args[0];
		}
		else {
			urlString="http://www.google.com";
			System.out.println("Using : " +urlString);
		}
		
		//Open Connection
		
		URL url = new URL(urlString);
		URLConnection urlConnection = url.openConnection();
		
		
		//Check if response code is HTTP_OK (200)
		
		HttpURLConnection httpConnection = (HttpURLConnection) urlConnection;
		int code = httpConnection.getResponseCode();
		String message = httpConnection.getResponseMessage();
		System.out.println("I have received " + code +" " +message);
		if (code != HttpURLConnection.HTTP_OK) return;
		
		//Read server response
		InputStream inputStream = urlConnection.getInputStream();
		Scanner scanner = new Scanner(inputStream);
		
		while (scanner.hasNext()){
			String line = scanner.nextLine();
			System.out.println(line);
		}
		
		
	}

}
