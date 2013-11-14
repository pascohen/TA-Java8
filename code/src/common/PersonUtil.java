package common;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Przemyslaw Bielicki
 */
public class PersonUtil {
  
  private static final String[] FIRST_NAMES = {"John", "Pierre", "Tom", "Agathe", "Marie", "Naomie", "Vicky", "Mike"};
  
  private static final String[] LAST_NAMES = {"Smith", "Jovi", "Ghan", "Culli", "Paper", "Black", "White", "Green", "Small"};
  
  public static List<Person> people() {
    List<Person> list = new LinkedList<>();
    for (String lastName : LAST_NAMES) {
      for (String firstName : FIRST_NAMES) {
        list.add(new PersonImpl(firstName, lastName, (int) (Math.random() * 30) + 10));
      }
    }
    return list;
  }
}
