package interator;

public class Main {
    public static void main(String[] args) {
        ArrayCollection ar = new ArrayCollection();
        Iterator in = ar.createItertor();
        Object el = in.first();
        while (el != null) {
            System.out.println(el);
            el = in.next();
        }
        System.out.println(in.current());
    }
}
