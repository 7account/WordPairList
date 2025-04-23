import java.util.ArrayList;
public class WordPairList {
    private ArrayList<WordPair> allPairs;
    public WordPairList(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int x = i + 1; x < words.length; x++) {
                allPairs.add(WordPair(words[i], words[x]));
            }
        }
    }

    public int numMatches() {
        for (int i = 0; i < allPairs.size(); i++) {
            
        }
    }
}