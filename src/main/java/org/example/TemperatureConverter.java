package org.example;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Prompt user to choose conversion type
        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        double temperature, convertedTemperature;

        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                convertedTemperature = (temperature * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                convertedTemperature = (temperature - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + convertedTemperature);
                break;
            default:
                System.out.println("Invalid Choice.");
        }
        scanner.close();
    }
}
