package common;

import common.Person.Sex;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Przemyslaw Bielicki
 */
public class Util {
  
  private static final String[] FIRST_NAMES = {"John", "Pierre", "Tom", "Agathe", "Marie", "Naomie", "Vicky", "Mike"};
  
  private static final String[] LAST_NAMES = {"Smith", "Jovi", "Ghan", "Culli", "Paper", "Black", "White", "Green", "Small"};
  
  private static final List<Employee> EMPLOYEES;
  
  static {
    List<Person> people = people();
    List<Employee> list = new LinkedList<>();

    String[] company = {"Amadeus", "Google"};

    for (int i = 0; i < FIRST_NAMES.length; i++) {
      list.add(new EmployeeImpl(people.get(i * FIRST_NAMES.length + i), 
              i, 
              company[i % company.length],
              (int) (Math.random() * 40000) + 40000));
    }

    EMPLOYEES = list;      
  }
  
  public static List<Person> people() {
    List<Person> list = new LinkedList<>();
    for (String lastName : LAST_NAMES) {
      for (String firstName : FIRST_NAMES) {
        Sex sex = Sex.MALE;
        switch (firstName) {
            case "Agathe":
            case "Marie":
            case "Naomie":
            case "Vicky":
                sex = Sex.FEMALE;
                break;
        }
        list.add(new PersonImpl(firstName, lastName, (int) (Math.random() * 30) + 10, sex));
      }
    }
    return list;
  }
  
  public static Map<String, Person> peopleMap() {
      final Map<String, Person> map = new HashMap<>();
      people().forEach(p -> map.put(p.getLastName().charAt(0) + ""
              + p.getFirstName().charAt(0), p));
      return map;
  }  
  
  public static List<Employee> employees() {
      return EMPLOYEES;
  }
  
  public static Employee findAmadeusEmployee(int id) {
      return employees().stream()
              .filter(e -> id == e.getId() && "Amadeus".equals(e.getCompanyName()))
              .findFirst().orElse(null);
  }
}
