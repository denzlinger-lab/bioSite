/*
Abram Denzlinger
February 7, 2026
Assignment 5.2 - Arrays and Methods

Using sample arrays of different types,
this programs uses methods to identify the
locations of the largest and smallest elements in
each array.
 */

import java.util.Arrays;

public class ArrayLocationFinder {

    public static void main(String[] args) {
        // Sample 2D Double Array
        double[][] doubleMatrix = {
                {15.5, 4.2, 30.8},
                {9.1, 1.2, 12.4},
                {2.2, 7.6, 5.1}
        };

        // Sample 2D Integer Array
        int[][] intMatrix = {
                {45, 10, 22},
                {89, 12, 34},
                {5, 67, 11}
        };

        // Testing Largest Methods
        int[] largeDouble = locateLargest(doubleMatrix);
        int[] largeInt = locateLargest(intMatrix);

        // Testing Smallest Methods
        int[] smallDouble = locateSmallest(doubleMatrix);
        int[] smallInt = locateSmallest(intMatrix);

        // Displaying Results
        System.out.println("--- Double Array Analysis ---");
        System.out.println("Largest element at: " + Arrays.toString(largeDouble));
        System.out.println("Smallest element at: " + Arrays.toString(smallDouble));

        System.out.println("\n--- Integer Array Analysis ---");
        System.out.println("Largest element at: " + Arrays.toString(largeInt));
        System.out.println("Smallest element at: " + Arrays.toString(smallInt));
    }

    // --- LARGEST ELEMENT METHODS ---

    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double maxVal = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > maxVal) {
                    maxVal = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int maxVal = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > maxVal) {
                    maxVal = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // --- SMALLEST ELEMENT METHODS ---

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double minVal = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < minVal) {
                    minVal = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int minVal = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < minVal) {
                    minVal = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }
}