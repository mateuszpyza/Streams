package doctors;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UniqueList {
    public static List<String> getUniqueList(List<String> listOfText) {
        if (listOfText == null) return null;
        List<String> newList = Arrays.stream(listOfText.stream()
                        .map(Objects::toString)
                        .collect(Collectors.joining(":"))
                        .split(":"))
                .map(String::trim)
                .collect(Collectors.toList());
        newList.removeIf(s -> s.contains("Szpital") || s.contains("Przychodnia") || s.contains("Laryngolog"));
        return newList;
    }
}
