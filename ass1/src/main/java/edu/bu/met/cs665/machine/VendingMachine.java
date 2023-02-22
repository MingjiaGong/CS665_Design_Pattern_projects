package edu.bu.met.cs665.machine;

import java.util.Scanner;

/**
 * This class simulates the process of a user buying a drink from a vending machine.
 * User can choose different kinds of drink and input 'Checkout' to buy drink.
 * User can input 'Cancel' to cancel a purchase.
 */
public class VendingMachine {
    private double totalPrice;

    public VendingMachine() {
    }

    /**
     * To start simulating the process of a user buying different amounts of drinks from a vending machine.
     */
    public void startPurchasing() {
        String drink = "";
        while (!drink.equals("Checkout") && !drink.equals("Cancel")) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Choose the following drink, or input 'Checkout' to purchase, or input 'Cancel' to cancel this purchase.");
            System.out.println("Espresso(2 USD), Americano(3 USD), Latte Macchiato(4 USD), Black Tea(2 USD), Green Tea(3 USD), Yellow Tea(4 USD).");
            drink = myObj.nextLine();
            this.buyOneDrink(drink);
        }

    }

    /**
     * Simulate a certain action performed by the user.
     * @param drink
     */
    private void buyOneDrink(String drink) {
        switch (drink) {
            case "Espresso":
                Coffee espresso = new Espresso();

                int espressoSL = this.chooseSugarLevel();
                if (espressoSL < 0) break;
                else espresso.addSugar(espressoSL);

                int espressoML = this.chooseMilkLevel();
                if (espressoML < 0) break;
                else espresso.addMilk(espressoML);

                totalPrice += espresso.getPrice();
                System.out.println("Prise: " + espresso.getPrice());
                break;
            case "Americano":
                Coffee americano = new Americano();

                int americanoSL = this.chooseSugarLevel();
                if (americanoSL < 0) break;
                else americano.addSugar(americanoSL);

                int americanoML = this.chooseMilkLevel();
                if (americanoML < 0) break;
                else americano.addMilk(americanoML);

                totalPrice += americano.getPrice();
                System.out.println("Prise: " + americano.getPrice());
                break;
            case "Latte Macchiato":
                Coffee latteMacchiato = new LatteMacchiato();

                int latteMacchiatoSL = this.chooseSugarLevel();
                if (latteMacchiatoSL < 0) break;
                else latteMacchiato.addSugar(latteMacchiatoSL);

                int latteMacchiatoML = this.chooseMilkLevel();
                if (latteMacchiatoML < 0) break;
                else latteMacchiato.addMilk(latteMacchiatoML);

                totalPrice += latteMacchiato.getPrice();
                System.out.println("Prise: " + latteMacchiato.getPrice());
                break;
            case "Black Tea":
                Tea black = new BlackTea();
                totalPrice += black.getPrice();
                System.out.println("Prise: " + black.getPrice());
                break;
            case "Green Tea":
                Tea green = new GreenTea();
                totalPrice += green.getPrice();
                System.out.println("Prise: " + green.getPrice());
                break;
            case "Yellow Tea":
                Tea yellow = new YellowTea();
                totalPrice += yellow.getPrice();
                System.out.println("Prise: " + yellow.getPrice());
                break;
            case "Checkout":
                System.out.println("Total Prise: " + totalPrice);
                System.out.println("Purchase successfully.");
                break;
            case "Cancel":
                System.out.println("Purchase canceled.");
                break;
            default:
                System.out.println("There is no such drink.");

        }

    }

    /**
     * Determine if the input sweetness value entered by the user matches the rules
     * @return   sugar level
     */
    private int chooseSugarLevel() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please select the level of sweetness (up to 3 levels, each unit 0.1 USD)");
        String sl = myObj.nextLine();
        if (!isDigit(sl)) {
            System.out.println("Error, please try again");
            return -1;
        }
        //System.out.println();
        return Integer.parseInt(sl);

    }

    /**
     * Determine if the input milk level value entered by the user matches the rules
     * @return   milk level
     */
    private int chooseMilkLevel() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please select the level of milk (up to 3 levels, each unit 0.5 USD)");
        String sl = myObj.nextLine();
        if (!isDigit(sl)) {
            System.out.println("Error, please try again");
            return -1;
        }
        //System.out.println();
        return Integer.parseInt(sl);

    }

    /**
     * Determine if the input value entered by the user is Digit.
     * @param str   The input value entered by the user
     * @return     If str is Digit.
     */
    private boolean isDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
