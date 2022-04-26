package Shops;

import java.util.ArrayList;

public class ShoeShop extends Shop implements MeasuresPerson{

    public ArrayList<Integer> getSizesAvailable() {
        return sizesAvailable;
    }

    public void setSizesAvailable(ArrayList<Integer> sizesAvailable) {
        this.sizesAvailable = sizesAvailable;
    }

    private ArrayList<Integer> sizesAvailable;

    public ShoeShop(String name, int yearOpened) {
        super(name, yearOpened);
        this.sizesAvailable = new ArrayList<Integer>();
    }

    @Override
    public String greeting() {
        return "Buy shoes here!";
    }

    @Override
    public String measure() {
        return "I have the tape measure ready for your foot!";
    }
}
