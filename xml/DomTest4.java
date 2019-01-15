import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and Java</a>.
 */

public class DomTest4 {
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
      Element root = document.getDocumentElement();
      // Combine text nodes from multiple lines and
      // eliminate empty text nodes
      root.normalize();
      printNode(root, 0);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Node is the parent class of Element

  public static void printNode(Node node, int depth) {
    String prefix = padChars(2*depth, " ");
    if (node.getNodeType() == Node.TEXT_NODE) {
      System.out.printf("%s%s%n", prefix, node.getNodeValue());
    } else {
      NamedNodeMap attributes = node.getAttributes();
      if ((attributes == null) || (attributes.getLength() == 0)) {
        System.out.printf("%s%s%n",
                          prefix, node.getNodeName());
      } else {
        System.out.printf("%s%s [", // No newline
                          prefix, node.getNodeName());
        printAttributes(attributes);
        System.out.println(" ]");
      }
    }
    NodeList children = node.getChildNodes();
    for(int i=0; i<children.getLength(); i++) {
      Node childNode = children.item(i);
      printNode(childNode, depth+1);
    }
  }

  private static void printAttributes(NamedNodeMap attributes)  {
    for(int i=0; i<attributes.getLength(); i++) {
      Node attribute = attributes.item(i);
      System.out.printf(" %s=\"%s\"", attribute.getNodeName(),
                        attribute.getNodeValue());
    }
  }

  private static String padChars(int n, String orig) {
    StringBuilder result = new StringBuilder("");
    for(int i=0; i<n; i++) {
      result = result.append(orig);
    }
    return(result.toString());
  }
}
