package java8;

import common.Person;
import common.Util;
import java.util.List;

/**
 * @author Przemyslaw Bielicki
 */
public class StreamsPrint {
  public static void main(String[] args) {
    List<Person> people = Util.people();
    
    // old way
    for (Person p : people) {
      System.out.println(Thread.currentThread().getName() + " " + p);
    }
  }
}

/*    Consumer<Person> action = (Person p) -> System.out.println(Thread.currentThread().getName() + " " + p);
    
    System.out.println("\n\n");
    
    // new way
    list.stream().forEach(p -> System.out.println(Thread.currentThread().getName() + " " + p));
    System.out.println("\n\n");
    list.parallelStream().forEach(p -> System.out.println(Thread.currentThread().getName() + " " + p));
*/