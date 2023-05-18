
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
    public double division(double a, double b) throws Exception{
        if(b == 0){
            throw new Exception("");
        }        
        return a / b;
    }
}
