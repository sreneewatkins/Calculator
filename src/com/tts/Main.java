package com.tts;

//if we import the class then we have to use className to call .methods
import com.tts.calculator.MagicCalculator;
//if we import all statics from class then we can call method without a modifier
import static com.tts.calculator.SimpleCalculator.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        getOperationFromUser();

       // System.out.format("The sine of %.1f degrees is %.4f%n", value, Math.sin(radians));

        System.out.println(add(2.3, 2.2));


    }//end main()

    public static Scanner readInput = new Scanner(System.in);

    public static double firstNum;
    public static double secondNum;
    public static int operation;

    //get operation input from user ( may move all user interaction to bottom of main)
    public static void getOperationFromUser() {
        do {
            System.out.println("""
                    Enter numeric value for the operation you would like to complete: 
                    (1) ADD
                    (2) SUBTRACT
                    (3) MULTIPLY
                    (4) DIVIDE  
                    (5) SQUARE
                    (6) SQUARE ROOT
                    (7) SINE
                    (8) COSINE
                    (9) TANGENT
                    (10) FACTORIAL
                    (11) NATURAL LOG
                    (12) LOG
                    (13) CUBE ROOT
                    (14) QUIT""");
            operation = readInput.nextInt();
            if (operation > 0 && operation < 14) getNumbersFromUser(operation);

            switch (operation) {
                case (1) -> System.out.println(add(firstNum, secondNum));
                case (2) -> System.out.println(subtract(firstNum, secondNum));
                case (3) -> System.out.println(multiply(firstNum, secondNum));
                case (4) -> System.out.println(divide(firstNum, secondNum));
                case (5) -> System.out.println(square(firstNum));
                case (6) -> System.out.println(MagicCalculator.sqrt(firstNum));
                case (7) -> System.out.println(MagicCalculator.sin(firstNum));
                case (8) -> System.out.println(MagicCalculator.cosine(firstNum));
                case (9) -> System.out.println(MagicCalculator.tangent(firstNum));
                case (10) -> System.out.println(MagicCalculator.factorial((int)firstNum));
                case (11) -> System.out.println(MagicCalculator.naturalLog(firstNum));
                case (12) -> System.out.println(MagicCalculator.logBase10(firstNum));
                case (13) -> System.out.println(MagicCalculator.cubeRoot(firstNum));
                case (14) -> System.out.println("Come back to crunch the numbers next time");
                default -> System.out.println("Incorrect Input: Please try again");
            }
        }
        while (operation != 14);
    }

    //get numbers from user (may move these to bottom of main)
    private static void getNumbersFromUser(int mathOperation) {
        System.out.print("Enter a number: ");
        firstNum = readInput.nextDouble();

        if (mathOperation > 0 && mathOperation < 5) {
            System.out.println("Enter another number: ");
            secondNum = readInput.nextDouble();
        }
    }


}//end Main class
