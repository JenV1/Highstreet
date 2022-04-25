package HighStreet;

import Shops.Bakery;
import Shops.ClothesShop;
import Shops.ShoeShop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllShopsTest {
    
    Bakery bakery;
    ClothesShop clothesshop;
    ShoeShop shoeshop;
    AllShops bentalls;
    
    @BeforeEach 
    void setUp () {
        bakery = new Bakery("Yummy", 1984, true);
        clothesshop = new ClothesShop("Gucci", 2000);
        shoeshop = new ShoeShop("Nike", 1985);
        bentalls = new AllShops("Bentalls", "Kingston", 10);
    }

    @Test
    void canAddShops() {
        bentalls.addShop(bakery);
        assertTrue(bentalls.getShops().contains(bakery));
    }

    @Test
    void canCountShops() {
        bentalls.addShop(bakery);
        bentalls.addShop(clothesshop);
        bentalls.addShop(shoeshop);
        assertEquals(3, bentalls.countShops());
    }

    @Test
    void canMakePark() {
        bentalls.makePark();
        assertTrue(bentalls.isHasPark());
    }

    @Test
    void canRemovePark() {
        bentalls.makePark();
        bentalls.closePark();
        assertFalse(bentalls.isHasPark());
    }

    @Test
    void canRemoveShop() {
        bentalls.addShop(bakery);
        bentalls.addShop(clothesshop);
        bentalls.addShop(shoeshop);
        bentalls.removeShop(shoeshop);
        assertFalse(bentalls.getShops().contains(shoeshop));
    }
}