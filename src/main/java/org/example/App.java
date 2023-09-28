package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        CalculatorService calculatorService = new BasicCalculatorService();

        int result1 = calculatorService.add(5, 3);
        System.out.println("5 + 3 = " + result1);

        int result2 = calculatorService.subtract(10, 4);
        System.out.println("10 - 4 = " + result2);

        int result3 = calculatorService.multiply(6, 7);
        System.out.println("6 * 7 = " + result3);

        try {
            int result4 = calculatorService.divide(8, 2);
            System.out.println("8 / 2 = " + result4);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
