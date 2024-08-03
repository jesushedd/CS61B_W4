public class Dog2 extends Animal {
    public Dog2(String name, int age){
        super(name, age);
        this.noise = "Woof!";
    }

    @Override
    public void greet(){
        System.out.println("Dog " + name + " says: " + makeNoise());
    }

    public void playFetch() {
        System.out.println("Fetch, " + name + "!");
    }
}
