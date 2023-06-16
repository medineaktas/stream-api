package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 15,"uk"),
                new Person("Bob", 20,"uk"),
                new Person("Charlie", 12,"uk"),
                new Person("David", 17,"uk")
        );

        Map<Boolean, List<Person>> partitionedPeople = partitionAdults(people);
        List<Person> adults = partitionedPeople.get(true);
        List<Person> nonAdults = partitionedPeople.get(false);

        System.out.println("Adults: " + adults);
        System.out.println("Non-Adults: " + nonAdults);
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people){
        return people.stream()
                .collect(Collectors.groupingBy(person -> person.getAge() >= 18 , Collectors.toList()));
    }
}
