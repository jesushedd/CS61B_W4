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

    public static void main(String[] args) {
        List<String> w = getWords("lotteryOfBabylon.txt");
        System.out.println(countUniqueWord(w));
    }
}
