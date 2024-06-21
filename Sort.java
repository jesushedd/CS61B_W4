public class Sort {
    public static void sort(String[] words){
        //Find the smallest item
        //Move it to the front
        // Selection sort the rest
        /*int smallest = findSmallest(words);
        if (smallest == (words.length - 1)){
            return;
        }
        swap(words, 0, smallest);
        sort(words);*/
        sort(words, 0);
    }

    /*Sorts an array "x" starting at position start*/
    private static void sort(String[] x, int start){
        if (start == x.length ){
            return;
        }
        //Find the smallest item
        int smallestIndex = findSmallest(x, start);
        //Move it to the front
        swap(x, start, smallestIndex );
        // Selection sort the rest
        sort(x , start + 1);
    }
    /* Return the smallest string in x*/
    public static int findSmallest(String[] x, int start){
        int smallestIndex = start;
        for (int i = start; i < x.length ; i++) {
            if (x[i].compareToIgnoreCase(x[smallestIndex]) < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /*Swap item ath with bth */
    public static void swap(String[] strArray, int a, int b){
        String tmp = strArray[a];
        strArray[a] = strArray[b];
        strArray[b] = tmp;
    }
}
