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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        //holding all 10 numbers 
        int[] A = new int[10];
        System.out.println("Please enter the 10 marks:");

        // variable for all the marks 
        for (int x = 0; x < A.length; x++) {
            A[x] = input.nextInt();
        }

        //ordering them in ascending order
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
        //outputting in ascendng
        System.out.println("In ascending order:");
        for (int x = 0; x < A.length; x++) {
            System.out.println(A[x]);
        }
    }
}
