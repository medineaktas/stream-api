package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class UnderAge {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 15,"uk"),
                new Person("Bob", 20,"uk"),
                new Person("Charlie", 12,"uk"),
                new Person("David", 17,"uk")
        );

        Set<String> kidsNames = getKidsName(people);
        System.out.println("Kids' Names: " + kidsNames);
    }

    public static Set<String> getKidsName(List<Person> people){
        return people.stream()
                .filter(person -> person.getAge() < 18)
                .map(person -> person.getName())
                .collect(Collectors.toSet());
    }
}
