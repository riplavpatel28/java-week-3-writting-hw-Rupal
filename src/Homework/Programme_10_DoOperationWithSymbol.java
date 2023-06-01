package Homework;


import java.util.Scanner;

/**
   * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
   * /, *) find addition, Subtraction, multiplication and division according to their symbol
   * (using if else)
   */


public class Programme_10_DoOperationWithSymbol {
      public static void main(String[] args) {
          // scanner declaration for reading input from console
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter first number:");
          int x = scanner.nextInt();
          System.out.println("Enter second number");
          int y = scanner.nextInt();
          System.out.println("Please select calculation symbol +,-,/,*:");
          char symbol = scanner.next().charAt(0);
          doOperationBySelectingSymbol(x ,y, symbol);
          //closing the scanner symbol
          scanner.close();
      }
      //calculating operation based on symbol
      // Calculating operation based on symbol
      public static void doOperationBySelectingSymbol(int x, int y, char symbol) {
          if (symbol == '+') {
              System.out.println(x + " + " + y + " = " + (x + y));
          } else if (symbol == '-') {
              System.out.println(x + " - " + y + " = " + (x - y));
          } else if (symbol == '*') {
              System.out.println(x + " x " + y + " = " + (x * y));
          } else if (symbol == '/') {
              System.out.println(x + " / " + y + " = " + (x / y));
          } else {
              System.out.println("Please enter correct symbol +,-,*,/");
          }
      }
}
