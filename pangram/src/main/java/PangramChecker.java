public class PangramChecker {

    public boolean isPangram(String input) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        boolean found = true;

        if (input == null || input.length() == 0) {
            return false;
        }

        String lowerCaseInput = input.toLowerCase();
        // check if every char appears in input
        for (char c : letters.toCharArray()) {
            if (lowerCaseInput.indexOf(c) == -1) {
                found = false;
            }
        }

        return found;
    }
}
