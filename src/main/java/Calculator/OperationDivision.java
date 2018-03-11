package Calculator;
/**
 * Create by Zubritskiy Dmitriy on 11.03.2018
 * @author Zubritskiy Dmitriy
 * Операция Деление
 */
public class OperationDivision implements Operation{

    @Override
    public double execution(double numberOne, double numberTwo) {
        try{
            double p = numberOne / numberTwo;
        }catch(ArithmeticException e){
            System.out.println(e + " арифметичесская ошибка");
       }
        return (numberOne / numberTwo );
    }
}
