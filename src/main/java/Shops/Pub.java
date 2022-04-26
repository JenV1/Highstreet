package Shops;

import HighStreet.FoodCourt;

public class Pub extends FoodShop implements SellsAlcohol {

    enum Game {
        FOOTBALL,
        CRICKET,
        RUGBY
    }

    Game gameOn;

    public void changeGameToCricket() {
        gameOn = Game.CRICKET;
    }

    public void changeGameToRugby() {
        gameOn = Game.RUGBY;
    }

    public void changeGameToFootball() {
        gameOn = Game.FOOTBALL;
    }

    public Game getGameOn() {
        return gameOn;
    }

    public void setGameOn(Game gameOn) {
        this.gameOn = gameOn;
    }

    public Pub(String name, int yearOpened) {
        super(name, yearOpened);
        this.gameOn = Game.FOOTBALL;
    }

    @Override
    public String greeting() {
        switch (gameOn) {
            case RUGBY:
                return "The rugby is on if you want to watch something boring!";
            case CRICKET:
                return "They're throwing a ball on that screen there!";
            case FOOTBALL:
                return "The football is on and everyone is angry.";
        }
        return null;
    }

    @Override
    public String offerDrink() {
        return "Fancy a pint of beer?";
    }

    public String offerDrink(String drink) {
        return "Fancy a pint of " + drink + "?";
    }
}
