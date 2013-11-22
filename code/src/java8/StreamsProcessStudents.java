package java8;

import common.Person;
import common.Person.Sex;
import common.Student;
import common.StudentImpl;
import common.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsProcessStudents {
    public static void main(String args[]) {
       List<Person> people = Util.people();
       List<Student> maleStudents = new ArrayList<>();
       List<Student> femaleStudents = new ArrayList<>();
       int maleTotalAge = 0;
       int femaleTotalAge = 0;

       for (Person p : people) {
           if (p.getAge() > 18) {
               if (Sex.MALE == p.getSex()) {
                maleStudents.add(new StudentImpl(p));
                maleTotalAge += p.getAge();
               } else {
                femaleStudents.add(new StudentImpl(p));                   
                femaleTotalAge += p.getAge();
               }
           }
       }

       System.out.println("Avg female student age: " + femaleTotalAge / femaleStudents.size());
       System.out.println();
       System.out.println("Avg male student age: " + maleTotalAge / maleStudents.size());
       System.out.println();
       
       femaleStudents = people.stream()
               .filter(p -> p.getAge() > 18)
               .filter(p -> Sex.FEMALE == p.getSex())
               .map(StudentImpl::new)
               .collect(Collectors.toList());
       
       femaleTotalAge = femaleStudents.stream()
               .map(Student::getAge)
               .reduce(Integer::sum)
               .get();
       System.out.println("Avg female student age: " + femaleTotalAge / femaleStudents.size());
       System.out.println();
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