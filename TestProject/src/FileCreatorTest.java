
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileCreatorTest {

	public static void main(String[] args) {
		
		FileCreatorTest fct = new FileCreatorTest();
		fct.run();

	}
	
	
	private String dirAddress = "C:\\Users\\yasse\\Dropbox\\MSc Computer Science Birkbeck\\Project Ext\\WebServices\\tonto";
	
	private File dir = new File(dirAddress);
	
	private String destFileName = "bibio.txt";
	
	private File destFile = new File(dirAddress+"//"+destFileName);
	
	public void run(){
		
		System.out.println(dir.exists());
		
		try (	FileWriter fw = new FileWriter(destFile,false);
			 	BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw);) 
		{
			
			out.write("Yasser Alejandro Palacios");
			out.write("mimasone");
			out.write("help me god");
			
		} catch (IOException | NullPointerException ex) {
			ex.printStackTrace();
		}
				
	}

}
