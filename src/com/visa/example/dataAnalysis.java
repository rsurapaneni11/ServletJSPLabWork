/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visa.example;
import java.util.Scanner;
/**
 *
 * @author rsurapan
 */
public class dataAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int  number, sum = 0, largest = 0, smallest = 0, large=0, small=0;
                
        Scanner i = new Scanner(System.in);
            System.out.print("Enter the number of objects you want : ");
            number = i.nextInt();
         System.out.println("Number of values is " + number);
        
         int[] values = new int[number];
         //Scan for user input on numbers
         for (int x=0; x<number; x++) {
             Scanner val1 = new Scanner(System.in);
             System.out.print("Enter your values, one at a time: ");
             int val = val1.nextInt();
             values[x]= val;
         }   
         //Calculate Sum of numbers and mean
          for (int z=0; z<number; z++) {
              sum += values[z];
              if (z==0){
                  largest = values[z];
                  smallest = values[z];
              }
              largest = largest > values[z] ? largest : values[z];
              smallest = smallest < values[z]? smallest : values[z];
          }
          float mean = sum/number;
          System.out.println("The mean of all the numbers you have entered is " 
                  +mean+ " and largest number is " +largest+ 
                  " and smallest is " +smallest);
    }
}

