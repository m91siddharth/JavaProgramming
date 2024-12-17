package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamQuestions {
    public static void main (String[] args){
        List<Integer> a1 = Arrays.asList(1,2,5,4,3,78,97,6,8,9,66);
        // > 5 & sorted
        System.out.println(a1);

        List<Integer> collect = a1.stream()
                .filter(i -> i > 5)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted and > 5"+ collect);

    }

}

