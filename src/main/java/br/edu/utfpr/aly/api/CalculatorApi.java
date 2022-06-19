package br.edu.utfpr.aly.api;

import br.edu.utfpr.aly.calculator.BaseCalculator;
import br.edu.utfpr.aly.operations.Operation;
import br.edu.utfpr.aly.operations.Operations;
import br.edu.utfpr.aly.api.operations.OperationApi;
import java.util.ArrayList;

public class CalculatorApi extends BaseCalculator {

    private Double result;

    public CalculatorApi(Operations operations) {
        this.operations = operations;
    }

    public Double getResult() {
        return this.result;
    }

    @Override
    public void calculate(double a, double b) {
        ArrayList<Operation> operations = this.operations.getOperations();

        for (Operation operation : operations) {

            OperationApi operationApi = (OperationApi) operation;

            if (this.operator.equals(operationApi.getOperationSymbol())) {
                operationApi.calc(a, b);
                this.result = operationApi.getResult();
            }

        }
    }
}
