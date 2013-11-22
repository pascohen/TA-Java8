package java8;

import common.Person;
import common.Person.Sex;
import common.Student;
import common.StudentImpl;
import common.Util;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsProcessStudents {

    public static void main(String args[]) {
        List<Person> people = Util.people();
        List<StudentImpl> maleStudents = people.stream().filter(p -> p.getAge() > 18)
                .filter(p -> Sex.MALE == p.getSex())
                .map(StudentImpl::new)
                .collect(Collectors.toList());

        int avg = (int) maleStudents.stream()
                .mapToInt(Student::getAge)
                .average().getAsDouble();

        System.out.println("Avg male student age: " + avg);
    }
}
