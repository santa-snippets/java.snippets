import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and Java</a>.
 */

public class DomTest2 {
  public static void main(String[] args) {
    String file = "test1.xml";
    if (args.length > 0) {
      file = args[0];
    }
    try {
      DocumentBuilderFactory factory =
        DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.parse(new File(file));
      Element root = document.getDocumentElement();
      System.out.println(root.getTagName());
      System.out.printf("  name: %s%n",
                        root.getAttribute("name"));
      System.out.printf("  short name: %s%n",
                        root.getAttribute("shortName"));
      System.out.printf("  mission: %s%n",
                        root.getAttribute("mission"));
      NodeList departments =
        root.getElementsByTagName("department");
      for(int i=0; i<departments.getLength(); i++) {
        Element department = (Element)departments.item(i);
        System.out.println(department.getTagName());
        System.out.printf("  name: %s%n",
                          department.getAttribute("name"));
        System.out.printf("  mission: %s%n",
                          department.getAttribute("mission"));
        System.out.printf("  staff: %s%n",
                          countStaff(department));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int countStaff(Element department) {
    int departmentStaff = 0;
    NodeList groups =
      department.getElementsByTagName("group");
    for(int i=0; i<groups.getLength(); i++) {
      Element group = (Element)groups.item(i);
      int groupStaff =
        toInt(group.getAttribute("numStaff"));
      departmentStaff = departmentStaff + groupStaff;
    }
    return(departmentStaff);
  }

  public static int toInt(String numString) {
    try {
      return(Integer.parseInt(numString));
    } catch(NumberFormatException nfe) {
      return(0);
    }
  }
}
