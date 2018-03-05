public class MaxMinNumber {
    public static void main(String[] args) {
        int[] array = new int[20];  //Инициализация масива размерностью 20
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int nMax = 0;
        int nMin = 0;

        for (int i = 0; i < 20; i++){
             array[i] = (int)(Math.random()*(20+1))-10; // Заполнение масива числами от -10 до 10
            if (array[i] < min) {
                min = array[i];
                nMin = i;

            }
            else if (array[i] > max) {
                max = array[i];
                nMax = i;
            }
            System.out.print(array[i] + " ");

            }
        System.out.println();
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Номер Минимального элемента в массиве " + nMin);
        System.out.println("Номер Максимального элеманта в массиве " + nMax);
        array[nMin] = max;
        array[nMax] = min;
        for (int i = 0; i < 20; i++){
            System.out.print(array[i] + " ");
        }
        }



    }

