//**************************************************************
//Program: Calculator
//Date: January 18, 2017
//Author: Bryan Marchal
//Purpose: Create a functional calculator
//**************************************************************

import java.io.*;
import java.util.*;

public class Calculator {

     public static void main(String[] args) throws IOException {

      double num1 = 0.0;
      double num2 = 0.0;
      char operator;
      double answer = 0.0;
      String repeat = "Y";
      char again = 'Y';

      Scanner scanObject = new Scanner(System.in);
      Scanner keyboard = new Scanner(System.in);

      while (again == 'Y'){
        System.out.println("Enter first number: ");
        if (scanObject.hasNextDouble()) {
          num1 = scanObject.nextDouble();
        }
        else {
          System.out.println("Invalid Input");
          scanObject.next();
          continue;
        }
        System.out.println("Enter second number: ");
        if (scanObject.hasNextDouble()) {
          num2 = scanObject.nextDouble();
        }
        else {
          System.out.println("Invalid Input");
          scanObject.next();
          continue;
        }
        System.out.println("What operation? ");
        if (scanObject.hasNext()) {
          operator = scanObject.next().charAt(0);
          switch (operator) {
            case '+': answer = num1 + num2;
               break;
            case '-': answer = num1 - num2;
               break;
            case '*': answer = num1 * num2;
               break;
            case '/':
               if (num2 != 0) {
                      answer = num1 / num2;
               }
               else {
                 System.out.println("Invalid Operation: Divide by Zero");
                 answer = 0;
               }
               break;
          }
          System.out.println(num1+" "+operator+" "+num2+" = "+answer);
          System.out.println("\n");
          System.out.println("Would you like to perform another operation?(Y/N)");
          repeat = keyboard.nextLine();
          repeat = repeat.toUpperCase();
          again = repeat.charAt(0);
        }
        else {
          System.out.println("Invalid Input");
          scanObject.next();
          continue;
        }
      }
     }
}
