package Calculator;
/**
 * Create by Zubritskiy Dmitriy on 11.03.2018
 * @author Zubritskiy Dmitriy
 * Операция Умножение
 */
public class OperationMultiply implements Operation{
    @Override
    public double execution(double numberOne, double numberTwo) {
        return (numberOne * numberTwo);
    }
}
