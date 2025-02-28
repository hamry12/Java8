package stream;

import dao.Employee;
import dao.EmployeeDAO;

import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Employee> employees= new EmployeeDAO().getEmployeeList();

//        1. sort by salary ascending order
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
        System.out.println("************************************************************************");

//        2. sort by salary in descending order
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                .forEach(System.out::println);
        System.out.println("************************************************************************");
    }
}
