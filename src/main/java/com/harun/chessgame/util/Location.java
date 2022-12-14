package com.harun.chessgame.util;

public class Location {
    private int x;
    private int y;

    public Location(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "X : " + x + "\n" + "Y : " + y + "\n";
    }
}
