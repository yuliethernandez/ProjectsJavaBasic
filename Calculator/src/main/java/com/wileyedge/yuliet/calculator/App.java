
package com.wileyedge.yuliet.calculator;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {
    private final Scanner sc;
    private final Random rd;  
    SimpleCalculator calculator;
    
    public App(){
        this.sc = new Scanner(System.in);
        this.rd = new Random();
        this.calculator=new SimpleCalculator();
    }
    public void Calculate(){
        System.out.println("************Wellcome to the Simple Calculator.*****************");
        
        try{
            do{
                System.out.print("\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exit the program."
                    + "\nChoose an option of the list: ");
                switch (sc.nextInt()) {
                    case 1:{
                        System.out.println("The result is: " + calculator.addition(entryOperand(), entryOperand()));
                        break;
                    }
                    case 2:{
                        System.out.println("The result is: " + calculator.subtraction(entryOperand(), entryOperand()));
                        break;
                    }
                    case 3:{
                        System.out.println("The result is: " + calculator.multiplication(entryOperand(), entryOperand()));
                        break;
                    }
                    case 4:{
                        System.out.println("The result is: " + calculator.division(entryOperand(), entryOperand()));
                        break;
                    }
                    case 5:{
                        System.out.println("\nThank you!");
                        System.exit(0);
                        break;
                    }
                }
            }while(true);  
            
        }catch(InputMismatchException ex){
            System.out.println("Invalid entry.");
        }finally{
            System.out.println("Program finished!");
        }        
    }
    
    public double entryOperand(){
        System.out.print("Enter the number: ");
        return sc.nextDouble();
    }
    
}
