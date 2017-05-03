/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Scanner;

/**
 *
 * @author jonej9442
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variable for the 1001 numbers
        int[] A = new int[1001];
        boolean[] prime = new boolean[1001];

        //creating loop
        for (int i = 0; i < A.length; i++) {
            prime[i] = true;

            // if numbers are prime store
            for (int i1 = 2; i1 < 1001; i1++) {
                if (prime[i1] == true);

                // calculating is it isnt prime
                for (int i2 = 2; i2 < 1001; i2++) {
                    int i3 = i1 * i2;

                    // if prime is false it doesn't print out
                    if (i3 < 1001) {
                        prime[i3] = false;

                    }

                }

            }

        }

        //finding and printing out all the prime numbers 
        System.out.println("The prime numbers are:");
        for (int multiple = 2; multiple < 1001; multiple++) {
            if (prime[multiple] == true) {
                System.out.println(multiple);
            }
        }

    }
}
