public interface List61B<item> {

    /*Inserts   X into the back of the list */
    public void addLast(item x);


    /*Returns intem from the back of the list */
    public item getLast();

    /*Gets the ith in the list (0 is the front) */
    public item  get(int i);

    /*Returns size of the list */
    public int size();

    /*Remove and return last item*/

}