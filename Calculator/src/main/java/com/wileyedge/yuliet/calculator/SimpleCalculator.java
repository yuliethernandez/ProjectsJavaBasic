
package com.wileyedge.yuliet.calculator;

public class SimpleCalculator {
    
    public SimpleCalculator(){ }
    
    //addition, subtraction, multiplication, division
    public double addition(double a, double b){
        return a + b;
    } 
    public double subtraction(double a, double b){
        return a - b;
    } 
    public double multiplication(double a, double b){
        return a * b;
    }
    public double division(double a, double b){
        try{
            if(b == 0){
                throw new Exception("");
            }
        }catch(Exception e){
            System.out.println("Can not divide by zero.");
            return 0;
        }
        
        return a / b;
    }
}
