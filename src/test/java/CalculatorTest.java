import Calculator.myoperation.MyOperationFactory;
import Calculator.myoperation.OperationException;
import Calculator.operations.*;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {



    @Test
    public void testPlus(){
        OperationPlus operationPlus = new OperationPlus();
        double result = operationPlus.execution(2,2);
        if (result != 4){
            Assert.fail("Результат сложения чисел 2 и 2 должен быть равен 4");
        }
    }

    @Test
    public void testMinus(){
        OperationMinus operationMinus= new OperationMinus();
        Assert.assertEquals("результат вычитания чисел 2 и 2 должен быть равен 0",0, operationMinus.execution(2,2), 0);
    }

    @Test
    public void testMultiply(){
        OperationMultiply operationMultiply = new OperationMultiply();
        double result = operationMultiply.execution(4,4);
        if (result != 16){
            Assert.fail("Результат умножения 4 на 4 должен быть равен 16");
        }
    }

    @Test
    public void testDivision() throws OperationException {
        OperationDivision operationDivision = new OperationDivision();
        Assert.assertEquals("результат деления чисел 6 на 3 должен быть равен 2", 2, operationDivision.execution(6,3), 0);

    }

    @Test(expected = OperationException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() throws OperationException {
        OperationDivision operationDivision = new OperationDivision();
        operationDivision.execution(6,0);

    }
    @Test
    public void MyOperationPlus(){
        MyOperationFactory myOperationFactory = new MyOperationFactory();
        Operation nummberOperation = myOperationFactory.getOperationInterface(1);
        if (!(nummberOperation instanceof OperationPlus)){
            Assert.fail("Операция с типом 1 должна быть операция сложения");
        }
    }

    @Test
    public void MyOperationMinus(){
        MyOperationFactory myOperationFactory = new MyOperationFactory();
        Operation nummberOperation = myOperationFactory.getOperationInterface(2);
        if (!(nummberOperation instanceof OperationMinus)){
            Assert.fail("Операция с типом 2 должна быть операция Вычитания");
        }
    }

    @Test
    public void MyOperationMultiply(){
        MyOperationFactory myOperationFactory = new MyOperationFactory();
        Operation nummberOperation = myOperationFactory.getOperationInterface(3);
        if (!(nummberOperation instanceof OperationMultiply)){
            Assert.fail("Операция с типом 3 должна быть операция Умножение");
        }
    }

    @Test
    public void MyOperationDivision(){
        MyOperationFactory myOperationFactory = new MyOperationFactory();
        Operation nummberOperation = myOperationFactory.getOperationInterface(4);
        if (!(nummberOperation instanceof OperationDivision)){
            Assert.fail("Операция с типом 4 должна быть операция Деления");
        }
    }

    @Test
    public void MyOperationDefault(){
        MyOperationFactory myOperationFactory = new MyOperationFactory();
        Operation nummberOperation = myOperationFactory.getOperationInterface(0);
        Assert.assertEquals("Введена не корректная операция", null, nummberOperation);
    }
}
