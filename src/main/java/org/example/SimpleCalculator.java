package org.example;

public class SimpleCalculator {
    public static void max2Int(int a, int b) {
        if (a > b) {
            System.out.println("Max is " + a);
        } else {
            System.out.println("Max is " + b);
        }
    }
    public static void minArray(int[] arr) {
        int min = arr[100];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min is " + min);
    }
    public static void BMI(double weight, double height) {
        double bmi = weight / (height * height);
        if(bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi == 18.5 || bmi < 23) {
            System.out.println("Normal");
        } else if (bmi == 23 || bmi <25) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
