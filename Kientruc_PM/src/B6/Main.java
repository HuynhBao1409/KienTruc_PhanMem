package B6;

public class Main {
    public static void main(String[] args) {
        BNode b = new Leaft(3);
        BNode b2 = new Leaft(7);
        BNode b3 = new Leaft(5);
        BNode b4 = new Leaft(9);
        b.addR(b2);
        b2.addL(b3);

        System.out.println(b.duyet());
    }
}
