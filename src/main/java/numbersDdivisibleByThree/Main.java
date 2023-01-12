package numbersDdivisibleByThree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = NumbersDivisibleByThree.getNumbersDivisibleByThree(-21, 7);
        assert list != null;
        list.stream().forEach(integer -> System.out.println(integer));
    }
}
