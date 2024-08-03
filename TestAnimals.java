public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal("Pluto", 10);
        Cat c = new Cat("Garfield", 6);
        Dog2 d = new Dog2("Fido", 4);

        a.greet(); // Animal Pluto says huh
        c.greet(); // Cat Garfield says meow
        d.greet(); //Dog Fido says WOOF!
        a = c;
        ((Cat) a).greet(); // Cat Pluto says meow
        a.greet(); //Animal Pluto says meow

        a = new Dog2("Spot", 10);
        //d = a; // A Dog is an Animal but an Animal is not a Dog,   willFAIL
        //Fix
        d = (Dog2) a;

    }
}

