package decorator;

public class Main {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("Cafe TN số 1 VN ");
        b = new Milk("Sữa đàn ông ",b);
        b = new Milk("Sữa ông Cường ",b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
