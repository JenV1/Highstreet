package HighStreet;

import Shops.Shop;

import java.util.ArrayList;

public abstract class HighStreet {
    private  String name;
    protected ArrayList<Shop> shops;
    private String city;
    private boolean hasPark;
    private int busStops;

    public HighStreet(String name, String city, int busStops) {
        this.name = name;
        this.shops = new ArrayList<>();
        this.city = city;
        this.hasPark = false;
        this.busStops = busStops;
    }

    public int countShops() {
        return shops.size();
    }

    public void makePark() {
        hasPark = true;
    }

    public void closePark(){
        hasPark = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Shop> getShops() {
        return shops;
    }

    public void setShops(ArrayList<Shop> shops) {
        this.shops = shops;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isHasPark() {
        return hasPark;
    }

    public void setHasPark(boolean hasPark) {
        this.hasPark = hasPark;
    }

    public int getBusStops() {
        return busStops;
    }

    public void setBusStops(int busStops) {
        this.busStops = busStops;
    }
}
