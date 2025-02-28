package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
//        1. create stream
        Stream<String> stringStream= Stream.of("java", "springboot", "aop");
        stringStream.forEach(System.out::println);

//        2. create stream from source: Collections, List, Set, Arrays
        Collection<String> nameCollection = Arrays.asList(
                "Himanshu",
                "Raghav",
                "Amit"
        );
        nameCollection.stream().forEach(System.out::println);

        int[] numberArr={23, 1, 17, 98, 45};
        Arrays.stream(numberArr).forEach(System.out::println);

    }
}
