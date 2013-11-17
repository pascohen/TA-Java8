package java8;

import common.Person;
import common.Person.Sex;
import common.Util;
import common.Student;
import common.StudentImpl;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Przemyslaw Bielicki
 */
public class StreamsProcessStudents {
    public static void main(String args[]) {
       List<Person> people = Util.people();
       List<Student> maleStudents = new ArrayList<>();
       List<Student> femaleStudents = new ArrayList<>();

       for (Person p : people) {
           if (p.getAge() > 18) {
               if (Sex.MALE == p.getSex()) {
                maleStudents.add(new StudentImpl(p));
               } else {
                femaleStudents.add(new StudentImpl(p));                   
               }
           }
       }
       
       for (Student s : femaleStudents) {
           System.out.println(s);
       }
       
       System.out.println();
       
       for (Student s : maleStudents) {
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