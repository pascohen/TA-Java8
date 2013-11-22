package java8;

import common.Employee;
import common.Util;
import java.util.Arrays;
import java.util.List;

public class StreamsProcessEmployees {
    public static void main(String args[]) {
        List<Integer> ids = Arrays.asList(0, 1, 2, 3, 4, 5, 6);

        Util.employees().stream()
                .forEach(e -> System.out.println(e));

        System.out.print("Amadeus salaries: ");
        Util.employees().stream()
                .filter(e -> "Amadeus".equals(e.getCompanyName()))
                .forEach(e -> System.out.print(e.getSalary() + "€ "));
        
        int sum = ids.stream()
                .filter(i -> Util.findAmadeusEmployee(i) != null)
                .map(Util::findAmadeusEmployee)
                .map(Employee::getSalary)
                .reduce(Integer::sum).get();

        System.out.println();
        System.out.println("Summed salary of Amadeus employees: " + sum + "€");        
    }
}

/*


*/