package coreservlets.actionlistener;

import java.awt.*;

/** Point: you can omit the parents if there is exactly one argument. */

public class ButtonFrame3 extends JFrameBase {
  private static final long serialVersionUID = 1L;

  public ButtonFrame3() {
    super("Lambdas");
    button1.addActionListener(event -> setBg(Color.BLUE));
    button2.addActionListener(event -> setBg(Color.GREEN));
    button3.addActionListener(event -> setBg(Color.RED));
    setVisible(true);
  } 
}
