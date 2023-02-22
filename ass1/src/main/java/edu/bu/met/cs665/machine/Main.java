package edu.bu.met.cs665.machine;

import org.apache.log4j.Logger;

/**
 * Name: Mingjia Gong
 * Course: CS-655 Software Designs & Patterns
 * Date:02/02/2023
 * File Name: Main.java
 * Description: This project simulates the process of a user buying a drink from a vending machine.
 *  User can choose different amount and different kinds of drink, then input 'Checkout' to buy drinks.
 *  User can input 'Cancel' to cancel a purchase.
 */
public class Main {

    //private static Logger logger = Logger.getLogger(Main.class);


    // Let us create an object of the Main class.
    //edu.bu.met.cs665.Main m = new edu.bu.met.cs665.Main();

    /**
     * A main method to run project.
     *
     * @param args not used
     */
    public static void main(String[] args) {

        // This configuration is for setting up the log4j properties file.
        // It is better to set this using java program arguments.
        // PropertyConfigurator.configure("log4j.properties");

        // Let us create an object of the Main class.
        Main m = new Main();

        VendingMachine vm = new VendingMachine();
        vm.startPurchasing();


        //logger.info(m.doIt());
//    logger.trace("Trace Message!");
//    logger.debug("Debug Message!");
//    logger.info("Info Message!");
//    logger.warn("Warn Message!");
//    logger.error("Error Message!");
//    logger.fatal("Fatal Message!");

    }

}
