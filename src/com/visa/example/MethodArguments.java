/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visa.example;

/**
 *
 * @author rsurapan
 */
public class MethodArguments {
    double result = 0.0;

    public void addUp(int a, int b){
    double result = a + b;
    System.out.println("result = " +result + " and overload method called was int for val1=" +a+ " and val2 = " +b);

    }
    public void addUp(double c, double d){
    double result = c + d;
    System.out.println("result = " +result + " and overload method called was double for val1=" +c+ " and val2 = " +d);
    }
    public void addUp(String e, String f){
        double result = toNumber(e)+toNumber(f);
    System.out.println("result = " +result + " and method called was string for val1=" +e+ " and val2 = " +f);

    }
    public double getResult(){
    return result;
    }   
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
              
       MethodArguments methodArgument = new MethodArguments();
       methodArgument.addUp(2,2.2);
       //System.out.print("result = " +methodArgument.getResult());

   }
 
}
    

