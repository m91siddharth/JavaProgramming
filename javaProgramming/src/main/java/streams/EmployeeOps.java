package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeOps {
    public static void main (String args[]){
        Employee e1 =  new Employee("abc","3", 10000.0);
        Employee e2 =  new Employee("bcd","31", 1000.0);
        Employee e3 =  new Employee("abc","11", 5000.0);
        Employee e4 =  new Employee("abc","21", 6000.0);
        List<Employee> ls = Arrays.asList(e1,e2,e3,e4);

        List<Employee> sorted = ls.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).collect(Collectors.toList());

        sorted.stream().forEach(System.out::print);
    }
}
