package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        String name = "Ivan";

        System.out.println("Welcome to Pluralsight " + name);

        //Question 1

        double bobSalary = 80_000.00;

        double garySalary = 90_000.00;

        double highestSalary = Math.max(garySalary, bobSalary);

        System.out.println("The highest salary is " + highestSalary);

        //Question 2

        double carPrice = 13_000.00;
        double truckPrice = 44_000.00;

        double lowestPrice = Math.min(truckPrice, carPrice);

        System.out.println("The lowest price is " + lowestPrice);

        //Question 3

        double circleRadius = 7.25;

        System.out.println("Area of a circle is " + Math.PI * Math.pow(circleRadius, 2));

        //Question 4

        double squareRootOfFive = Math.sqrt(5);

        System.out.println("The square root of Five is " + squareRootOfFive);

        //Question 5

        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        System.out.println(Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)));

        //Question 6

        double absolutePositiveValue = -3.8;

        System.out.println("Absolute positive value is " + Math.abs(absolutePositiveValue));

        //Question 7

        double randomNumber = Math.random();

        System.out.println("Random number between 0 and 1 is " + randomNumber);
    }
}
