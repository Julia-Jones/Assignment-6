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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        // output and variable for the amount of hights that will be entered
        System.out.println("How many heights will be entered?");
        int people = input.nextInt();

        //convert to double 
        double[] height = new double[people];

        System.out.println("Please enter all the heights in cm. Enter with spaces in between the heights and click enter when done all.");

        //variable for the heights 
        for (int i = 0; i < height.length; i++) {
            height[i] = input.nextDouble();
        }
        //average starts at 0
        double sum = 0;
        
        //adding all the heights together
        for (int i = 0; i < height.length; i++) {
            sum += height[i];
        }
        //dividing sum by the amount of heights entered and rounding up
        double avg = sum / height.length;
        avg = Math.ceil(avg);
        
        //outputing average
        System.out.println(" ");
        System.out.println("The average is " + avg + "cm");

        //calculating if there are heights over the average and if there is then they will be output. 
        for (int i = 0; i < height.length; i++) {
            if (avg < height[i]) {
                System.out.println("The height over the average are " + height[i] + ".");
            }

        }

    }
}
