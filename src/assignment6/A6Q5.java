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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        //Number of marks that will be entered and variable for it  
        System.out.println("How many marks will be entered?");
        int numb = input.nextInt();
        int[] A = new int[numb];

        System.out.println("Please enter the " + numb + " marks:");



        //variable for marks 
        for (int x = 0; x < A.length; x++) {
            A[x] = input.nextInt();
        }

        //ordering from ascending order
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

        //calculating the medium
        //to find the middle you divide the amount of numbers by 2
        if (A.length % 2 == 0) {
            int middle = A.length / 2;
            int middle2 = middle - 1;
            double median = (A[middle] + A[middle2]) / 2;
            System.out.println(" Median of the students marks are:" + median + ".");
        }else {

        //calculating median
        int middle = A.length / 2;
        double median = A[middle];

        System.out.println(" The median for the marks is: " + median + ".");


        }
    }
}
