package lettersInWords;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("kebab", "ziemniak", "codzienność", "monotonnia", "kot");
        System.out.println(LettersInWords.getUniqueLetters(words));
    }
}
