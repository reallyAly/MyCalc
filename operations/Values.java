package operations;

import java.util.Scanner;

public abstract class Values {
    protected double firstNumber;
    protected double secondNumber;

    public void readValues() {

        Scanner ler  = new Scanner(System.in);

        System.out.println("Insert the first number");
        this.firstNumber = ler.nextDouble();

        System.out.println("Insert the second number");
        this.secondNumber = ler.nextDouble();

    }
}
