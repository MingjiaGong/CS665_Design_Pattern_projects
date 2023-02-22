package edu.bu.met.cs665.machine;

/**
 * This class defines a type of drink, coffee, it includes some common features of different kinds of coffee.
 * This class can reduce duplicated code, because any coffee with common characteristics can extend this class.
 */
public abstract class Coffee implements Drink {
    private double basePrice;
    private int milk;
    private double milkPrice = 0.5;
    private int sugar;
    private double sugarPrice = 0.1;

    public Coffee() {

    }

    /**
     * Add one unit milk to coffee,up to 3 unit.
     */
    public void addMilk() {
        if (milk <= 2) {
            this.milk++;
            System.out.println("Add milk successfully.");
        } else {
            System.out.println("No more than three unit milk can be added.");
        }
    }

    /**
     * Add n unit milk to coffee,up to 3 unit.
     *
     * @param n The unit of milk user want to add.
     */
    public void addMilk(int n) {
        if (n <= 3) {
            this.milk = n;
            System.out.println("Add milk successfully.");
        } else {
            this.milk = 3;
            System.out.println("3 unit milk added successfully, no more than three unit milk can be added.");
        }
    }

    /**
     * Add one unit sugar to coffee,up to 3 unit.
     */
    public void addSugar() {
        if (sugar <= 2) {
            this.sugar++;
            System.out.println("Add sugar successfully.");
        } else {
            System.out.println("No more than three unit sugar can be added.");
        }
    }

    /**
     * Add n unit sugar to coffee,up to 3 unit.
     *
     * @param n The unit of sugar user want to add.
     */
    public void addSugar(int n) {
        if (n <= 3) {
            this.sugar = n;
            System.out.println("Add sugar successfully.");
        } else {
            this.sugar = 3;
            System.out.println("3 unit sugar added successfully, no more than three unit sugar can be added.");
        }
    }

    @Override
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }


    @Override
    public double getPrice() {
        return basePrice + milkPrice * milk + sugarPrice * sugar;
    }
}
