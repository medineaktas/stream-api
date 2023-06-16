package stream;

import java.util.Arrays;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 15,"uk"),
                new Person("Bob", 20,"tr"),
                new Person("Charlie", 12,"tr"),
                new Person("David", 17,"uk")
        );
        Map<String, List<Person>> partitionedPeople = groupByNationality(people);
        System.out.println(partitionedPeople);

    }

    public static Map<String, List<Person>> groupByNationality(List<Person> people){
        return  people.stream().collect(Collectors.groupingBy(person -> person.getNationality(), Collectors.toList()));
    }
}
