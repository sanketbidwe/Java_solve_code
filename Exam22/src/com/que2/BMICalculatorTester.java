package com.que2;

import java.util.Scanner;

class BMICalculator {

    public double calculateBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid input: Weight and height must be positive values.");
        }

        if (height > 3) {
            throw new RuntimeException("Invalid input: Height exceeds realistic human range.");
        }

        double bmi = weight / (height * height);

        return Math.round(bmi * 100.0) / 100.0;
    }
}

public class BMICalculatorTester {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        BMICalculator bmiCalculator = new BMICalculator();

        try {
            System.out.print("Enter weight (kg): ");
            String weightInput = scanner.nextLine();

            double weight = Double.parseDouble(weightInput);

            System.out.print("Enter height (m): ");
            String heightInput = scanner.nextLine();

            double height = Double.parseDouble(heightInput);

            double bmi = bmiCalculator.calculateBMI(weight, height);
            System.out.println("Your BMI is: " + bmi);
        } 
        catch (NumberFormatException e)
        {
            System.out.println("Invalid input: Numeric value expected for weight and height.");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally
        {
            scanner.close();
        }
    }
}