import java.util.Scanner;
import java.net.URL;
import java.net.MalformedURLException;

public class TextNote {

	public static void main(String[] args) {
	
	Scanner ref=new Scanner(System.in);
	
	String TextNote;
	
	
	System.out.println("Please enter your note:");
	
	TextNote = ref.nextLine();
	
	
    // separete input by spaces ( URLs don't have spaces )
    String [] parts = TextNote.split("\\s");

    // Attempt to convert each item into an URL. To check for URL 
    for( String item : parts ) try {
        URL url = new URL(item);
        System.out.print("(PLEASE REMOVE)" + url + "(PLEASE REMOVE");
          
	//if url is not present
    }catch (MalformedURLException e) {
	
	System.out.println("TextNote has been saved as: " + TextNote);
	
	
		
    }
	}
}
