import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class Main {
    public static void main (String args [])throws IOException {
        Love_Letter app = new Love_Letter ();//call game code
        app.addWindowListener (   //add window
                new WindowAdapter()  {
                    public void windowClosing (WindowEvent e){//close window when top close button is pressed
                        System.exit (0);  //exits and closes window
                    }
                }
        );
    }
}