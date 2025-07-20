package org.example;

import practice_1.MathOperations;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MathOperations mo = new MathOperations();
        double devision = mo.devide(3, 2);
        System.out.println(devision);
        int sum = mo.add(3, 5);
        System.out.println(sum);
        int substraction = mo.substract(5, 3);
        System.out.println(substraction);
        int multy = mo.multiply(3, 5);
        System.out.println(multy);
        int maxValue = mo.findMax(1, 6);
        System.out.println(maxValue);
        int diffValue = mo.difference(2, 6);
        System.out.println(diffValue);
        int squareArea = mo.squareArea(4);
        System.out.println(squareArea);
        int squarePerimeter = mo.squarePerimeter(4);
        System.out.println(squarePerimeter);
        double minutes = mo.convertSecondsToMinutes(365);
        System.out.println(minutes);
        double speed = mo.averageSpeed(150, 5);
        System.out.println(speed);
        double hypotenuse = mo.findHypotenuse(4.5, 7);
        System.out.println(hypotenuse);
        double cicCirc = mo.circleCircumference(6);
        System.out.println(cicCirc);
        double persent = mo.calculatePersentage(200, 25);
        System.out.println("25 is " + persent + " persent of 200");
        double fahrenheit = mo.celciusToFahrenheit(32);
        System.out.println("Fahrenheit value equals: " + fahrenheit);
        double celcius = mo.fahrenheitToCelcius(92);
        System.out.println("Celcius value equals: " + celcius);

    }
}