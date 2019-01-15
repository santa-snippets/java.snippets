package people;
/** Small example to test the Person class. Note that we could just print
 *  instances of the Person class directly, because we added a toString method.
 *  However, that approach was buried at the end of the "Advanced Topics" section,
 *  and had not been covered when the main Person examples were given.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */
public class PersonTest {
  public static void main(String[] args) {
    Person[] people = new Person[20];
    for(int i=0; i<people.length; i++) {
      people[i] = new Person(randomFirstName(),
                             randomLastName());
    }
    for(Person person: people) {
      System.out.println("Person's full name: " +
                         person.getFullName());
    }
  }
  
  private static String randomFirstName() {
    int num = (int)(Math.random()*1000);
    return("John" + num);
  }
  
  private static String randomLastName() {
    int num = (int)(Math.random()*1000);
    return("Smith" + num);
  }
}
