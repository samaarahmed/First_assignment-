package org.example;

import java.util.Scanner;

/**
 * Your assignment is to create a console-based calculator. Your application needs to be able to handle
 * basic operations such as addition, subtraction, multiplication and division. The result of each
 * operation also needs to be presented in a consistent way.
 * Approval demands:
 * • Application need to be a Maven Project that runs with Java 8.
 * • Application need to be able to perform mathematical operations addition, subtraction,
 * multiplication and division.
 * • The program should not stop running until the User choose to end it by terminating a loop.
 *
 */
public class App {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to use my first calculator\n");
        while(true){
            double  result=0;

            System.out.print("Kindly enter the first no 1:");
                 double   no1=scanner.nextDouble();
            System.out.print("Kindly enter the second no 2:");
                double    no2=scanner.nextDouble();
            System.out.print("Kindly enter the opreator :");
            char opreator = scanner.next().charAt(0);
               switch (opreator){
                   case '+': result= no1+no2;
                       break;
                   case '-':
                       result =no1-no2;
                       break;
                       case '*':
                           result= no1*no2;
                           break;
                           case '/':
                               result=no1/no2;
                               break;
                               case '%':
                                   result=no1%no2;
                                   break;
                   default:
                       System.out.println("Operator is not supported");


               }
            System.out.println("Result:" + result);
            System.out.println(" Continue? (y/n)");
            String input=scanner.next();

            if(input.equalsIgnoreCase("n"))
                break;
        }

    }
}