import java.util.ArrayList;
public class WordPairList {
    private ArrayList<WordPair> allPairs = new ArrayList<WordPair>();
    public WordPairList() {
        allPairs = new ArrayList<WordPair>();
    }

    public WordPairList(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int x = i + 1; x < words.length; x++) {
                WordPair w = new WordPair(words[i], words[x]);
                allPairs.add(w);
            }
        }
    }

    public int numMatches() {
        int matches = 0;
        for (WordPair w : allPairs) {
            if (w.getFirst().equals(w.getSecond())) matches++;
        }
        return matches;
    }

    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }
}