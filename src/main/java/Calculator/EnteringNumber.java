package Calculator;


import java.util.Scanner;


/**
 * Create by Zubritskiy Dmitriy on 11.03.2018
 * @author Zubritskiy Dmitriy
 * @see #EnteringNumber1()
 * @see #EnteringNumber2()
 * @see #getNumber1()
 * @see #getNumber2()
 * @see #setNumber1(double)
 * @see #setNumber2(double)
 * Класс предназначен для обработки введеных чисел
 */

public class EnteringNumber {

    private double number1;
    private  double number2;


    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber1() {
        return number1;
    }


    /**
     *
     * @return double getNumber1() возрашает первое введеное число
     */
    public double EnteringNumber1() {

        boolean flag = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число:");
            if (scanner.hasNextDouble()) {
                setNumber1(scanner.nextDouble());
                flag = false;
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");

            }
        }
            while (flag) ;
            return getNumber1();
        }

    /**
     *
     * @return double getNumber2() возрашает второе введеное число
     */
    public double EnteringNumber2(){
        boolean flag = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите второе число:");
            if (scanner.hasNextDouble()) {
                setNumber2(scanner.nextDouble());
                flag = false;
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            }
        }
             while (flag) ;
            return getNumber2();
    }
}
