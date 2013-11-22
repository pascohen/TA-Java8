package java8;

import common.Person;
import common.Person.Sex;
import common.Util;
import java.util.List;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

public class Accumulators {

    public static void main(String[] args) {
        List<Person> people = Util.people();

        final LongAdder adder = new LongAdder();
        final LongAccumulator acc = new LongAccumulator(Long::sum, 0);

        people.stream()
                .filter(p -> p.getAge() >= 18)
                .filter(p -> Sex.FEMALE == p.getSex())
                .forEach(p -> {
                    acc.accumulate(p.getAge());
                    adder.increment();
                });

        System.out.println("Average male adult age: " + acc.intValue() / adder.intValue());
    }
}
