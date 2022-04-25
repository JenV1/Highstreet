package Shops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BakeryTest {

    private Bakery bakery;

    @BeforeEach
    void setUp () {
        bakery = new Bakery("Cake Place", 1999,true );
    }

    @Test
    void greeting() {
        assertEquals("Bread and cakes here at Cake Place!", bakery.greeting());
    }

    @Test
    void freeSample() {
        assertEquals("Try this brownie!", bakery.freeSample());
    }
}