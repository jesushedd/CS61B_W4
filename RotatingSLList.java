public class RotatingSLList<item> extends SLList<item>{

    /**TODO : implement RotatingSLList such that code compiles and outputs correct result
     */

    public void rotateRight(){
        item x = removeLast();
        addFirst(x);
    }

    public static void main(String[] args) {
        RotatingSLList<Integer> rs1 = new RotatingSLList<>();
        /*Creates SList: [10, 11, 12, 13]*/
        rs1.addLast(10);
        rs1.addLast(11);
        rs1.addLast(12);
        rs1.addLast(13);

        /*Should be [13, 10, 11, 12]*/
        rs1.rotateRight();
        rs1.printList();
    }

}
