package Shops;

import HighStreet.FoodCourt;

public class Pub extends FoodShop implements SellsAlcohol {

    public Pub(String name, int yearOpened) {
        super(name, yearOpened);
    }

    @Override
    public String greeting() {
        return "The game is playing on the TV!";
    }

    @Override
    public String offerDrink() {
        return "Fancy a pint of beer?";
    }

    public String offerDrink(String drink) {
        return "Fancy a pint of " + drink + "?";
    }
}
