public class StaticFunction {

    // Helper method for 'O'
    public static String[] getOPattern() {
        return new String[]{
            " *****  ",
            "*     * ",
            "*     * ",
            "*     * ",
            "*     * ",
            "*     * ",
            " *****  "
        };
    }

    // Helper method for 'P'
    public static String[] getPPattern() {
        return new String[]{
            "******  ",
            "*     * ",
            "*     * ",
            "******  ",
            "*       ",
            "*       ",
            "*       "
        };
    }

    // Helper method for 'S'
    public static String[] getSPattern() {
        return new String[]{
            " *****  ",
            "*       ",
            "*       ",
            " *****  ",
            "      * ",
            "      * ",
            " *****  "
        };
    }

    public static void main(String[] args) {
        // Array initialization using helper methods
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p  = getPPattern();
        String[] s  = getSPattern();

        // Loop-based rendering
        for (int i = 0; i < o1.length; i++) {
            System.out.println(o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}