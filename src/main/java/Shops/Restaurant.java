package Shops;

public class Restaurant extends FoodShop{

    public Restaurant(String name, int yearOpened) {
        super(name, yearOpened);
    }

    @Override
    public String greeting() {
        return "Lovely meals here!";
    }
}
