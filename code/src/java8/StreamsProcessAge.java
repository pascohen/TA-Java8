package java8;

import common.Person;
import common.Util;
import java.util.List;

/**
 * @author Przemyslaw Bielicki
 */
public class StreamsProcessAge {
   public static void main(String args[]) {
       List<Person> people = Util.people();
       
       int totalAdultAge = 0;
       int totalAge = 0;
       int count = 0;
       for (Person p : people) {
           if (p.getAge() >= 18) {
               count++;
               totalAdultAge += p.getAge();
           }
           totalAge += p.getAge();
       }
       
       System.out.println("Avg age (" + people.size() + " people): " + totalAge / people.size());
       System.out.println("Avg age (" + count + " adults): " + totalAdultAge / count);
   } 
}

/*
       int avg = (int) list.stream()
               .mapToInt(p -> p.getAge())
               .average().getAsDouble();
       System.out.println("Avg age: " + avg);
       
       avg = (int) list.stream()
               .filter(p -> p.getAge() > 18)
               .mapToInt(p -> p.getAge())
               .average().getAsDouble();
       System.out.println("Avg age (adults): " + avg);
*/
