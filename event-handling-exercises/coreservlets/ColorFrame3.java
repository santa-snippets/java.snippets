package coreservlets;

import javax.swing.*;

public class ColorFrame3 extends JFrame {
  public ColorFrame3() {
    super("Named Inner Class");
    setContentPane(new ColorPanel3());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ColorFrame3();
  }
}
