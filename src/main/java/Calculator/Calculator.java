package Calculator;

import Calculator.myoperation.MyOperation;
import Calculator.myoperation.OperationException;
import Calculator.operations.Operation;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create by Zubritskiy Dmitriy on 11.03.2018
 * @author Zubritskiy Dmitriy
 * @see #execution()
 * @see #Calculator(MyOperation)
 *
 */

public class Calculator {

    MyOperation myOperation;

    public Calculator(MyOperation myOperation){
        this.myOperation = myOperation;
    }
    //  Обеспечивает цикл ввода аргументов и вида операции
    //  и вывод результата операции
    public void execution(){

        boolean nextStep = true;                //  Условие выхода из цикла

        do {



            EnteringNumber enteringNumber = new EnteringNumber();
            enteringNumber.EnteringNumber1(); //ввод первого числа


            //  Ввод операции
            InputOperation inputOperation = new InputOperation();
            inputOperation.InputOperation();

            boolean flagSelectAnOperation = true;
            int operation = 0;
            do{
                Scanner inOperation = new Scanner(System.in);
                try{
                    operation = inOperation.nextInt();
                    if (operation == 1 || operation ==2 || operation ==3 || operation ==4){
                        flagSelectAnOperation = false;
                    }
                    else{
                        System.out.println("Вы ввели не корректное значение");
                        inputOperation.InputOperation();
                    }

                }
                catch (InputMismatchException e){
                    System.out.println("Вы ввели не корректное значение");
                    inputOperation.InputOperation();
                }

            }
            while (flagSelectAnOperation);


            //  Ввод второго агрумента

                enteringNumber.EnteringNumber2();


            //  Обработка операций над аргемунтами

            try{
                Operation op = myOperation.getOperationInterface(operation);
                if (op != null){
                    double o = op.execution(enteringNumber.getNumber1(), enteringNumber.getNumber2());

                    //System.out.println(op.execution(enteringNumber.getNumber1(), enteringNumber.getNumber2()));
                    System.out.print("Результат равен:\t");
                    System.out.println(o);
                }

            }
            catch (OperationException e){
                System.out.println(e.getMessage());

            }


            // Проверка на выход из цикла
            InputToContinue inputToContinue = new InputToContinue();
            inputToContinue.InputToContinue();

            boolean flagToContinue = true;
            do {
                Scanner in1 = new Scanner(System.in);
                try {
                    int whatDo = in1.nextInt();
                    if (whatDo == 1 ){
                        flagToContinue = false;
                    }
                    else if (whatDo == 2 ){
                        nextStep = false;
                        flagToContinue = false;
                    }
                     else{
                        System.out.println("Вы ввели не корректное значение");
                        inputToContinue.InputToContinue();
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Вы ввели не корректное значение");
                    inputToContinue.InputToContinue();

                }
            }
            while (flagToContinue);
        } while (nextStep);
    }
}
