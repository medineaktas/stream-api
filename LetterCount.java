package stream;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {
        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("william","jones","aaron","seppe","frank","gilliam"));
    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names){
         return Arrays.stream(names)
                 .filter(name -> name.length() > 5) //Stream<String>
                 .mapToInt(name -> name.length()) //Stream<Integer>
                 .sum();
    }
}