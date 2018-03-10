/**
 * Create by Zubritskiy Dmitriy on 10.03.2018
 * Задание №4
 * Подсчет минимального положительного числа включает 0(как положительное число)
 *@author Zubritskiy Dmitriy
 *
 */

public class MaxMinNumber {
    public static void main(String[] args) {
        int[] array = new int[20];  //Инициализация масива размерностью 20
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int nMax = 0;
        int nMin = 0;

        for (int i = 0; i < 20; i++){
             array[i] = (int)(Math.random()*(20+1))-10; // Заполнение масива числами от -10 до 10
            if (array[i] > min && array[i] < 0) {
                min = array[i];
                nMin = i;

            }
            else if (array[i] < max && array[i] >= 0) {

                    max = array[i];
                    nMax = i;


            }
            System.out.print(array[i] + " ");

            }
        System.out.println();
        System.out.println("Максимальное отрицательное число: " + min);
        System.out.println("Минимальное положительное число: " + max);
        System.out.println("Номер максимального отрицательного элемента в массиве " + nMin);
        System.out.println("Номер минимального положительного элеманта в массиве " + nMax);
        array[nMin] = max;
        array[nMax] = min;
        for (int i = 0; i < 20; i++){
            System.out.print(array[i] + " ");
        }
        }



    }

