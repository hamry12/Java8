package stream;

import java.util.stream.IntStream;

public class BasicPrograms {
    public static void main(String[] args) {
        int[] numberArr={23, 1, 17, 98, 45};

//        1. print the index of each number
        IntStream.range(0, numberArr.length).map(num->num).forEach(System.out::println);

        System.out.println("*******************************");

//        2. print the elements at even length
        IntStream.range(0, numberArr.length)
                .filter(num->num%2==0)
                .mapToObj(i->numberArr[i])
                .forEach(System.out::println);

        System.out.println("*******************************");

    }
}
