public class Adt {

    public static void main(String[] args) {
        Couner c1 = new Couner("fisrt counter");
        c1.increment();
        c1.increment();
        System.out.println(c1.toString());
    }
}
