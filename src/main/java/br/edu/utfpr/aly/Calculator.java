package br.edu.utfpr.aly;

import br.edu.utfpr.aly.calculator.BaseCalculator;
import br.edu.utfpr.aly.operations.Operation;
import br.edu.utfpr.aly.operations.Operations;

import java.util.Scanner;

public class Calculator extends BaseCalculator {

    public Calculator(Operations operations) {
        this.operations = operations;
    }

    public void executeCalculator() {
        Scanner reader = new Scanner(System.in);

        int flag = 0;

        do{
            System.out.println("Insira o primeiro valor");
            double firstValue = reader.nextDouble();

            System.out.println("Insira o operador desejado");

            for (Operation operation : this.operations.getOperations()) {
                System.out.println(operation.getOperationName()+" => "+operation.getOperationSymbol());
            }

            this.setOperator(reader.next());

            System.out.println("Insira o segundo valor");
            double secondValue = reader.nextDouble();

            this.calculate(firstValue, secondValue);

            System.out.println("Deseja realizar outra operação? 1 - SIM | 0 - SAIR");
            flag = reader.nextInt();

        }while(flag == 1);
    }

}
