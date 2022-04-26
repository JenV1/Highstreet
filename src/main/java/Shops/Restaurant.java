package Shops;

public class Restaurant extends FoodShop implements SellsAlcohol{

    public Restaurant(String name, int yearOpened) {
        super(name, yearOpened);
    }

    @Override
    public String greeting() {
        return "Lovely meals here!";
    }

    @Override
    public String offerDrink() {
        return "Fancy a glass of wine with your meal?";
    }
}
