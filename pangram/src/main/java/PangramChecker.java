import java.util.*;
import java.util.stream.*;

public class PangramChecker {

    public boolean isPangram(String input) {
        String lowerCaseInput = input.toLowerCase();

        return IntStream.rangeClosed('a', 'z').mapToObj(i -> (char) i).allMatch(c -> lowerCaseInput.indexOf(c) > -1);
    }
}
