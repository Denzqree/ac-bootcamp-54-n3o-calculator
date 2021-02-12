package org.academiadecodigo.bootcamp54.calculator;

/**
 * Created by codecadet on 24/09/2020.
 */

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator("Casio", "Grey");

        int resultadd = calculator.add(3, 4); //7
        int resultsubstract = calculator.substract(6, 5); //1
        int resultmultiply = calculator.multiply(5, 6); //30
        int resultdivide = calculator.divide(30, 6); //5

        calculator.setBrand("Texas Instruments");
        calculator.setColor("Navy Blue");

        System.out.println("Initializing a "+calculator.getColor().toLowerCase()+" calculator made by "+calculator.getBrand()+".");
        System.out.println("Addition result = "+resultadd);
        System.out.println("Substraction result = "+resultsubstract);
        System.out.println("Multiplication result = "+resultmultiply);
        System.out.println("Division result = "+resultdivide);

    }
}