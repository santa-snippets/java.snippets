package coreservlets.actionlistener;

import java.awt.*;

/** Point: lambdas can refer to both instance variables and
 *  "effectively final" local variables.
 */
public class ButtonFrame4 extends JFrameBase {
  private static final long serialVersionUID = 1L;

  public ButtonFrame4() {
    super("Lambdas");
    button1.addActionListener(event -> contentPane.setBackground(Color.BLUE));
    Color button2Color = Color.GREEN;
    button2.addActionListener(event -> setBg(button2Color));
    button3.addActionListener(event -> setBg(Color.RED));
    setVisible(true);
  } 
}
