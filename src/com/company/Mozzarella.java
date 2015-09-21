package com.company;

/**
 * Created by Sander on 21-9-2015.
 */
public class Mozzarella extends ToppingDecorator {

    /**
     * Construct a mozzarella pizza
     *
     * @param newPizza
     */
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
        return PriceHelper.round(
                tempPizza.getCost() + PriceHelper.getPrice(this.getSize(), 0.50)
                , 2);
    }
}
