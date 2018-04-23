package RealNumber;

import javax.swing.*;

public class SmallestEnteredRealNumber {

    public static void main(String[] args) {

        String in;
        double a, min = 999999999;
        do {
            in = JOptionPane.showInputDialog("Enter a real number: ");
            a = Double.parseDouble(in);

            if (a < min) {
                min = a;
            }

        } while (a != 0.0);
        System.out.println("The smallest number you entered is: \t " + min);
    }

}
