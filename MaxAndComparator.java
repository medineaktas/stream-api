package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndComparator {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "USA"),
                new Person("Bob", 30, "Canada"),
                new Person("Charlie", 35, "UK")
        );

        Person oldestPerson = getOldestPerson(people);
        System.out.println("Oldest person: " + oldestPerson.getName());
        System.out.println("Nationality: " + oldestPerson.getNationality());
    }

    public static Person getOldestPerson(List<Person> people){
        return people.stream()
                .max(Comparator.comparingInt(age-> age.getAge()))
                .orElse(new Person("", 0));
    }
}
