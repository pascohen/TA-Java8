package java8;

import common.Person;
import common.Util;
import java.util.Comparator;
import java.util.List;

public class LambdaCollections {

    public static void main(String[] args) {
        List<Person> people = Util.people();

        System.out.println(people);
        people.sort(Comparator.comparing(Person::getLastName));
        System.out.println(people);
        people.sort(Comparator.comparing(p -> p.getLastName() + p.getFirstName()));
        System.out.println(people);
    }
}
