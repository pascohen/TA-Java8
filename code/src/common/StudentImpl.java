package common;

import java.util.Arrays;

/**
 * @author Przemyslaw Bielicki
 */
public class StudentImpl implements Student {

    private final Person person;
    private double avgGrade;
    
    public StudentImpl(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Student: " + person.toString();
    }

    @Override
    public int getAge() {
        return person.getAge();
    }

    @Override
    public String getFirstName() {
        return person.getFirstName();
    }

    @Override
    public String getLastName() {
        return person.getLastName();
    }
    
    @Override
    public Sex getSex() {
        return person.getSex();
    }

    @Override
    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public void setGrades(double... grades) {
        avgGrade = Arrays.stream(grades).average().orElse(0);
    }
}
