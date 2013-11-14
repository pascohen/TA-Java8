package java8;

import common.Person;
import common.PersonUtil;
import common.Student;
import common.StudentImpl;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Przemyslaw Bielicki
 */
public class StreamsProcessStudents {
    public static void main(String args[]) {
       List<Person> people = PersonUtil.people();
       List<Student> students = new ArrayList<>();

       for (Person p : people) {
           if (p.getAge() > 18) {
               students.add(new StudentImpl(p));
           }
       }
       
       for (Student s : students) {
           System.out.println(s);
       }
    }
}

/*
       List<Student> students = list.stream()
               .parallel()
               .filter(p -> p.getAge() > 18)
               .sequential()
               .map(StudentImpl::new)
               .collect(Collectors.toList());
       
       students.stream().forEach(p -> System.out.println(p));

*/