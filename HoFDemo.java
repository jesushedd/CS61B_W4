
/*
* Demonstrates higher order function in java*/
public class HoFDemo {
    public static int do_twice(IntUnaryFunction f, int x){
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        int x = 2;

        IntUnaryFunction tenSex = new TenX();

        System.out.println(do_twice(tenSex, x));

    }
}
