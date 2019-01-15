package coreservlets;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorPanel6 extends JPanel {
  public ColorPanel6() {
    setBackground(Color.RED);
    addMouseMotionListener(new ColorChanger());
  }
  
  private class ColorChanger extends MouseMotionAdapter {
    @Override
    public void mouseMoved(MouseEvent event) {
      if (event.getX() > getWidth()/2) {
        setBackground(Color.BLUE);
      } else {
        setBackground(Color.RED);
      }
    }
  }
}
