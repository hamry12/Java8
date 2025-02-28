package stream;

import dao.Employee;
import dao.EmployeeDAO;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewProgram {
    public static void main(String[] args) {
        List<Integer> numberList= Arrays.asList(1,11,18,13,22,11);
        List<String> fruitList= Arrays.asList("apple", "Banana", "Apple", "pears");
        String wordTobeReversed="Some word to be reversed";
        List<Employee> employees= new EmployeeDAO().getEmployeeList();

//        1. Remove Duplicates
        numberList.stream().distinct().forEach(System.out::println);
        System.out.println("*******************************************");

        fruitList.stream().map(String::toLowerCase)
                .toList()
                .stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("********************************************");

//        2. Reverse Word
        String reversedWordList = Arrays.stream(wordTobeReversed.split(" "))
                .map((word) -> {
                    return new StringBuilder(word).reverse().toString();
                })
                .collect(Collectors.joining(" "));
        System.out.println(reversedWordList);
        System.out.println("********************************************");

//        3. Reverse Word order
        String reversedOrder = Arrays.stream(wordTobeReversed.split(" ")) // Split into words
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining(" "));

        System.out.println(reversedOrder);
        System.out.println("********************************************");

//        4. Highest Salary from each dept
        Map<String, Optional<Employee>> highestSalary = employees.stream().collect(
                Collectors
                        .groupingBy(Employee::getDepartment,
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                        )
        );

        highestSalary.forEach((dept, emp)->{
            System.out.println("Dept\t"+dept+"\t Salary\t"+emp.get());
        });


    }
}
