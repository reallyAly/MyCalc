package br.edu.utfpr.aly.app.calculator;

import br.edu.utfpr.aly.app.operations.Operation;
import br.edu.utfpr.aly.app.operations.Operations;
import java.util.ArrayList;

abstract public class BaseCalculator {
    protected Operations operations;

    protected String operator;

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void calculate(double a, double b) {

        ArrayList<Operation> operations = this.operations.getOperations();

        for (Operation operation : operations) {
            if (this.operator.equals(operation.getOperationSymbol())) {
                operation.calc(a, b);
            }
        }

    }

}
