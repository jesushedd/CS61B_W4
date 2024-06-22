public class GenAList <Blob> implements List61B<Blob>{
    private int size;
    private Blob[] items;
    private int capacity;

    /*  Invariants
     * addLast: The next item we want to add, will go into position size
     * getLast: The item we want to return is at position size -1 
     * size: The number of items in the list
     */

    /*Creates an empty list */
    public GenAList(int capacity){
        items = (Blob[]) new Object[capacity];
        updateCapacity();
        size = 0;
    }

    /*Get capacity of list */
    public int capacity(){
        return capacity;
    }

    /*Update capacity */
    private void updateCapacity(){
        capacity = items.length;
    }

    /*Helper method for resizing array */
    private void resize(int newCapacity){
        Blob[] moreItems = (Blob[]) new Object[newCapacity];
        System.arraycopy(items, 0, moreItems, 0, size);
        items = moreItems;
        updateCapacity();  
    }

    /*Inserts   X into the back of the list */
    public void addLast(Blob x){
        if (size == items.length){
            resize(size + 1);
        }
        items[size] = x;
        size += 1;
    }

    /*Returns intem from the back of the list */
    public Blob getLast(){
        return items[size - 1];
    }

    /*Gets the ith in the list (0 is the front) */
    public Blob  get(int i){
        return items[i];
    }

    /*Returns size of the list */
    public int size(){
        return size;
    }

    /*Remove and return last item*/
    public Blob removeLast(){
        Blob toReturn = items[size - 1];
        items[size -1 ]= null;
        size -= 1;
        return toReturn;
    }
}
