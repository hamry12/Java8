package optional;

import dao.Employee;
import dao.EmployeeDAO;

import java.util.List;
import java.util.Optional;

public class OptionalImpl {

    /**
     *  Optional is a util class created to handle null checks or null-pointer exception.
     *  There are multiple ways we can create an Optional Data
     *  1. using of
     *  2. ofNullable
     *  3. Optional.empty()
     */

    public static void main(String[] args) {
//        get Employee List
        List<Employee> employeeList= new EmployeeDAO().getEmployeeList();

//        1. create optional data
        Optional<Object> empty = Optional.empty();
        System.out.println("Optional.Empty::\t"+empty);

        // This would throw Null Pointer exception if nullable data is passed
        Optional<List<Employee>> optionalEmployeeList = Optional.of(employeeList);
        System.out.println("Optional Employee List\n"+optionalEmployeeList);

        // To handle the above case; where user is not sure of null check we can use
        Optional<String> nullableOptional= Optional.ofNullable(null);
        System.out.println("Nullable Optional check\t"+nullableOptional);


//        2. Instance Methods

//        a. Throws exception if list is blank or null
        List<Employee> employees= optionalEmployeeList.get();
        try{
            String str = nullableOptional.get();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


//        b. In order to throw an error, if no such data exist then use
        Optional<String> addressSecondLine = Optional.ofNullable(
                employees.get(0).getAddress().getSecondLine()
        );
        try{
            addressSecondLine.orElseThrow(NoSuchFieldException::new);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

//        c. To address the issue above if no such data is present use: (Eager Evaluation)
        Optional<String> optionalAddressFirstLine=Optional.ofNullable(
                employees.get(0).getAddress().getFirstLine()
        );
        System.out.println("orElse::\t"+optionalAddressFirstLine.orElse(getDefaultAddress()));

//        d. orElseGet() this can be used to invoke another function if not found: (Lazy Evaluation)
        System.out.println("orElseGet()::\t"+optionalAddressFirstLine
                .orElseGet(OptionalImpl::getDefaultAddress));

    }

    public static String getDefaultAddress(){
        return "Default Address";
    }
}
