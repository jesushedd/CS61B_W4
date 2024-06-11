

public class Launcher {
    public static void main(String[] args) {
        int myCapacity = 5;
        AList myList = new AList(myCapacity);
        
        /*Fill my list */
        for (int i = 1; i <= myList.capacity(); i++) {
            myList.addLast(i);
        }

        System.out.println("size of list: " + myList.size());
        System.out.println("capacity of list: " + myList.capacity());
        if (myList.size() == myList.capacity()) {
            System.out.println("Oh it's filled up");
        }

        myList.addLast(99);
        System.out.println("size of list: " + myList.size());
        System.out.println("new capacity of list: " + myList.capacity());
        if (myList.size() == myList.capacity()) {
            System.out.println("Oh it's filled up again");
        }

        myList.addLast(42);
        System.out.println("size of list: " + myList.size());
        System.out.println("new capacity of list: " + myList.capacity());
        if (myList.size() == myList.capacity()) {
            System.out.println("And again!");
        }

        
    }
}
