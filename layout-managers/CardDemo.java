import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/** An example of CardLayout. The right side of the window holds
 *  a Panel that uses CardLayout to control four possible
 *  subpanels (each of which is a CardPanel that shows a
 *  picture of a playing card). The buttons on the left side
 *  of the window manipulate the "cards" in this layout by
 *  calling methods in the right-hand panel's layout manager.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class CardDemo extends Applet implements ActionListener {
  private Button first, last, previous, next;
  private String[] cardLabels = { "Jack","Queen","King","Ace" };
  private CardPanel[] cardPanels = new CardPanel[4];
  private CardLayout layout;
  private Panel cardDisplayPanel;

  @Override
  public void init() {
    setBackground(Color.white);
    setLayout(new BorderLayout());
    addButtonPanel();
    addCardDisplayPanel();
  }

  private void addButtonPanel() {
    Panel buttonPanel = new Panel();
    buttonPanel.setLayout(new GridLayout(9, 1));
    Font buttonFont = new Font("SansSerif", Font.BOLD, 18);
    buttonPanel.setFont(buttonFont);
    for(int i=0; i<cardLabels.length; i++) {
      Button button = new Button(cardLabels[i]);
      button.addActionListener(this);
      buttonPanel.add(button);
    }
    first = new Button("First");
    first.addActionListener(this);
    last = new Button("Last");
    last.addActionListener(this);
    previous = new Button("Previous");
    previous.addActionListener(this);
    next = new Button("Next");
    next.addActionListener(this);
    buttonPanel.add(new Label("------------", Label.CENTER));
    buttonPanel.add(first);
    buttonPanel.add(last);
    buttonPanel.add(previous);
    buttonPanel.add(next);
    add(buttonPanel, BorderLayout.WEST);
  }

  private void addCardDisplayPanel() {
    cardDisplayPanel = new Panel();
    layout = new CardLayout();
    cardDisplayPanel.setLayout(layout);
    String cardName;
    for(int i=0; i<cardLabels.length; i++) {
      cardName = cardLabels[i];
      cardPanels[i] =
        new CardPanel(cardName, getCodeBase(),
                      "images/" + cardName + ".gif");
      cardDisplayPanel.add(cardPanels[i], cardName);
    }
    add(cardDisplayPanel, BorderLayout.CENTER);
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    Button source = (Button)event.getSource();
    if (source == first)
      layout.first(cardDisplayPanel);
    else if (source == last)
      layout.last(cardDisplayPanel);
    else if (source == previous)
      layout.previous(cardDisplayPanel);
    else if (source == next)
      layout.next(cardDisplayPanel);
    else
      layout.show(cardDisplayPanel, source.getLabel());
    return;
  }
}