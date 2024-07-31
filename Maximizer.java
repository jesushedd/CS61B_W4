public class Maximizer {
    public static Comparable max(Comparable[] items){
        int maxDex = 0;
        for (int i = 0; i < items.length ; i++) {
            if (items[i].compareTo(items[maxDex]) > 0){
                maxDex = i;
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Elyse", 3), new Dog("Sture", 9), new Dog("Artemesies", 15)};

        Dog maxDog = (Dog) Maximizer.max(dogs);
        maxDog.bark();
    }
}
