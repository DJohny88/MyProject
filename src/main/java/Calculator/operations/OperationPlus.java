package Calculator.operations;

/**
 * Create by Zubritskiy Dmitriy on 11.03.2018
 * @author Zubritskiy Dmitriy
 * Операция Сложение
 */
public class OperationPlus implements Operation{
    @Override
    public double execution(double numberOne, double numberTwo) {
        return (numberOne + numberTwo);
    }
}
