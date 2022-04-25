package Shops;

public class Bakery extends FoodShop{

    boolean eatIn;

    public boolean isEatIn() {
        return eatIn;
    }

    public void setEatIn(boolean eatIn) {
        this.eatIn = eatIn;
    }

    public Bakery(String name, int yearOpened, boolean eatIn) {
        super(name, yearOpened);
        this.eatIn = eatIn;
    }

    @Override
    public String greeting() {
        return "Bread and cakes here at " + name + "!";
    }

    public String freeSample() {
        return "Try this brownie!";
    }
}
