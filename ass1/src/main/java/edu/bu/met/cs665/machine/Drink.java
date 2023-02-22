package edu.bu.met.cs665.machine;

/**
 * This class is to represent different kinds of drink.
 */
public interface Drink {
    /**
     * To set base price;
     *
     * @param basePrice The new base price of drink.
     */
    void setBasePrice(double basePrice);

    /**
     * To get the price of a drink.
     *
     * @return The price of a drink.
     */
    double getPrice();
}
