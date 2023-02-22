package edu.bu.met.cs665.machine;

/**
 * This class defines a type of drink, tea, it includes some common features of different kinds of tea.
 * This class can reduce duplicated code, because any tea with common characteristics can extend this class.
 */
public abstract class Tea implements Drink {
    private double basePrice;

    @Override
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

}
