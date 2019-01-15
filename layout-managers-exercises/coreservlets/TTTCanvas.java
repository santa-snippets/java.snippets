package coreservlets;

import java.awt.*;
import java.awt.event.*;

public class TTTCanvas extends Canvas {
  public TTTCanvas() {
    addMouseListener(new XDrawer());
  }

  private class XDrawer extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) {
      Graphics g = getGraphics();
      int height = getHeight();
      Font font = new Font("Serif", Font.BOLD, height-10);
      g.setFont(font);
      g.drawString("X", 30, height-10);
    }
  }
}