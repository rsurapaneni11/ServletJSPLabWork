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
public class ConvertF2C {
  
    public static void main(String[] args) {
  
        Scanner TempF = new Scanner(System.in);
            System.out.println("Enter the temperature in Fahrenheit : ");
    double TempFd = Double.valueOf(TempF.nextInt());
    
    double TempC = 5 * (TempFd -32)/9
    System.out.println("Temperature in Celsius is " +TempC);
    }
    
}


