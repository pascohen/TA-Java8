package java8;

import common.Person;
import common.Util;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaCollections {

    public static void main(String[] args) {
        List<Person> people = Util.people();

        System.out.println(people);
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });

        System.out.println(people);
    }
}

/*
 people.sort(Comparator.comparing(p -> p.getLastName() + p.getFirstName()));
 people.sort(Comparator.comparing(Person::getLastName));

 */
