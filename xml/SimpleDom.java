import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and Java</a>.
 */

public class SimpleDom {
  public static void main(String[] args) {
    String file;
    if (args.length > 0) {
      file = args[0];
    } else {
      file = "test.xml";
    }
    DocumentBuilderFactory factory =
      DocumentBuilderFactory.newInstance();
      //factory.setValidating(true);
      //factory.setNamespaceAware(true);
    try {
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
    NodeList sections =
      department.getElementsByTagName("section");
    for(int i=0; i<sections.getLength(); i++) {
      Element section = (Element)sections.item(i);
      int sectionStaff =
        toInt(section.getAttribute("numStaff"));
      departmentStaff = departmentStaff + sectionStaff;
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
