/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 10. November 2016
 * Purpose: solution to lab Pattern
 */
public class Pattern {

    /**
     * Main method.
     * @param args - variable number of values from the terminal.
     */
    public static void main(String[] args) {

        // Variable to store the size of the pattern from the terminal.
        int size = Integer.parseInt(args[0]);

        // Converting a possible negative value for size into a positive one.
        size = Math.abs(size);

        // Counter to call all lines.
        int countLines = 0;

        // Counter to count all characters of a line.
        int countCharacters = 0;

        // Counter for the second X from the right.
        int counterConterX = size - 1;

        // Check if the size is 0 or not. If size is 0, than an error occurs.
        if ((size == 0) || (size % 2 == 0)) {

            System.out.println("Invalid Input");

        }
        else {

            // This loop creates the lines.
            for (int i = 0; i < size; i++) {

                // This loop creates the characters of a single line.
                for (int j = 0; j < size; j++) {

                    /*
                     * Everytime the counted characters are equal to counted lines or the counted characters are equal to the
                     * counter of the second X from the right, an X is printed to the screen.
                     */
                    if (countCharacters == countLines || countCharacters == counterConterX) {

                        System.out.print('X');
                        countCharacters++;

                    }
                    // If no X is printed, than a point should be printed to the screen.
                    else {

                        System.out.print('.');
                        countCharacters++;

                    }
                }

                // After every counted line the counter for the characters has to be reset.
                countCharacters = 0;
                counterConterX--;
                countLines++;
                System.out.println();

            }
        }
    }
}
