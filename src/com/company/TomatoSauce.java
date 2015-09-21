package com.company;

/**
 * Created by Sander on 21-9-2015.
 */
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Tomate sauce");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato sauce";
    }

    @Override
    public double getCost() {
        return PriceMultipier.round(
                tempPizza.getCost() + PriceMultipier.getPrice(this.getSize(), 0.35)
                , 2);
    }
}
