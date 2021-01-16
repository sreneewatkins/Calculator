package com.tts.calculator;

public class MagicCalculator extends SimpleCalculator {

    //magic methods
    //TODO: fix sqrt of negative number restriction
    public static double sqrt(double num) {
        return Math.sqrt(num);
    }

    public static double sin(double num) {
        //convert degrees to radians
        num = num * Math.PI / 180;
        return Math.sin(num);
    }

    public static double cosine(double num) {
        num = Math.toRadians(num);
        return Math.cos(num);
    }

    public static double tangent(double num) {
        num = num * Math.PI / 180;
        return Math.tan(num);
    }

    public static double factorial(int num) {
        double ans = 1;
        for (int i = num; i > 0; i--){
            ans = ans * i;
        }
        return ans;
    }

    public static double naturalLog(double num) {
        return Math.log(num);
    }

    public static double cubeRoot(double num) {
        return Math.cbrt(num);
    }

    public static double logBase10(double num) {
        return Math.log10(num);
    }

}//end MagicCalculator class
