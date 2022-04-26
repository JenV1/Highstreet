package Shops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeasureTest {
    
    ShoeShop shoeshop;
    ClothesShop clothesshop;
    
    @BeforeEach
    void setUp () {
        shoeshop = new ShoeShop("Adidas", 2005);
        clothesshop = new ClothesShop("H&M", 1500);
    }

    @Test
    void measureClothesShop() {
        assertEquals("Let's see what size you are!", clothesshop.measure());
    }

    @Test
    void measureShoeShop() {
        assertEquals("I have the tape measure ready for your foot!", shoeshop.measure());
    }
}
