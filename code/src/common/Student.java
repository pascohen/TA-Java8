package common;

/**
 * @author Przemyslaw Bielicki
 */
public interface Student extends Person {
    double getAvgGrade();
    void setGrades(double... grades);
}
