package stream;

import dao.Employee;
import dao.EmployeeDAO;

import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<Employee> employees= new EmployeeDAO().getEmployeeList();

//        1. Filter all the employees whose salary is greater than 95K
        employees.stream()
                .filter(emp->emp.getSalary()>95000.0)
                .forEach(System.out::println);

    }
}
