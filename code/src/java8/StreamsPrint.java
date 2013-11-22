package java8;

import common.Person;
import common.Util;
import java.util.List;
import java.util.Map;

public class StreamsPrint {
  public static void main(String[] args) {
    List<Person> people = Util.people();
    Map<String, Person> peopleMap = Util.peopleMap();
    
    System.out.println("Number of processors (cores): " + Runtime.getRuntime().availableProcessors());
    
    people.stream()
            .parallel()
            .forEach(p -> System.out.println("Thread: " 
                    + Thread.currentThread().getName()
                    + ", person: " + p));
    
    peopleMap.forEach((k, v) -> System.out.println(k + " = " + v));
  }
}
