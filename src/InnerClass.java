
public class InnerClass {

    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and its pattern.
         * @param character the character to be represented
         * @param pattern the 7-line banner pattern for the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character.
         * @return the character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern.
         * @return the banner pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to retrieve the pattern for a given character.
     * @param c the character to look up
     * @param map array of CharacterPatternMap objects
     * @return the banner pattern for the character
     */
    public static String[] getCharacterPattern(char c, CharacterPatternMap[] map) {
        for (CharacterPatternMap entry : map) {
            if (entry.getCharacter() == c) {
                return entry.getPattern();
            }
        }
        return new String[0]; // return empty if not found
    }

    /**
     * Main method to display "OOPS" in banner format.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Define patterns for O, P, and S
        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] P = {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };

        String[] S = {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };

        // Create CharacterPatternMap objects
        CharacterPatternMap[] map = {
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S)
        };

        // Word to display
        String word = "OOPS";

        // Build banner line by line
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = getCharacterPattern(c, map);
                line.append(pattern[row]).append("  "); // spacing between characters
            }
            System.out.println(line.toString());
        }
    }
}