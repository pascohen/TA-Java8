package java8;

import common.Person;
import common.Person.Sex;
import common.Util;
import java.util.List;

public class Accumulators {

    public static void main(String[] args) {
        List<Person> people = Util.people();

        int sum = 0;
        int count = 0;
        for (Person p : people) {
            if (p.getAge() >= 18 && Sex.FEMALE == p.getSex()) {
                sum += p.getAge();
                count++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
    }
    /*
     final LongAdder adder = new LongAdder();
     final LongAccumulator acc = new LongAccumulator(Long::sum, 0);
	
     people.stream()
     .filter(p -> p.getAge() >= 18)
     .filter(p -> Sex.FEMALE == p.getSex())
     .forEach(p -> { 
     acc.accumulate(p.getAge());
     adder.increment();});
     */
}
