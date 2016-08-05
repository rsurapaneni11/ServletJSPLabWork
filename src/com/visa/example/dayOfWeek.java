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
public class dayOfWeek {

    public static void main(String[] args) {
        int h ;
        
        boolean timeToQuit;
        Scanner d = new Scanner(System.in);
        timeToQuit = false;
        
        while(!timeToQuit)
        {
        //Scanner d = new Scanner(System.in);
            System.out.print("enter the day: ");
            String day = d.nextLine();
            timeToQuit = day.equalsIgnoreCase("quit");
            if (!timeToQuit) {
                
        Scanner m = new Scanner(System.in);
            System.out.print("enter numeric month: ");
            int month = m.nextInt();
        Scanner y = new Scanner(System.in);
            System.out.print("Enter the year in YYYY : ");
            int year = y.nextInt();
         
         System.out.print("Date is " +month+ "-" +day+ "-" +year + " ");
         
         int mod_m, year_m;
         //Modifying months and year if the month is January, then 13 and February gets 14 along with the year minus 1
         if (month ==1){
         mod_m = 13 ;
         year_m = year -1;
         }
         else if (month == 2) {
             mod_m = 14;
             year_m = year -1;
         }
         else {
             mod_m = month;
             year_m = year;
         }
        
        int day1 = Integer.valueOf(day);
       /* if (1<=day1<= 31) {
            System.out.println("Invalid Date entered");
          
        }*/
       //Calculate individual elements in the formula 
       int a = (13 * (mod_m +1)/5);
        int b = year_m/4 ;
        int e = (year_m/400);
        int c = year_m/100;
        int c1 = 6 * c ;
        //Calculating the numeric day value
        h = (a + b + c1 + e + year_m + day1 ) % 7;
        
        switch (h){
            case 0: 
                System.out.println("And it is a Saturday");
                break;
            case 1: 
                System.out.println("And it is a Sunday");
                break;
            case 2: 
                System.out.println("And it is a Monday");
                break;
            case 3: 
                System.out.println("And it is a Tuesday");
                break;
            case 4: 
                System.out.println("And it is a Wednesday");
                break;
            case 5: 
                System.out.println("And it is a Thursday");
                break;
            case 6: 
                System.out.println("And it is a Saturday"); 
                break;
            default: 
                System.out.println("Today is the dooms day");
                break;        
        }
       
    }
   
 }
}
}
