package java8;

import common.Person;
import common.PersonUtil;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Przemyslaw Bielicki
 */
public class LambdaCollections {

    public static void main(String[] args) {
        List<Person> people = PersonUtil.people();
        
/*        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });
  */      
        System.out.println(people);
        
//        Collections.sort(people, Comparator.comparing(p -> p.getLastName() + p.getFirstName()));
        
        System.out.println(people);

        Collections.sort(people, Comparator.comparing(Person::getLastName));

        System.out.println(people);
        
        people.sort(Comparator.comparing(p -> p.getLastName() + p.getFirstName()));
        people.sort(Comparator.comparing(Person::getLastName));
        System.out.println(people);
    }
}
