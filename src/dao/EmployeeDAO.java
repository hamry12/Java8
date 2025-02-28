package dao;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    private static List<Employee> employeeList;

    static {
        employeeList= new ArrayList<>();
        employeeList.add(
                new Employee(101, "Himanshu", "Singh",
                        "Male", "IT", 175000.0,
                        new Address(
                                "A1-106 Mohan Altura",
                                "560087",
                                "Bangalore",
                                "Karnataka",
                                "India"
                        )
                )
        );
        employeeList.add(
                new Employee(102, "Sohel", "Shaikh",
                        "Male", "IT", 119000.87,
                        new Address(
                                "PG Marathalli",
                                "560037",
                                "Bangalore",
                                "Karnataka",
                                "India"
                        )
                )
        );
        employeeList.add(
                new Employee(100, "Aarti", "Giri",
                        "Female", "IT", 93500.99,
                        new Address(
                                "Flat Sarjapur",
                                "562125",
                                "Bangalore",
                                "Karnataka",
                                "India"
                        )
                )
        );
        employeeList.add(
                new Employee(107, "Pragati", "Srivastava",
                        "Female", "Design", 70000.0,
                        new Address(
                                "trinity Complex",
                                "562125",
                                "Bangalore",
                                "Karnataka",
                                "India"
                        )
                )
        );
        employeeList.add(
                new Employee(107, "Shradha", "Singh",
                        "Female", "QA", 55000.0,
                        new Address(
                                "Flat jaipur",
                                "302001",
                                "jaipur",
                                "Rajasthan",
                                "India"
                        )
                )
        );
        employeeList.add(
                new Employee(105, "Ameeth", "Dubey",
                        "Male", "BA", 255000.0,
                        new Address(
                                "Indiranagar",
                                "569989",
                                "Bangalore",
                                "karnataka",
                                "India"
                        )
                )
        );
    }

    public List<Employee> getEmployeeList(){
        return employeeList;
    }
}
