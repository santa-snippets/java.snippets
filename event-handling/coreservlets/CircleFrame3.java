package coreservlets;

import javax.swing.*;

public class CircleFrame3 extends JFrame {
  public CircleFrame3() {
    super("Named Inner Class");
    setContentPane(new CirclePanel3());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new CircleFrame3();
  }
}
