package org.example;

import practice_1.MathOperations;
import practice_2.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
// Practice_1
        MathOperations mo = new MathOperations();
        double division = mo.devide(3, 2);
        System.out.println(division);
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
        System.out.println("Average speed is: " + speed);
        double hypotenuse = mo.findHypotenuse(4.5, 7);
        System.out.println(hypotenuse);
        double cicCirc = mo.circleCircumference(6);
        System.out.println(cicCirc);
        double percent = mo.calculatePersentage(200, 25);
        System.out.println("25 is " + percent + " persent of 200");
        double fahrenheit = mo.celciusToFahrenheit(32);
        System.out.println("Fahrenheit value equals: " + fahrenheit);
        double celcies = mo.fahrenheitToCelcius(92);
        System.out.println("Celcius value equals: " + celcies);
// Practice_2
// Problem Car
        Car car = new Car ("Volvo", 2024);
        car.printBrand();
        car.printYear();
        car.setYear(2015);
        car.printYear();
// Problem Rectangle
        Rectangle rectangle = new Rectangle(3, 6);
        rectangle.setWidth(5);
        rectangle.calculateArea();
// Problem Book
        Book book = new Book("War and peace", "Lev Tolstoy");
        book.setAuthor("Aleksei Tolstoy");
        book.printInfo();
// Problem BankAccount
        BankAccount bankAccount = new BankAccount("Max Fridman", 150);
        bankAccount.deposit(10);
        bankAccount.withdraw(20);
        bankAccount.printBalance();
// Problem Point
        Point1 point = new Point1(4, 8);
        point.setX(3);
        point.printCoordinates();
// Problem Student Group
        StudentGroup studentGroup = new StudentGroup("Musicians", 25);
        studentGroup.setStudentCount(30);
        studentGroup.printInfo();
// Circle
        Circle circle = new Circle(15);
        circle.setRadius(12);
        circle.calculateArea();
        circle.calculateCircumference();
// Problem Teacher
        Teacher teacher = new Teacher("Helen Newmann", "Literature");
        teacher.setSubject("German Language");
        teacher.printInfo();
// Problem Product
        Product product = new Product("Milk", 75);
        product.setPrice(80);
        product.applyDiscount(5);
        product.printInfo();
// Problem Laptop
        Laptop laptop = new Laptop("Lenovo", 500);
        laptop.setPrice(550);
        laptop.printInfo();
    }
}