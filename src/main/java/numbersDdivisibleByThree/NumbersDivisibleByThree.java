package numbersDdivisibleByThree;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersDivisibleByThree {

    public static List<Integer> getNumbersDivisibleByThree(int firstNumber, int lastNumber) {
        if (firstNumber > lastNumber) {
            System.out.println("First number must be greater than last!");
            return null;
        }
        List<Integer> list = IntStream.range(firstNumber, lastNumber + 1).boxed().toList();
        return list.stream().filter(integer -> integer % 3 == 0).collect(Collectors.toList());
    }
}
