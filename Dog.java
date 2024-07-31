import java.util.Comparator;

public class Dog implements Comparable<Dog> {

    private String name;
    private int size;

    public Dog(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void bark() {
        System.out.println(name + " says: bark!");
    }


    /*Returns -1 if this dog is lass than Dog ponited at by o, and so forth*/
    public int compareTo(Dog o) {
        return this.size - o.size;
    }
        /*if (this.size < otherDog.size ) {
            return -1;
        } else if (this.size == otherDog.size) {
            return 0;
        }
        return 1;*/

    private static class NameComparator implements java.util.Comparator<Dog> {
        public int compare(Dog a, Dog b){
            return a.name.compareTo(b.name);
        }
    }

    public static Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }

    /*public static int compareName(Dog a, Dog b){
        return a.name.compareTo(b.name);
    }*/
}
