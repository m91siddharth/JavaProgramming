package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsPractice {

    public static void main(String[] args) {

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        // Create a set to hold intermediate results
//        Set<String> intermediateResults = new HashSet();
//        List<String> result = listOfLists.stream().flatMap(List::stream)
//                .collect(Collectors.toList());  ;
        List<String> result = listOfLists.stream()
                .flatMap(List::stream)
                .filter(i -> i.startsWith("S"))
                .collect(Collectors.toList());  ;
        System.out.println("Intermediate Results:");
        result.forEach(System.out::println);
    }
}
