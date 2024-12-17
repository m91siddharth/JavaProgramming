package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReturnOccurence {
    public static void main (String args[]){
//        String[] st = {"abc","bcd","def", "abc", "abc", "def", "abc"};
//        Stream<String> sst = Arrays.stream(st);
//        List<Integer> ls = sst.map(i -> (){
//        })

        String input = "gainjavaknowledge";
        int[] p = {1,11,33,6,7,14,24,77};
        Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Arrays.stream(p).boxed().sorted().collect(Collectors.toList()).forEach(System.out::print);














        int[] p1 = {1,11,33,6,7,14,24,77};
        List<String> collect = Arrays.stream(p1)
                .boxed()
                .map(s -> s + "")
                .filter(a -> a.startsWith("8"))
                .collect(Collectors.toList());
        System.out.println("starts with 8 - test filter :"+collect);


        //print highest length string
        String[] strAr = {"abc", "defg", "hijklm","xy"};
        String s = Arrays.stream(strAr)
                .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                .get();
        System.out.println("highest length var:"+ s);


        String input2 = "gainjavaknowledge";
        System.out.println("print str:");
        int[] a = {2,44, 6,7,9,7,3};
        int ar = Arrays.stream(a).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println("Second highest no:"+ar);

        //get first non repeated character in a string
        String a1 = String.valueOf(Arrays.stream(input.split("")).collect(Collectors.groupingBy(i-> i, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(i-> i.getValue()==1)
                .findFirst().get().getKey());
        System.out.println(a1);

        List<String> stringList = Arrays.asList("apple", "banana", "orange");

        Map<String, String> mapByIdentity = stringList.stream()
                .collect(Collectors.toMap(Function.identity(), Function.identity()));

        mapByIdentity.forEach((key, value) -> System.out.println(key + ": " + value));


        //get single occurence character in string
        List<String> mp2 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(i->i.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        //get occurence count
        Map<String, Long> mp =Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<String> mp1 = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(mp);
        System.out.println(mp1);
        System.out.println(mp2);
    }
}
