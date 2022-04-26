package Shops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PubTest {

    Pub pub;
    Restaurant restaurant;

    @BeforeEach
    void setUp() {
        pub = new Pub("The Royal Oak", 1850);
        restaurant = new Restaurant("Zizi's", 2010);
    }

    @Test
    void offerDrinkInPub_no_args() {
        assertEquals("Fancy a pint of beer?", pub.offerDrink());
    }

    @Test
    void offerDrinkInPub_with_args() {
        assertEquals("Fancy a pint of wine?", pub.offerDrink("wine"));
    }

    @Test
    void offerDrinkInRestaurant() {
        assertEquals("Fancy a glass of wine with your meal?", restaurant.offerDrink());
    }
}