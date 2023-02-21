package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operator;
        Double a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = input.nextDouble();
        System.out.println("Choose an operator: +, -, *, /");
        operator = input.next().charAt(0);
        System.out.println("Enter second number: ");
        b = input.nextDouble();

        calculatorService.calculation(a, operator, b);
    }
}