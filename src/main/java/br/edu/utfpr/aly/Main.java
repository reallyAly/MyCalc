package br.edu.utfpr.aly;

import br.edu.utfpr.aly.operations.operation.Divide;
import br.edu.utfpr.aly.operations.operation.Multiply;
import br.edu.utfpr.aly.operations.operation.Subtract;
import br.edu.utfpr.aly.operations.operation.Sum;
import br.edu.utfpr.aly.operations.Operations;

public class Main {

    public static void main(String[] args) {

        Operations op = new Operations();

        op.addOperation(new Sum());
        op.addOperation(new Multiply());
        op.addOperation(new Divide());
        op.addOperation(new Subtract());

        Calculator calc = new Calculator(op);

        calc.executeCalculator();

    }

}
