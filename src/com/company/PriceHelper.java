package com.company;

public class PriceHelper {

    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(
                new Mozzarella(
                        new PlainPizza()));

        basicPizza.setSize("S");
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());

        basicPizza.setSize("L");
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
    }
}
