package coreservlets;

import javax.swing.*;

public class ClickFrame extends JFrame {
  public ClickFrame() {
    super("Separate Class as MouseListener");
    setContentPane(new ClickPanel());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ClickFrame();
  }
}
