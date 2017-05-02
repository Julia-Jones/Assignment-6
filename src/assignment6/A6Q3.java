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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //variable to temporarily replace
         int temp;
             
        Scanner input = new Scanner(System.in);
       
        //stores the 2 variables
        int[] A = new int[2];
        
        // output statement
        System.out.println("Please enter in 2 numbers:");
        //counts the number of marks entered 
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();

        }
      
        // sorting the nummbers from smallest to largest
        for (int i = 0; i < A.length; i++) {
            for (int n = i + 1; n < A.length; n++) {
                if (A[i] > A[n]) {
                    temp = A[i];
                    A[i] = A[n];
                    A[n] = temp;
                }
            }

        }

        // output the correct order for the numbers 
        System.out.println("Ascending Order:");
        for (int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
    }
}
