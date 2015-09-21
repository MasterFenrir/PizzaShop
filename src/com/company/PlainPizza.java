package com.company;

/**
 * Created by Sander on 21-9-2015.
 */
public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
