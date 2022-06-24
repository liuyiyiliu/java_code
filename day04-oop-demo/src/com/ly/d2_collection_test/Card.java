package com.ly.d2_collection_test;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月01日 22:45
 */
public class Card {
    private String size;
    private String color;
    private int  index;

    public Card() {
    }

    public Card(String size, String color, int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return color + size;
    }
}
