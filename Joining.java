package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 15,"uk"),
                new Person("Bob", 20,"tr"),
                new Person("Charlie", 12,"tr"),
                new Person("David", 17,"uk")
        );
        String names = namesToString(people);
        System.out.println(names);

    }

    public  static String namesToString(List<Person> people){
        return "Names -->" +people.stream().map(person -> person.getName())
                .collect(Collectors.joining(","));
    }
}
