package operations;

import java.util.Scanner;

public abstract class Values {
    protected double firstNumber;
    protected double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void readFirstValue() {
        Scanner ler  = new Scanner(System.in);
        System.out.println("Insert the first number");
        this.firstNumber = ler.nextDouble();
    }

    public void readSecondValue() {
        Scanner ler  = new Scanner(System.in);
        System.out.println("Insert the second number");
        this.secondNumber = ler.nextDouble();
    }
}
