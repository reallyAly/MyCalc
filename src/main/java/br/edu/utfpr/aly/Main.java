import operations.operation.Divide;
import operations.operation.Multiply;
import operations.operation.Subtract;
import operations.operation.Sum;
import operations.Operations;

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
