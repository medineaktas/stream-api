package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        System.out.println(mapToUpperCase("A","b","c"));
    }
    public static Collection<String> mapToUpperCase(String... names){
        return Arrays.asList(names).stream().map
                (name ->name.toUpperCase()).collect(Collectors.toList());
    }
}
