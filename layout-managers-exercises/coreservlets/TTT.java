package coreservlets;

import java.awt.*;

public class TTT {
  public static void main(String[] args) {
    Frame f = new CloseableFrame("TTT");
    f.setBackground(Color.BLACK);
    f.setLayout(new GridLayout(3, 3, 20, 20));
    for(int i=0; i<9; i++) {
      TTTCanvas c = new TTTCanvas();
      c.setBackground(Color.WHITE);
      f.add(c);
    }
    f.setSize(500, 500);
    f.setVisible(true);
  }
}