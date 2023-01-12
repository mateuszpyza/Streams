package lettersInWords;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;


public class LettersInWords {
    public static LinkedHashSet<String> getUniqueLetters(List<String> wordList) {
        if (wordList == null) return null;
        String string = String.join("", wordList);
        List<String> newList = Arrays.stream(string.toUpperCase().split("")).toList();
        return new LinkedHashSet<>(newList);
    }
}
