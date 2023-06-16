package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("apple", "banana", "cherry"),
                Arrays.asList("orange", "grape"),
                Arrays.asList("kiwi", "melon")
        );

        List<String> flattenedList = transform(nestedList);
        System.out.println(flattenedList);
    }

    public static List<String> transform (List<List<String>> collection){
        return  collection.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
    }
}
