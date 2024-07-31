import java.util.Comparator;

public class DogLauncher {
    public static void main(String[] args) { //AKA Dog Launcher
        Dog d1 = new Dog("Greca", 20);
        Dog d2 = new Dog("Zafira" , 30);
        Dog d3 = new Dog("Shira", 50);
        Dog[] dogs = {d1, d2, d3};
        System.out.println(Maximizer.max(dogs));
        Dog d = (Dog) Maximizer.max(dogs);
        d.bark();

        /*Dog.NameComparator nc = new Dog.NameComparator();
        if (nc.compare(d1, d2) > 0){
            d1.bark();
        } else {
            d2.bark();
        }*/

        Comparator<Dog> nc = Dog.getNameComparator();

        if (nc.compare(d1, d2) > 0) {
            d1.bark();
        } else d2.bark();
    }
}