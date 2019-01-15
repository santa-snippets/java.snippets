package coreservlets;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorPanel5 extends JPanel {
  public ColorPanel5() {
    setBackground(Color.RED);
    addKeyListener(new ColorChanger());
    setFocusable(true);
    requestFocusInWindow();
  }
  
  private class ColorChanger extends KeyAdapter {
    @Override
    public void keyTyped(KeyEvent event) {
      String key = String.valueOf(event.getKeyChar());
      switch(key) {
        case "r": setBackground(Color.RED); break;
        case "y": setBackground(Color.YELLOW); break;
        case "g": setBackground(Color.GREEN); break;
        case "b": setBackground(Color.BLUE); break;
      }
    }
  }
}
