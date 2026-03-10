import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * Demonstrates use of HashMap for efficient character pattern storage and retrieval.
 */
public class MapCollection {

    /**
     * Utility method to build the character pattern map.
     * @return HashMap containing character patterns
     */
    public static Map<Character, String[]> buildCharacterPatterns() {
        Map<Character, String[]> patternMap = new HashMap<>();

        // Define patterns for O, P, and S
        patternMap.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        patternMap.put('P', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        });

        patternMap.put('S', new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        });

        return patternMap;
    }

    /**
     * Utility method to render a banner word using stored patterns.
     * @param word the word to display
     * @param patternMap the map of character patterns
     */
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    line.append(pattern[row]).append("  "); // spacing between characters
                }
            }
            System.out.println(line.toString());
        }
    }

    /**
     * Main method to display "OOPS" in banner format.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildCharacterPatterns();
        String word = "OOPS";
        renderBanner(word, patternMap);
    }
}