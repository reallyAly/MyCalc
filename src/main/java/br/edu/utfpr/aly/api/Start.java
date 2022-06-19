package br.edu.utfpr.aly.api;

import br.edu.utfpr.aly.api.utils.Data;
import br.edu.utfpr.aly.operations.Operation;
import io.javalin.Javalin;
import br.edu.utfpr.aly.operations.Operations;
import br.edu.utfpr.aly.api.operations.operation.*;
import br.edu.utfpr.aly.api.utils.ConvertJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Start {

    public static void main(String[] args) {

        Operations operations = new Operations();

        operations.addOperation(new SumApi());
        operations.addOperation(new SubtractApi());
        operations.addOperation(new MultiplyApi());
        operations.addOperation(new DivideApi());

        CalculatorApi calc = new CalculatorApi(operations);

        Javalin app = Javalin.create().start(7070);

        /* Listing all operations */
        app.get("/operations", ctx -> {

            Map<String, String> resultOps = new HashMap<String, String>();

            for(Operation op: operations.getOperations()) {
                resultOps.put(op.getOperationSymbol(), op.getOperationName());
            }

            ctx.json(resultOps);
        });

        /* Calculate and show result */
        app.post("/calculate", ctx -> {

            ConvertJson util = new ConvertJson();
            Data data = util.getData(ctx.body());

            ArrayList<Integer> numbers = data.getNumbers();

            calc.setOperator(data.getOperator());
            calc.calculate(
                    Double.parseDouble(String.valueOf(numbers.get(0))),
                    Double.parseDouble(String.valueOf(numbers.get(1)))
            );

            ctx.result("O resultado é: "+String.valueOf(calc.getResult()));
        });
    }
}
