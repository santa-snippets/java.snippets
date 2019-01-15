import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and Java</a>.
 */

public class DepartmentName {
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
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
