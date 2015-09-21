package com.company;

/**
 * Created by Sander on 21-9-2015.
 */
public abstract class ToppingDecorator implements Pizza {

    // The pizza to add components to
    protected Pizza tempPizza;

    /**
     * Create a new pizza with a given pizza as base
     *
     * @param newPizza The base pizza
     */
    public ToppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }

    /**
     * Get the description of the pizza
     * @return The description
     */
    public String getDescription() {
        return tempPizza.getDescription();
    }

    /**
     * Get the cost
     * @return The cost
     */
    public double getCost() {
        return tempPizza.getCost();
    }

    /**
     * Get the size
     * @return The size, S, M or L.
     */
    public String getSize(){
        return tempPizza.getSize();
    }

    /**
     * Set the size, S, M or L.
     * @param size
     */
    public void setSize(String size){
        tempPizza.setSize(size);
    }
}
