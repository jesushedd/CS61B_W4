public class VengefulSSList <Item> extends SLList<Item>{

    SLList<Item> lostItems = new SLList<>();


    @Override
    public Item removeLast(){
        Item lastItem = super.removeLast();
        lostItems.addLast(lastItem);
        return lastItem;
    }

    /*Print deletes items*/
    public void printLostItems(){
        lostItems.printList();

    }


    public static void main(String[] args) {
        VengefulSSList<Integer> vs1 = new VengefulSSList<>();
        vs1.addLast(1);
        vs1.addLast(5);
        vs1.addLast(10);
        vs1.addLast(13);
        // vs1 is now: [1, 5, 10, 13]

        vs1.removeLast();
        vs1.removeLast();
        //after deletion vs1 is: [1, 5]

        //should proint out the numbers of the fallen, namely 10 and 13
        System.out.print("the fallen are:\n");
        vs1.printLostItems();
    }
}