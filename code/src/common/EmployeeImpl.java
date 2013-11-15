package common;

/**
 * @author Przemyslaw Bielicki
 */
public class EmployeeImpl implements Employee {
    
    private final Person person;
    private final String companyName;
    private final int id;
    private final int salary;

    public EmployeeImpl(Person person, int id, String companyName, int salary) {
        this.person = person;
        this.id = id;
        this.companyName = companyName;
        this.salary = salary;
    }
 
    @Override
    public String toString() {
        return "Employee ("+ getId() + "): " + getFirstName() + " " 
                + getLastName() 
                + " (" + getSalary() 
                + "€ " + getCompanyName() + ")";
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
    public String getCompanyName() {
      return companyName;
    }

    @Override
    public int getId() {
      return id;
    }

    public int getSalary() {
        return salary;
    }    
}
