package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(20,12,58,78,96,95,77,85,21,30,21,55);
        List<Integer> integerList = numList.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println(integerList);

        List<Integer> sortedList = numList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        Integer reduceStream = numList.stream().filter(num -> num % 2 == 0).reduce(0, Integer::sum);
        System.out.println(reduceStream);
    }
}
