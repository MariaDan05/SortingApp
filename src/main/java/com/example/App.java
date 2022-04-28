package com.example;

 /**
 * App class contains several methods to sort an array of command-line arguments
 */
public class App {
     /**
      * Main method calls sort method and prints the result to the console
      * @param args an array that contains the arguments to sort
      */
        public static void main(String[] args) {
        App m = new App();

        m.sort(args);

        for (String s : args) {
            System.out.print(s + " ");
        }

    }

     /**
      * Method sort sorts the array of Integers
      * @param array to sort
      */
    public void sort(String[] array) {
        int [] arr = new int [array.length];

        for(int i = 0; i < arr.length; i++) {
            if(!isNumeric(array[i])) {
                throw new IllegalArgumentException("There is a non integer argument");
            }
            arr[i] = Integer.parseInt(array[i]);
        }

        if(arr.length > 10) {
            throw new IllegalArgumentException("There are more than 10 arguments");
        }
        boolean isActive = true;
        int count = 0;
        while(isActive){
            isActive = false;
            for (int i = 0; i < arr.length - 1 - count; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isActive = true;
                }
            }
            ++count;
        }

        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i]+"";
        }
    }

     /**
      * Method isNumeric checks if a value of a String is integer or not
      * @param n String variable to check
      * @return true if it is a digit, false otherwise
      */
    private static boolean isNumeric(String n) {
        if (n == null) {
            return false;
        }
        try {
            Integer.parseInt(n);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
