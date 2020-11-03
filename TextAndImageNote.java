import java.util.Scanner;
import java.net.URL;
import java.net.MalformedURLException;

public class TextAndImageNote {

	public static void main(String[] args) {
	
	Scanner ref=new Scanner(System.in);
	
	String TextNote;
	
	
	System.out.println("Please enter your note and image URL :");
	
	TextNote = ref.nextLine();

	System.out.println("TextAndImageNote has been saved as: " + TextNote);
	}
}