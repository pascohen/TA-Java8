package common;

/**
 * @author Przemyslaw Bielicki
 */
public class PersonImpl implements Person {

  private final String firstName;
  private final String lastName;
  private final int age;
  private final Sex sex;

  public PersonImpl(String firstName, String lastName, int age, Sex sex) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.sex = sex;
  }

  @Override
  public String toString() {
    return firstName + " " + lastName + " (" + sex.toString().charAt(0) + " " + age + ")";
  }
  
  @Override
  public String getFirstName() {
    return firstName;
  }

  @Override
  public String getLastName() {
    return lastName;
  }

  @Override
  public int getAge() {
    return age;
  }

    @Override
    public Sex getSex() {
        return sex;
    }
}
