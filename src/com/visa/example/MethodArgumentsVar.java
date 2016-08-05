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
public class MethodArgumentsVar {
         
    double result = 0.0;
    public int[] listInt;// = {1,2,3,4};
    double[] listDouble; // = {2.2,3.2,1.2};
    String[] listString; // = {"one","two","three"};
    //int i=0;
    public void addUp(int... listInt){
         for (int i =0; i <listInt.length ; i++)
           result += listInt[i];
             System.out.println("result = " +result + " and overload method called was int for values= " +listInt);
         }
    public void addUp(double... listDouble){
    for (int i =0; i <listDouble.length ; i++)
           result += listDouble[i];
              System.out.println("result = " +result + " and overload method called was double for values= " +listDouble);
    }
    public void addUp(String... listString){
        for (int i =0; i <listString.length ; i++)
           result += toNumber(listString[i]);
              System.out.println("result = " +result + " and overload method called was String for values= " +listString);
    }
    //public double getResult(){
    //return result;
    //}   
    String[] list = new String[] {"zero","one","two","three","four"};
    
    public int toNumber(String num){
        if ("zero".equalsIgnoreCase(num)){
         return 0 ;
        }
         else if ("one".equalsIgnoreCase(num)){
         return 1;
         }
         else if ("two".equalsIgnoreCase(num)){
             return 2;
         }
        else if ("three".equalsIgnoreCase(num)){
             return 3;
         }
        else if ("four".equalsIgnoreCase(num)){
             return 4;
         }
        else return 9;
    }
         public static void main(String[] args) {

              
       MethodArgumentsVar methodArgumentsVar = new MethodArgumentsVar();
       methodArgumentsVar.addUp("one","two","three");
       //System.out.print("result = " +methodArgument.getResult());

 }
 
}