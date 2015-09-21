package com.company;

/**
 * Created by Sander on 21-9-2015.
 * Tomato sauce component
 */
public class TomatoSauce extends ToppingDecorator {

    /**
     * Create a pizza with Tomato sauce
     *
     * @param newPizza The pizza to add tomato sauce to
     */
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
        return PriceHelper.round(
                tempPizza.getCost() + PriceHelper.getPrice(this.getSize(), 0.35)
                , 2);
    }
}
