public class WordPair {
    private String[] subset = new String[2];
    public WordPair(String first, String second) {
        subset[0] = first;
        subset[1] = second;
    }

    public String getFirst() {
        return subset[0];
    }

    public String getSecond() {
        return subset[1];
    }
}