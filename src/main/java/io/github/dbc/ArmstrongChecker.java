package io.github.dbc;

public class ArmstrongChecker {
    /**
     * This method checks if the given number is an Armstrong number.
     * An Armstrong number is a number that is the sum of its own digits raised to the power of the number of digits.
     * Example, Armstrong number: 153 (number of digits is 3) <br>
     * 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153. <br>
     *
     * @param number the number to be checked.
     * @return true if the number is an Armstrong number, false otherwise.
     */
    public boolean isArmstrong(int number) {

        int remainder;
        int sum = 0;
        int armstrong = number;//assigning the number to another variable
        boolean isArmstrong = false;// declaring and initializing the boolean value
        if (number < 0) {// checks if number is negative
            isArmstrong = false;
        } else {
            while (number != 0) {// loop for the armstrong
                remainder = number % 10;
                sum = sum + (remainder * remainder * remainder);
                number = number / 10;
            }
            if (sum == armstrong) {// check if the sum of number is equal to the input
                isArmstrong = true;
            } else {
                isArmstrong = false;
            }
        }
        return isArmstrong;
    }
}
