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

    @Test
    void changeGameToRugby() {
        pub.changeGameToRugby();
        assertEquals(Pub.Game.RUGBY, pub.getGameOn());
    }

    @Test
    void changeGameToCricket() {
        pub.changeGameToCricket();
        assertEquals(Pub.Game.CRICKET, pub.getGameOn());
    }

    @Test
    void changeGameToFootball() {
        pub.changeGameToRugby();
        pub.changeGameToFootball();
        assertEquals(Pub.Game.FOOTBALL, pub.getGameOn());
    }

    @Test
    void pubGreetingWhenFootballOn() {
        assertEquals("The football is on and everyone is angry.", pub.greeting());
    }

    @Test
    void pubGreetingWhenCricketOn() {
        pub.changeGameToCricket();
        assertEquals("They're throwing a ball on that screen there!", pub.greeting());
    }

    @Test
    void pubGreetingWheRugbyOn() {
        pub.changeGameToRugby();
        assertEquals("The rugby is on if you want to watch something boring!", pub.greeting());
    }
}