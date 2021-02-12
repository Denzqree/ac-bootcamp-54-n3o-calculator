package org.academiadecodigo.bootcamp54.calculator;

/**
 * Created by codecadet on 24/09/2020.
 */
public class Calculator {

    // Referencing properties
    private String brand;
    private String color;
    private static int numberOfCalculators = 0;


    // Declaring a new constructor
    public Calculator(String brand, String color) {
        this.brand = brand;
        this.color = color;
        numberOfCalculators++;
    }


    // Declaring the getters and setters
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }


    // Declaring the static getters
    public static int getNumberOfCalculators(){
        return numberOfCalculators;
    }


    // Declaring the class's methods
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public float add(float number1, float number2) {
        return number1 + number2;
    }

    public int substract(int number1, int number2) {
        return number1 - number2;
    }

    public float substract(float number1, float number2) {
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public float multiply(float number1, float number2) {
        return number1 * number2;
    }

    public int divide(int number1, int number2) {
        return number1 / number2;
    }

    public float divide(float number1, float number2) {
        return number1 / number2;
    }

}
