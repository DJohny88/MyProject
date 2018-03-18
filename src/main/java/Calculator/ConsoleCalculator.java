package Calculator;

import Calculator.myoperation.MyOperationFactory;

/**
 * Create by Zubritskiy Dmitriy on 11.03.2018
 * @author Zubritskiy Dmitriy
 * Основной класс пограммы
 */
public class ConsoleCalculator {
    public static void main(String[] args) {
        //Создаем экземпляр класса MyOperationFactory
        MyOperationFactory myOperationFactory = new MyOperationFactory();
        //Создаем экземпляр класса Calculator
        Calculator calc = new Calculator(myOperationFactory);
        calc.execution();

    }
}
