public class WordUtils {
    /*Find the longest String from a List* of Strings*/
    public static String longest(List61B<String> list){
        int maxIdx = 0;
        for (int i = 0; i < list.size(); i++) {
            String longestString = list.get(maxIdx);
            String thisString = list.get(i);
            if (thisString.length() > longestString.length()){
                maxIdx = i;
            }
        }
        return list.get(maxIdx);
    }

    public static void main(String[] args) {
        GenAList<String> mylist = new GenAList<>(5);
        mylist.addLast("hola");
        mylist.addLast("munda");
        mylist.addLast("que");
        mylist.addLast("hacess");
        System.out.println(longest(mylist));
    }
}