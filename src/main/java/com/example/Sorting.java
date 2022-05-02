package com.example;

/**
 * Contains several methods to sort passed array of strings
 */
public class Sorting {
    /**
     * Sorts an array of strings
     * @param stringArrayToSort array to sort
     */
    public void sort(String[] stringArrayToSort) {

        int [] intArrayToSort = new int [stringArrayToSort.length];

        for(int i = 0; i < intArrayToSort.length; i++) {
            if(!isNumeric(stringArrayToSort[i])) {
                throw new IllegalArgumentException("There is a non integer argument");
            }
            intArrayToSort[i] = Integer.parseInt(stringArrayToSort[i]);
        }

        if(intArrayToSort.length > 10) {
            throw new IllegalArgumentException("There are more than 10 arguments");
        }

        //sorting algorithm
        for (int i = 0; i < intArrayToSort.length - 1; i++) {
            for (int j = 0; j < intArrayToSort.length - i - 1; j++)
                if (intArrayToSort[j] > intArrayToSort[j + 1]) {
                    int temp = intArrayToSort[j];
                    intArrayToSort[j] = intArrayToSort[j + 1];
                    intArrayToSort[j + 1] = temp;
                }
        }

        //assign sorted array to passed one
        for (int i = 0; i < intArrayToSort.length; i++) {
            stringArrayToSort[i] = String.valueOf(intArrayToSort[i]);
        }
    }

    /**
     * Checks if a value of a string is integer or not
     * @param stringToCheck string variable to check
     * @return true if it is a digit, false otherwise
     */
    private static boolean isNumeric(String stringToCheck) {
        if (stringToCheck == null) {
            return false;
        }
        try {
            Integer.parseInt(stringToCheck);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
