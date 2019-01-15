package coreservlets;

import java.awt.*;

/** Two rows of buttons. Uses BorderLayout, so two separate rows even
 *  if window is REALLY wide. 
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ButtonRows2 {
  public static void main(String[] args) {
    Frame f = new CloseableFrame("Five Buttons");
    Panel p1 = new Panel();
    for(int i=0; i<5; i++) {
      p1.add(new Button("Row 0, Col " + i));
    }
    f.add(p1, BorderLayout.NORTH);
    Panel p2 = new Panel();
    for(int i=0; i<5; i++) {
      p2.add(new Button("Row 1, Col " + i));
    }
    f.add(p2, BorderLayout.CENTER);
    f.setSize(600, 400);
    f.setVisible(true);
  }
}