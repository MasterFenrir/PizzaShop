package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by wessel on 21-9-2015.
 */
public class PriceMultipier {
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
        return round(price, 2);
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
