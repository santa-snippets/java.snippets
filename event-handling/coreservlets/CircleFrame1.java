package coreservlets;

import javax.swing.*;

public class CircleFrame1 extends JFrame {
  public CircleFrame1() {
    super("Separate Class as MouseListener");
    setContentPane(new CirclePanel1());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new CircleFrame1();
  }
}
