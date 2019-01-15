import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and Java</a>.
 */

public class DomTest3 {
  public static void main(String[] args) {
    String file = "test2.xml";
    if (args.length > 0) {
      file = args[0];
    }
    try {
      DocumentBuilderFactory factory =
        DocumentBuilderFactory.newInstance();
      //factory.setValidating(true);
      //factory.setNamespaceAware(true);
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.parse(new File(file));
      System.out.printf("APL Labs by Department%n%n");
      Element root = document.getDocumentElement();
      // Combine text nodes from multiple lines and
      // eliminate empty text nodes
      root.normalize();
      NodeList departments =
        root.getElementsByTagName("department");
      for(int i=0; i<departments.getLength(); i++) {
        Element department = (Element)departments.item(i);
        NodeList labs = department.getElementsByTagName("lab");
        for(int j=0; j<labs.getLength(); j++) {
          Element lab = (Element)labs.item(j);
          System.out.printf("  Lab name: %s",
                            lab.getAttribute("name"));
          String labDescription =
            lab.getFirstChild().getNodeValue();
          System.out.println(labDescription);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
