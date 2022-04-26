package Shops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    private Restaurant restaurant;

    @BeforeEach
    void SetUp () {
        restaurant = new Restaurant("Pizzahut", 2000);
    }

    @Test
    void greeting() {
        assertEquals("Lovely meals here!", restaurant.greeting());

    }
}