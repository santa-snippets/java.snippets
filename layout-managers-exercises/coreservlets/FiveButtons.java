package coreservlets;

import java.awt.*;

public class FiveButtons {
  public static void main(String[] args) {
    Frame f = new CloseableFrame("Five Buttons");
    f.setLayout(new FlowLayout());
    for(int i=0; i<5; i++) {
      f.add(new Button("Button " + i));
    }
    f.setSize(300, 300);
    f.setVisible(true);
  }
}