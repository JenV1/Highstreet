package Shops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClothesShopTest {

    private ClothesShop clothesShop;

    @BeforeEach
    void setUp() {
        clothesShop = new ClothesShop("Primark", 2002);
    }

    @Test
    void greeting() {
        assertEquals("Get your outfit here!", clothesShop.greeting());
    }
}