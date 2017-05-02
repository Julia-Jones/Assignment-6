/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author jonej9442
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //variable for the amount of marks that are going to be entered
        System.out.println("How many marks will be entered?");
        int numb = input.nextInt();
        int[] A = new int[numb];

        System.out.println("Please enter the " + numb + " marks:");
        //variable for marks
        for (int x = 0; x < A.length; x++) {
            A[x] = input.nextInt();
        }

        //soring for ascending order
        int remaining = A.length - 1;
        for (int x = 0; x < (A.length - 1); x++) {
            for (int y = 0; y < (remaining); y++) {
                int temp;
                if (A[y] > A[y + 1]) {
                    temp = A[y + 1];

                    A[y + 1] = A[y];
                    A[y] = temp;

                }
            }
            remaining--;

        }
        System.out.println("In ascending order:");
        for (int x = 0; x < A.length; x++) {
            System.out.println(A[x]);
        }
        
         double sum = 0;
        //adding all the marks together to create a sum
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        //calculating the average (sum/ number of marks)
            double avg = sum / A.length; 
        //rounding to 2 decimal places
            DecimalFormat round = new DecimalFormat("###.##");
            // Spitting out the final rounded average 
            System.out.println(" ");
            System.out.println("The average is " + round.format(avg) + "%");
        
            //outputting lowest marks
            System.out.println(" ");
         System.out.println("The lowest mark is " + A[0] + "%");
         // outputting highest mark
         System.out.println("  ");
         System.out.println("The highest mark is " +A[A.length-1] + "%");
        
        
    }
}
