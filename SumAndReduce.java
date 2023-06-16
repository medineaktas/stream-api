package stream;

import java.util.Arrays;
import java.util.List;

public class SumAndReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = calculate(numbers);
        System.out.println("Sum: " + sum);
    }

    public static int calculate(List<Integer> numbers){
        return numbers.stream().reduce((i,sum)->i+sum).orElse(0);
    }
}
