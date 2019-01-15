import java.awt.*;
import javax.swing.*;

/** This illustrates the effect of specifying 0 for the number
 *  of columns. The number of rows is read from the command line
 *  (default 2), and the column number is chosen by the system
 *  to get as even a layout as possible.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ElevenButtons extends JPanel {
  public ElevenButtons(int numRows) {
    setLayout(new GridLayout(numRows, 0));
    for(int i=0; i<11; i++) {
      add(new JButton("Button " + i));
    }
  }

  public static void main(String[] args) {
    int numRows = 2;
    if (args.length > 0) {
      numRows = Integer.parseInt(args[0]);
    }
    String title = "11 Buttons using GridLayout(" +
                   numRows + ",0).";
    //WindowUtilities.setNativeLookAndFeel();
    WindowUtilities.openInJFrame(new ElevenButtons(numRows),
                                 550, 200, title);
  }
}