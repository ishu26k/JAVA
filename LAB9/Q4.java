/*
Write a Java class which has a method called ProcessInput(). This method
checks the number entered by the user. If the entered number is negative then throw
an user defined exception called NegativeNumberException, otherwise it displays the
double value of the entered number.
 */
package lab.pkg9;

import java.util.*;

class NegativeNumberException extends Exception {

    @Override
    public String toString() {
        return "Entered number cannot be Negative";
    }
}

public class Q4 {

    static void ProcessInput() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int a = sc.nextInt();
        if (a < 0) {
            throw new NegativeNumberException();
        } else {
            System.out.println("Doube of entered no. is : " + 2 * a);
        }
    }

    public static void main(String[] args) {
        try {
            ProcessInput();
        } catch (NegativeNumberException e) {
            System.out.println(e);
        }
    }

}