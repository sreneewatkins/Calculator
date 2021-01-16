package com.tts.calculator;


public class SimpleCalculator {

    //methods
    public static double add(double num1, double num2){
        return (num1 + num2);
    }

    public static double subtract(double num1, double num2) {
        return (num1 - num2);
    }

    public static double multiply(double num1, double num2){
        return (num1 * num2);
    }

    //TODO: fix divide by zero restrictions
    public static double divide(double num1, double num2){
        return (num1 / num2);
    }

    public static double square(double num1){
        return (num1 * num1);
    }

}//end SimpleCalculator class
