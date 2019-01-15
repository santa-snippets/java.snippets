import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** An example of BoxLayout.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class BoxLayoutTest extends JPanel
                           implements ActionListener{
  private BoxLayout layout;
  private JButton topButton, middleButton, bottomButton;

  public BoxLayoutTest() {
    layout = new BoxLayout(this, BoxLayout.Y_AXIS);
    setLayout(layout);
    JLabel label = new JLabel("BoxLayout Demo");
    topButton = new JButton("Left Alignment");
    middleButton = new JButton("Center Alignment");
    bottomButton = new JButton("Right Alignment");
    topButton.addActionListener(this);
    middleButton.addActionListener(this);
    bottomButton.addActionListener(this);
    add(label);
    add(topButton);
    add(middleButton);
    add(bottomButton);
    setBackground(Color.white);
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == topButton) {
      refresh(Component.LEFT_ALIGNMENT);
    } else if (event.getSource() == middleButton) {
      refresh(Component.CENTER_ALIGNMENT);
    } else if (event.getSource() == bottomButton) {
      refresh(Component.RIGHT_ALIGNMENT);
    }
  }

  private void refresh(float alignment){
    topButton.setAlignmentX(alignment);
    middleButton.setAlignmentX(alignment);
    bottomButton.setAlignmentX(alignment);
    revalidate();
    System.out.println("x: "+layout.getLayoutAlignmentX(this));
  }

  public static void main(String[] args) {
    //WindowUtilities.setNativeLookAndFeel();
    WindowUtilities.openInJFrame(new BoxLayoutTest(), 300, 135,
                                 "BoxLayoutTest");
  }
}