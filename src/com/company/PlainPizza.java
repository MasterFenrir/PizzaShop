package com.company;

/**
 * Created by Sander on 21-9-2015.
 */
public class PlainPizza implements Pizza {

    private String size;

    @Override
    public String getDescription() {
        return size + " sized pizza with thin Dough";
    }

    @Override
    public double getCost() {
        return PriceMultipier.getPrice(size, 4.00);
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }
}
