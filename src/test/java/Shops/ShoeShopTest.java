package Shops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoeShopTest {

    private ShoeShop shoeshop;

    @BeforeEach
    void setUp () {
        shoeshop = new ShoeShop("Clarks", 2006);
    }

    @Test
    void greeting() {
        assertEquals("Buy shoes here!", shoeshop.greeting());
    }
}