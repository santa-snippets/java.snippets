package coreservlets;

import java.awt.*;
import javax.swing.*;

public class ClickPanel extends JPanel {
  public ClickPanel() {
    setBackground(Color.YELLOW);
    addMouseListener(new ClickListener());
  }
}
