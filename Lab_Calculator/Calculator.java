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

      double num1 = Double.valueOf(args[1]);
      double num2 = Double.valueOf(args[2]);
      char operator;
      double answer = 0.0;

        if (scanObject.hasNextDouble()) {
          num1 = scanObject.nextDouble();
          operator = scanObject.next().charAt(0);
          num2 = scanObject.nextDouble();
        }
        else {
          System.out.println("Invalid Input");
          scanObject.next();
          continue;
        }
        if (operator !='+' && operator != '-' && operator !='*'&& operator !='/') {
        System.out.println("Invalid Input");
        scanObject.next();
        continue;
        }
        else{
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
        }
          System.out.println(num1+" "+operator+" "+num2+" = "+answer);
     }
}
