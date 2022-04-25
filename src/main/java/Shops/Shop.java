package Shops;

import java.util.ArrayList;

public abstract class Shop {
    protected String name;
    private int yearOpened;
    private ArrayList<String> productNames;
    private boolean open;

    public Shop(String name, int yearOpened) {
        this.name = name;
        this.yearOpened = yearOpened;
        this.productNames = new ArrayList<>();
        this.open = false;
    }

    public abstract String greeting();

    public int countProducts() {
        return productNames.size();
    }

    public void addProduct(String product) {
        productNames.add(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOpened() {
        return yearOpened;
    }

    public void setYearOpened(int yearOpened) {
        this.yearOpened = yearOpened;
    }

    public ArrayList<String> getProductNames() {
        return productNames;
    }

    public void setProductNames(ArrayList<String> productNames) {
        this.productNames = productNames;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
