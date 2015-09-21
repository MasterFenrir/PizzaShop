package com.company;

/**
 * Created by Sander on 21-9-2015.
 */
public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Mozzarella");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return PriceMultipier.round(
                tempPizza.getCost() + PriceMultipier.getPrice(this.getSize(), 0.50)
                , 2);
    }
}
