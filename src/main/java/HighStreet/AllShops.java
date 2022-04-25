package HighStreet;

import Shops.FoodShop;
import Shops.Shop;

public class AllShops extends HighStreet{

    public AllShops(String name, String city, int busStops) {
        super(name, city, busStops);
    }

    public void addShop(Shop shop) {
        shops.add(shop);
    }

    public void removeShop(Shop shop) {
        if (shops.contains(shop)) {
            shops.remove(shop);
        }
    }


}
