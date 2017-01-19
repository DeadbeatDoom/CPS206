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

      char input,
           operator;
      double num1 = Double.valueOf(args[1]),
             num2 = Double.valueOf(args[2]),
             answer = 0.0;

        if (operator !='A' && operator != 'S' && operator !='M'&& operator !='D') {
        System.out.println("Invalid Input");
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
