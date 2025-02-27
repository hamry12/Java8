package predefined;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

//        1. Function using Generic Approach
        Function<String,Boolean> function= new FunctionImpl();
        System.out.println("Palindrome\t"+function.apply("abba"));
        System.out.println("Palindrome\t"+function.apply("abbd"));

//        2. Function Using lambda Expression
        Function<String, Boolean> booleanFunction=(input)->{
            return FunctionImpl.checkIfPalindrome(input);
        };
        System.out.println("Lambda Palindrome\t"+booleanFunction.apply("caac"));
        System.out.println("Lambda Palindrome\t"+booleanFunction.apply("caad"));

//        3. Consumer Using Generic approach
        Consumer<String> consumer= new ConsumerImpl();
        Consumer<String> consumer1 = name -> System.out.println("Length: " + name.length());
        Consumer<String> combinedConsumer = consumer.andThen(consumer1);
        combinedConsumer.accept("Himanshu");


    }
}
