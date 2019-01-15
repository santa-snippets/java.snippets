import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and Java</a>.
 */

public class Employees {
  public static void main(String[] args) {
    String file = "department.xml";
    if (args.length > 0) {
      file = args[0];
    }
    try {
      DocumentBuilderFactory factory =
        DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.parse(new File(file));
      Element root = document.getDocumentElement();
      System.out.printf("Department name: %s%n",
                        root.getAttribute("name"));
      NodeList staffMembers =
        root.getElementsByTagName("staffMember");
      for(int i=0; i<staffMembers.getLength(); i++) {
        Element staffMember = (Element)staffMembers.item(i);
        System.out.printf("  Staff member: %s (%s)%n",
                          staffMember.getAttribute("name"),
                          staffMember.getAttribute("id"));
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
