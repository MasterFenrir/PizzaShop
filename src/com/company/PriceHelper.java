package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by wessel on 21-9-2015.
 * Class to help with price calculations
 */
public class PriceHelper {

    /**
     * Get the price for a component based on the given size
     *
     * @param size  The size
     * @param price The default price
     * @return
     */
    public static double getPrice(String size, double price){
        double result = price;
        switch (size){
            case "S":
                result *= 0.7;
                break;
            case "s":
                result *= 0.7;
                break;
            case "L":
                result *= 1.4;
                break;
            case "l":
                result *= 1.4;
            default:
                break;
        }
        return round(result, 2);
    }

    /**
     * Round a value to a given amount of places
     * @param value The value to round
     * @param places The amount of numbers after the decimal point
     * @return The rounded value
     */
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
