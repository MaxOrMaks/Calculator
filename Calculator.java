package com.company;

import java.util.Scanner;



public class Calculator{

   static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // write your code here
        System.out.println("Введите, пожалуйста, первое число:");
        double number1 = scanner.nextDouble();
        System.out.println("Введите, пожалуйста, второе число:");
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введите, пожалуйста, оператор:");
        String operator = scanner.nextLine();


       switch (operator){
           case("+"):
               System.out.println(number1 + number2);
               break;

           case ("-"):
               System.out.println(number1 - number2);
               break;

           case ("/"):
               System.out.println(number1 / number2);
               break;

           case ("*"):
               System.out.println(number1 * number2);
               break;

           default:
               System.out.println("Error");
               break;
       }

    }

}
