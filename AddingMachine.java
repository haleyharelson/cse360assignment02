package cse360assignment02;

/**
 * This class represents an arithmetic calculator that performs add,
 * subtract, getTotal, and clear methods.
 */

public class AddingMachine {

    /**
     * Instance variable total to represent the total amount
     */
    private int total;

    private String history="0";

    /**
     * Default constructor
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    /**
     * Method to get current total
     * @return total
     */
    public int getTotal () {
        return total;
    }

    /**
     * Method to add value to total
     * @param value
     */
    public void add (int value) {
        total += value;
        history += " + " + value;
    }

    /**
     * Method to subtract value from total
     * @param value
     */
    public void subtract (int value) {
        total -= value;
        history += " - " + value;
    }

    /**
     * Method to return history of the adding machine's computations
     * @return history
     */
    public String toString () {
        return history;
    }

    /**
     * Method to "clear" the adding machine's memory
     */
    public void clear() {
        history = "0";
    }

}
