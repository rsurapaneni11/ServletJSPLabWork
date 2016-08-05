/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visa.example;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
/**
 *
 * @author rsurapan
 */
public class Reading {
    //char dayOfWeek, hourOfDay, temperature, windSpeed ;
    int hourOfDay;
    int temperature;
    int windSpeed;
    String dayOfWeek ;
    Reading(String line) {
        String[] elements = line.split(", ");
        dayOfWeek = elements[0];
        hourOfDay = Integer.valueOf(elements[1]);
        temperature = Integer.valueOf(elements[2]);
        windSpeed = Integer.valueOf(elements[3]);
        
    }
    int temp; 
    
    String rateTemperature() {
        if (temperature<=55)
            return "cold" ; 
        else if (temperature<=65)
            return "mild" ;
        else if (temperature<=80)
            return "warm" ;
        else if (temperature>80) 
            return "hot";
        else 
            return "default";
      }
    
    String getTime() {
        if (hourOfDay==9)
            return "morning";
        else if (hourOfDay==15)
            return "afternoon";
        else if (hourOfDay==21)
            return "evening";
        else 
            return "default";
    }
public static void main(String[] args) throws Throwable {    
    BufferedReader br = Files.newBufferedReader(
        Paths.get("weather.csvx"));
    Reading[] readings = new Reading[12];
    String line;
    for (int i = 0; i < readings.length; i++) {
        readings[i] = new Reading(br.readLine());
    System.out.println(readings[i].dayOfWeek + " " +readings[i].getTime()+ " was " +readings[i].rateTemperature());
    }
  }
}