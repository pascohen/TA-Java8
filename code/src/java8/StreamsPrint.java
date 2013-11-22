package java8;

import common.Person;
import common.Util;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StreamsPrint {
  public static void main(String[] args) {
    List<Person> people = Util.people();
    Map<String, Person> peopleMap = Util.peopleMap();
    
    // old way
    for (Person p : people) {
      System.out.println("Thread: " + Thread.currentThread().getName() 
              + ", Person: " + p);
    }

    for (Entry<String, Person> e : peopleMap.entrySet()) {
      System.out.println(e.getKey() + " = " + e.getValue());
    }
    
    //System.out.println(Runtime.getRuntime().availableProcessors());
  }
}