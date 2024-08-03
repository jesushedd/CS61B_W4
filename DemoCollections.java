import java.util.*;

public class DemoCollections {
    /** Returns a lower case version of the string with
     * all characters except letters removed. */
    public static String cleanString(String s){
        return s.toLowerCase().replaceAll("[^a-z]", "");
    }

    /*Gets a list of all words in the file*/
    public static List<String> getWords(String inputFilename){
        List<String> words = new ArrayList<String>();
        In in = new In(inputFilename);
        while (!in.isEmpty()){
            String nextWord = cleanString(in.readString());
            //System.out.println(nextWord);
            words.add(nextWord);
        }
        return words;
    }

    /*
    * Return the count of the number of unique words in words*/
    public static int countUniqueWord(List<String> words){
        Set<String> uniqueWords = new HashSet<String>();

        for (String ithWord : words) {
            uniqueWords.add(ithWord);
        }

        return uniqueWords.size();
    }

    /*
    * Returns  a map that tracks the count of all specified target words in words(main list) */
    public static Map<String, Integer> collectWordCount(List<String> wordList, List<String> targetWords){
        Map<String, Integer> counts = new HashMap<String, Integer>();
        //Make a note that we have seen none of thw words
        for (String t : targetWords){
            counts.put(t, 0);
        }

        //Start finding and add +1 if found
        for (String w : wordList){
            //int oldCount = counts.get(w);
            //counts.computeIfPresent(w, "");
            if (counts.containsKey(w)){
                int oldCount  = counts.get(w);
                counts.put(w, oldCount + 1);
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        List<String> w = getWords("lotteryOfBabylon.txt");
        //System.out.println(countUniqueWord(w));
        Set<String> wordSet = new HashSet<>(w);
        System.out.println(wordSet.size());

        //Target word to count in w
        List<String> targets = new ArrayList<>();
        targets.add("lottery");
        targets.add("the");
        targets.add("babylon");

        Map<String, Integer> targetWordsInListCount = collectWordCount(w, targets);
        System.out.println(targetWordsInListCount);


    }
}
