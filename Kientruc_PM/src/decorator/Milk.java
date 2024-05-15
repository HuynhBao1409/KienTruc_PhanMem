package decorator;

public class Milk extends CondimentDecorator{
    public Milk(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return 2 + beverage.cost();
    }
}
