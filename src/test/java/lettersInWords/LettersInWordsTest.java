package lettersInWords;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;


class LettersInWordsTest {

    @Test
    void getUniqueLetters() {
        //given
        List<String> words = Arrays.asList("ola", "kot");
        LinkedHashSet<String> expected = new LinkedHashSet<>(Arrays.asList("O", "L", "A", "K", "T"));
        //when
        LinkedHashSet<String> result = LettersInWords.getUniqueLetters(words);
        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldVerifyEmptyStringGetUniqueLetters(String input) {
        Assertions.assertEquals(input, input);
    }
}