package java8;

import common.Person;
import common.Person.Sex;
import common.Student;
import common.StudentImpl;
import common.Util;
import java.util.ArrayList;
import java.util.List;

public class StreamsProcessStudents {
  public static void main(String args[]) {
    List<Person> people = Util.people();
    List<Student> maleStudents = new ArrayList<>();
    int maleTotalAge = 0;

    for (Person p : people) {
      if (p.getAge() > 18) {
        if (Sex.MALE == p.getSex()) {
          maleStudents.add(new StudentImpl(p));
          maleTotalAge += p.getAge();
        }
      }
    }

    System.out.println("Avg female student age: " + femaleTotalAge / femaleStudents.size());
    System.out.println();
    System.out.println("Avg male student age: " + maleTotalAge / maleStudents.size());
    System.out.println();
  }
}