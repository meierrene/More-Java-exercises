package de.renemeier.udemy.timbuchalka.exercises.exercise08.areacalculator;

public class Exercise08AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(4));
        System.out.println(area(3, 4));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.pow(radius, 2) * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }
}