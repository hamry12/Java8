package methodReference;

import predefined.ConsumerImpl;
import predefined.FunctionImpl;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;


class QueueService{
    QueueService(String msg){
        System.out.println("Message Received in Queue:: "+msg);
    }
}


public class MethodRef {

    /**
     * Method reference is an alternative to lambda expression
     * 1. Using Static Method
     * 2. Instance Method
     * 3. Constructor
     */
    public static double addition(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
//        1. Method reference using static method
        Function<String, Boolean> function= FunctionImpl::checkIfPalindrome;
        System.out.println("Palindrome\t"+function.apply("douche"));
        System.out.println("Palindrome\t"+function.apply("madam"));


//        Addition static method using method reference
        BiFunction<Double, Double, Double> biFunction= MethodRef::addition;
        System.out.println("Addition\t"+biFunction.apply(12.5,19.0));

        //2. Instance Method Reference
        Function<String, String> stringFunction= String::toUpperCase;
        System.out.println("upper Case\t"+stringFunction.apply("himanshu"));

//        3. Constructor Reference
        Consumer<String> consumer= QueueService::new;
        consumer.accept("First Queue data!!");

    }
}
