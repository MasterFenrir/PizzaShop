package com.company;

/**
 * Created by Sander on 21-9-2015.
 * An interface for creating pizza
 */
public interface Pizza {

    /**
     * Get the description
     *
     * @return
     */
    String getDescription();

    /**
     * Get the cost
     * @return
     */
    double getCost();

    /**
     * Get the size
     * @return
     */
    String getSize();

    /**
     * Set the size
     * @param size
     */
    void setSize(String size);

}
