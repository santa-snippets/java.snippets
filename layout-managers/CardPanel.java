import java.awt.*;
import java.net.*;

/** A Panel that displays a playing card. This window does
 *  <B>not</B> use CardLayout. Rather, instances of CardPanel
 *  are contained in another window used in the CardDemo
 *  example. It is this enclosing window that uses CardLayout
 *  to manipulate which CardPanel it shows.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class CardPanel extends Panel {
  private Label name;
  private ImageLabel picture;

  public CardPanel(String cardName,
                   URL directory, String imageFile) {
    setLayout(new BorderLayout());
    name = new Label(cardName, Label.CENTER);
    name.setFont(new Font("SanSerif", Font.BOLD, 50));
    add(name, BorderLayout.NORTH);
    picture = new ImageLabel(directory, imageFile);
    Panel picturePanel = new Panel();
    picturePanel.add(picture);
    add(picturePanel, BorderLayout.CENTER);
    setSize(getPreferredSize());
  }

  public Label getLabel() {
    return(name);
  }

  public ImageLabel getImageLabel() {
    return(picture);
  }
}