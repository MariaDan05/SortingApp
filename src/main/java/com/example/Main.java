package com.example;

 /**
  * Driver class contains main method
  *
  * @author Maria Danielyan
 */
public class Main {

    /**
     * Calls sort method and prints the result to the console
     * @param args an array of strings that contains the arguments to sort
     */
    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        sorting.sort(args);

        for (String s : args) {
            System.out.print(s + " ");
        }

    }

}
