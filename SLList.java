public class SLList<Blob> implements List61B<Blob>{
    private static class StuffNode<Stuff>{
    
        /*Instance variables */
        public Stuff item;
        public StuffNode<Stuff> next;
        
        
        /*Constructor for IntNode */
        public StuffNode(Stuff i, StuffNode<Stuff> r){
            item = i;
            next = r; 
        }
    }   
    //public int item;
    // made it private to no mess with implementation from other classes
    /*tHE FIRST ITEM IS AT SENTINEL.next */
    public int size = 0;
    private final StuffNode<Blob> sentinel;

    public SLList(Blob x){
        sentinel = new StuffNode<>(null, null);
        sentinel.next = new StuffNode<>(x, null);
        size = 1;
    }

    public SLList(){
        size = 0;
        sentinel = new StuffNode<>(null, null);
    }

    /*Adds an item to start of the list */
    public void addFirst(Blob num){
        sentinel.next = new StuffNode<Blob>(num, sentinel.next);
        size++;
    }

    /*Gets the first item in the list */
    public Blob getFirst(){
        return sentinel.next.item;
    }

    /*Gets las item in the list */
    public void addLast(Blob num){
        StuffNode<Blob> cursor = sentinel;
        //Reach the last element of the list
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        //Add the item to that found.next end of the list
        cursor.next = new StuffNode<Blob>(num, null);
        size++;
    }

    /*Print all items in list */
    public void printList(){
        StuffNode<Blob> cursor = sentinel.next;
        while (cursor != null) {
            System.out.println(cursor.item);
            cursor = cursor.next ;
        }
    }


    /*Helper method for recursive size */
    private  int size(StuffNode<Blob> list){
        if (list.next == null) {
            return 1;
        }
        return 1 + size(list.next);
    }

    /*Get size of the list 
    public int size(){
        IntNode cursor = this.first;
        int s = 0;
        //Look for end of list 
        while (cursor != null) {
            s++;
            cursor = cursor.next;
        }
        return s;
    }*/
    // Get size of list using recursive helper method
    public int size(){
        return size(this.sentinel.next);
    }

    /*Recursive helper get method, returns nth item*/
    private Blob get(StuffNode<Blob> node , int n){
        if (n == 0){
            return node.item;
        }
        return get(node.next, n - 1);
    }
    /*Returns nth item*/
    public Blob get(int n){
        return  get(sentinel.next, n );

    }

    public Blob getLast(){
        return get(this.size()-1);
    }

    public Blob removeLast(){
        //get to second to last  node
        StuffNode<Blob> cursor = sentinel.next;
        if (cursor.next == null){
            return cursor.item;
        }
        while (cursor.next.next != null) {
            cursor = cursor.next;
        }
        //save that last node
        StuffNode<Blob> lastNode = cursor.next;

        //delete last node, make the second to node item, the new last node
        cursor.next = null;
        //return last item
        return lastNode.item;
    }


    public static void main(String[] args) {
        /*Crates a list of one integer, 10 */
        SLList<String> A = new SLList<String>();
        A.printList();
        SLList<String> L = new SLList<>("70");
        L.addFirst("60");
        L.addFirst("40");
        L.addLast("80");
        //System.out.println(L.getFirst());
        L.printList();
        System.out.println("size of shis list is: " + L.size());
        System.out.println("size of shis list is (USING FASTER METHOD): " + L.size);
        System.out.println(L.get(1));



    }


}
