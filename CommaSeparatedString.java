package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparatedString {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 44);
        String result = CommaSeparatedString.getCommaSeparatedString(numbers);
        System.out.println(result);    }

    public static String getCommaSeparatedString(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(","));
    }
}
