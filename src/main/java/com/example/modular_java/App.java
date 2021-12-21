package main.java.com.example.modular_java;

import main.java.com.example.modular_java.operation.Calculator;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(3, 4));
    }
}
