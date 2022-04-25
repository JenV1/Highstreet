package HighStreet;

import Shops.Bakery;
import Shops.ClothesShop;
import Shops.Restaurant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodCourtTest {

    FoodCourt foodCourt;
    Bakery bakery;
    Restaurant restaurant;

    @BeforeEach
    void SetUp() {
        foodCourt = new FoodCourt("Food Everywhere", "Birmingham", 5);
        bakery = new Bakery("Sally's buns", 1450, true);
        restaurant = new Restaurant("Planet Pizza", 2015);
    }

    @Test
    void canAddShop() {
        foodCourt.addShop(bakery);
        assertTrue(foodCourt.getShops().contains(bakery));
    }

    @Test
    void canRemoveShop() {
        foodCourt.addShop(bakery);
        foodCourt.addShop(restaurant);
        foodCourt.removeShop(bakery);
        foodCourt.removeShop(restaurant);
        assertEquals(0, foodCourt.countShops());
    }
}