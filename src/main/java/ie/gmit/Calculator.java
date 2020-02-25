package ie.gmit;

import java.util.Scanner;

public class Calculator {
    //this method will add to number

    private int firstNumber;
    private int secondNumber;
    private int total;

    public Calculator(int numberOne, int numberTwo) {
    }

    public int Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        total = firstNumber + secondNumber;

        return total;
    }
}