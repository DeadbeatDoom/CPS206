//**************************************************************
//Program:   Maze
//Date:      January, 2017
//Author:    Bryan Marchal
//Purpose:   Create a text based maze game from arrays
//**************************************************************

import java.io.*;
import java.util.*;

public class MazeGame{

   public static void main(String[] args) throws IOException {
      final int SIZE = 10; //maintains gameboard size
      char[][] mazeArray = new char[SIZE][SIZE]; //array to hold gameboard
      String answer = "Y"; //holds initial answer if user would like to play again
      char again = 'Y';

      Scanner keyboard = new Scanner(System.in);

      while (again == 'Y'){
      //Generate maze from file
         readFile(mazeArray);

      //Randomly place player
         placePlayer(mazeArray);

      //Prompt user
         System.out.println("Welcome to The Maze!!!\n");

      //test to see maze
         for (int row = 0; row < mazeArray.length; row++){
            System.out.println();
            System.out.print("     ");
            for (int col = 0; col < mazeArray.length; col++) {
               System.out.print(mazeArray[row][col]);
               while (col == 10)
                  System.out.println();
            }
         }
         System.out.println("\n");
         System.out.println("Would you like to play again?(Y/N)");
         answer = keyboard.nextLine();
         answer = answer.toUpperCase();
         again = answer.charAt(0);            
      }//end of while loop
   }//end of main method

   public static void readFile(char[][] mazeArray) throws IOException {
      String fileName = "Maze.txt";
      String line;

      File mazeBoard = new File(fileName);

      //Open File
      Scanner inputFile = new Scanner(mazeBoard);

      //Fill mazeArray with characters from file
      for (int row = 0; row < mazeArray.length; row++){
         if (inputFile.hasNext()){
            line = inputFile.nextLine();
            for (int col = 0; col < mazeArray.length; col++) {
               mazeArray[row][col] = line.charAt(col);
            }
         }
      }
      inputFile.close();

   }//end of readFile method

   public static void placePlayer(char[][] mazeArray) throws IOException{
      int number1;
      int number2;
      Random randomNumbers = new Random();
      number1 = randomNumbers.nextInt(10);
      number2 = randomNumbers.nextInt(10);

      while (mazeArray[number1][number2]== 'X' || mazeArray[number1][number2] == 'F'){
         number1 = randomNumbers.nextInt(10);
         number2 = randomNumbers.nextInt(10);
      }
      mazeArray[number1][number2] = 'P';
   }//end of placePlayer method


}//end of main class
