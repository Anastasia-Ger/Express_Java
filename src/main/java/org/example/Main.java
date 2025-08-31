package org.example;

import practice_3.*;

public class Main {
    public static void main(String[] args) {

        // Class Company
        Company paul = new Company(1, "Paul");
        Company max = new Company(2, "Max");
        Company hellen = new Company(3, "Hellen");

       //  paul.employeeID = 4; it is impossible to update the field employeeID, because it is final
        Company.printCompanyName();
        Company.companyName = "Spotify";
        Company.printCompanyName();

        // It is not recommendet to call a static variable from and instance,
        // we do it to check tha company name changed for all objects
        System.out.println("Paul works in " + paul.companyName);
        System.out.println("Max works in " + max.companyName);
        System.out.println("Hellen works in " + hellen.companyName);

        // Class MathConstans
        System.out.println("Circle Area of 15 is: " + MathConstans.calculateCircleArea(15));
        System.out.println("Circle Circumference of 15 is: " + MathConstans.calculateCircumference(15));
        System.out.println("Circle Area of 9 is: " + MathConstans.calculateCircleArea(9));
        System.out.println("Circle Circumference of 9 is: " + MathConstans.calculateCircumference(9));

        // Class University
        University ann = new University(11, "Ann");
        University mary = new University(12, "Mary");
        University kate = new University(13, "Kate");
        ann.printStudentInfo();
        mary.printStudentInfo();
        kate.printStudentInfo();
        University.universityName = "ITMO";
        ann.printStudentInfo();
        mary.printStudentInfo();
        kate.printStudentInfo();

        // Class GameSettings
        GameSetting minecraft = new GameSetting("Minecraft", 5);
        GameSetting counterStrike = new GameSetting("CounterStrike", 6);
        GameSetting.setMaxPlayers(8);
        minecraft.addPlayer();
        counterStrike.addPlayer();
        minecraft.printGameStatus();
        counterStrike.printGameStatus();

        // Class Person
        Person will = new Person("Will", "Smith", "234-22-234");
        will.printPersonalInfo();
        will.setFirstName("Max");
        will.printPersonalInfo();

        Person john = new Person("John", "Keller", "123-123-00");
        john.printPersonalInfo();
        john.setLastName("Tramp");
        john.printPersonalInfo();


    }
}