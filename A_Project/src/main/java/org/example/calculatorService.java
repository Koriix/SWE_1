package org.example;

public class calculatorService {

    public static void calculation(double a, char operator, double b) {
        double result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;
            case '-':
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;
            case '*':
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;
            case '/':
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
                break;
            default:
                if (operator == '=') {
                    if (a != b) {
                        System.out.println("You are funny, but it is not true");
                    }
                    else {
                        System.out.println("Yes, it is true. Good Job!");
                    }
                }
                else {
                    System.out.println("Wrong operator! (Use one of these: + - * / )");
                }
                break;
        }
    }
}
