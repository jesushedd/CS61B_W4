public class AList {
    private int size;
    private int[] items;

    /*  Invariants
     * addLast: The next item we want to add, will go into position size
     * getLast: The item we want to return is at position size -1 
     * size: The number of items in the list
     */

    /*Creates an empty list */
    public AList(){
        items = new int[100];
        size = 0;
    }

    /*Inserts   X into the back of the list */
    public void addLast(int x){
        if (size == items.length){
            int[] moreItems = new int[size + 1];
            System.arraycopy(items, 0, moreItems, 0, size);
            items = moreItems;
            return;
        }
        items[size] = x;
        size += 1;
    }

    /*Returns intem from the back of the list */
    public int getLast(){
        return items[size - 1];
    }

    /*Gets the ith in the list (0 is the front) */
    public int  get(int i){
        return items[i];
    }

    /*Returns size of the list */
    public int size(){
        return size;
    }

    /*Remove last item*/
    public void removeLast(){
        size -= 1;
    }



    
}
