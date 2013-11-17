package java8;

import common.Employee;
import common.Util;
import java.util.Arrays;
import java.util.List;

/**
 * @author Przemyslaw Bielicki
 */
public class StreamsProcessEmployees {
    public static void main(String args[]) {
        List<Integer> ids = Arrays.asList(0, 1, 2, 3, 4, 5, 6);

        int sum = 0;
        for (int id : ids) {
            Employee e = Util.findAmadeusEmployee(id);
            if (e != null && "Amadeus".equals(e.getCompanyName())) {
                sum += e.getSalary();
            }
        }

        System.out.println();
        System.out.println("Summed salary of Amadeus employees: " + sum + "€");        
    }
}

/*
        PersonUtil.employees().stream()
                .forEach(e -> System.out.println(e));

        
        PersonUtil.employees().stream()
                .filter(e -> "Amadeus".equals(e.getCompanyName()))
                .forEach(e -> System.out.print(e.getSalary() + "€ "));
        
        int sum = ids.stream()
                .filter(i -> PersonUtil.findAmadeusEmployee(i) != null)
                .map(PersonUtil::findAmadeusEmployee)
                .map(Employee::getSalary)
                .reduce(Integer::sum).get();

*/