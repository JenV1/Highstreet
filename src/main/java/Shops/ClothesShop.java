package Shops;

import java.util.ArrayList;

public class ClothesShop extends Shop implements MeasuresPerson{

    private ArrayList<String> brands;

    public ClothesShop(String name, int yearOpened) {
        super(name, yearOpened);
        this.brands = new ArrayList<>();
    }

    @Override
    public String greeting() {
        return "Get your outfit here!";
    }

    public ArrayList<String> getBrands() {
        return brands;
    }

    public void setBrands(ArrayList<String> brands) {
        this.brands = brands;
    }

    @Override
    public String measure() {
        return "Let's see what size you are!";
    }
}
