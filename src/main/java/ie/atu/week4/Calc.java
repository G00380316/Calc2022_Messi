package ie.atu.week4;

import java.util.Scanner;

public class Calc {
  
    public static void main(String[] args) {
        delete();
        add();
        multiply()
    }

      public static void delete() {
        System.out.println("Please your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is "+ total);
      }  
  
      public static void multiply() {
        System.out.println("Please your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is " + total);
      }
     
     public static void add() {
        System.out.println("Please your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is "+ total);
     }   
}

