package org.example;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static float celciusToFahrenheit(float celcius){
        return (celcius * 9)/5 + 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float celcius = scanner.nextFloat();
        float fahrenheit = celciusToFahrenheit(celcius);
        System.out.print("Temperature in Fahrenheit: " + String.format("%.2f", fahrenheit));

    }
}