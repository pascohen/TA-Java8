package common;

/**
 * @author Przemyslaw Bielicki
 */
public interface Employee extends Person {
    int getId();
    String getCompanyName();
    int getSalary();
}
