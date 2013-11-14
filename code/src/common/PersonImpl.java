package common;

/**
 * @author Przemyslaw Bielicki
 */
public class PersonImpl implements Person {

  private final String firstName;
  private final String lastName;
  private final int age;

  public PersonImpl(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  @Override
  public String toString() {
    return firstName + " " + lastName + " (" + age + ")";
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
}
