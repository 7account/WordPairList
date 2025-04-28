public class WordPair {
    private String[] set = new String[2];
    public WordPair(String first, String second) {
        set[0] = first;
        set[1] = second;
    }

    public String getFirst() {
        return set[0];
    }

    public String getSecond() {
        return set[1];
    }

    public String toString() {
        return "(\"" + set[0] + "\", \"" + set[1] + "\")";
    }
}