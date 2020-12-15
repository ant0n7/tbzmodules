package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Calculator {
    float num1;
    float num2;
    char operator;
    float result;

    public float getNumber() {
        System.out.print("Zahl eingeben: ");

        // Scan
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextInt();
        //scanner.close();

        return input;
    }

    public char getOperator() {
        System.out.print("Operator angeben: ");

        // Scan
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        //scanner.close();

        return input;
    }

    public float calculate(float a, float b, char operator) {
        float result = 0;
        switch (operator) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            case '%' -> result = a % b;
            default -> System.out.println("Operation not found!");
        }
        return result;
    }

}
