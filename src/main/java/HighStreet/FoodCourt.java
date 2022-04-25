package HighStreet;

import Shops.FoodShop;
import Shops.Shop;

public class FoodCourt extends HighStreet{
    public FoodCourt(String name, String city, int busStops) {
        super(name, city, busStops);
    }

    public void addShop(FoodShop foodshop) {
        shops.add(foodshop);
    }

    public void removeShop(FoodShop foodshop) {
        if (shops.contains(foodshop)) {
            shops.remove(foodshop);
        }
    }
}
