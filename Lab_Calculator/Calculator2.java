//**************************************************************
//Program: Calculator
//Date: January 18, 2017
//Author: Bryan Marchal
//Purpose: Create a functional calculator
//**************************************************************

import java.io.*;
import java.util.*;

public class Calculator {

   public static void main(String[] args) throws NumberFormatException{

      String operator;
      try {
        double num1 = Double.valueOf(args[1]),
               num2 = Double.valueOf(args[2]);
      }
      catch (NumberFormatException e){
          System.out.println("not a number");
          System.exit(0);
      }
        double answer = 0.0;
      if (args.length != 3){
        System.out.println("Invalid number of Arguements");
        System.exit(0);
      }
      operator = args[0].toUpperCase();
          switch (operator) {
            case "ADD": answer = num1 + num2;
               break;
            case "SUBTRACT": answer = num1 - num2;
               break;
            case "MULTIPLY": answer = num1 * num2;
               break;
            case "DIVIDE":
               if (num2 != 0) {
                      answer = num1 / num2;
               }
               else {
                 System.out.println("Invalid Operation: Divide by Zero");
                 System.exit(0);
               }
               break;
            default: System.out.println("Invalid Operator");
               break;
          }
          System.out.println(answer);
     }
}
