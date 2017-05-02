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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many students are in the class?");
        //creating variable for the number of students and marks
        int students = input.nextInt();
        // creating spaces for the same number of students
        double[] marks = new double[students];
        
        System.out.println("Please enter the marks");
        // counts the number of marks entered
        for (int i = 0; i < marks.length; i++) {

            marks[i] = input.nextDouble();
        }
        //sum starting at 0
        double sum = 0;
        //adding all the marks together to create a sum
        for (int i = 0; i < marks.length; i++) {

            sum = sum + marks[i];
        }
        //calculating the average (sum/ number of marks)
            double avg = sum / marks.length; 
            
            //rounding to 2 decimal places
            DecimalFormat round = new DecimalFormat("###.##");
            // Spitting out the final rounded average 
            System.out.println(" ");
            System.out.println("The average is " + round.format(avg) + "%");
        
           
    }
}
