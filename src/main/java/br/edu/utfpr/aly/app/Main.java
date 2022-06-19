package br.edu.utfpr.aly.app;

import br.edu.utfpr.aly.app.operations.operation.Divide;
import br.edu.utfpr.aly.app.operations.operation.Multiply;
import br.edu.utfpr.aly.app.operations.operation.Subtract;
import br.edu.utfpr.aly.app.operations.operation.Sum;
import br.edu.utfpr.aly.app.operations.Operations;

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
