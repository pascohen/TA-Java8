package common;

/**
 * @author Przemyslaw Bielicki
 */
public interface Person {
  String getFirstName();
  String getLastName();
  int getAge();
  Sex getSex();
  
  public enum Sex {
      MALE,
      FEMALE
  }
}
