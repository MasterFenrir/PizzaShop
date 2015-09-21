package com.company;

/**
 * Created by Sander on 21-9-2015.
 * Class for creating a plain pizza
 */
public class PlainPizza implements Pizza {

    // The size
    private String size;

    @Override
    public String getDescription() {
        return size + " sized pizza with thin Dough";
    }

    @Override
    public double getCost() {
        return PriceHelper.getPrice(size, 4.00);
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setSize(String size) {
        if (size.equalsIgnoreCase("s")) {
            this.size = "S";
        } else if (size.equalsIgnoreCase("m")) {
            this.size = "M";
        } else if (size.equalsIgnoreCase("l")) {
            this.size = "L";
        } else {
            this.size = "M";
        }
    }
}
