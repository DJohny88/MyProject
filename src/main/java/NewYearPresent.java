import Present.*;

import java.util.ArrayList;

/**
        * Create by Zubritskiy Dmitriy on 10.03.2018
        * @author Zubritskiy Dmitriy
        *
        */

public class NewYearPresent {

    public static void main(String[] args) {
       ArrayList<Present> list = new ArrayList<Present>(){
            {
                add(new Candy("Мишка косолапый", 100.0, 45.5, "Красный октябрь"));
                add(new Candy("Белочка", 100.0, 65.5, "Бабаевский"));
                add(new Candy("Маска", 100.0, 52.5, "Ротфронт"));
                add(new Jellybean("Фрутелла", 50.0, 88.2, "Жевательный"));
                add(new Jellybean("Фру-Фру", 50.0, 90.2, "Желейный"));
                add(new Chocolate("Милка", 100.0, 95.0, 534.0 ));
                add(new Chocolate("Alpen Gold", 100.0, 75.0, 532.0 ));
                add(new Biscuit("Oreo", 95.0, 48.5, "С карамелью"));
                add(new Biscuit("Бискотти", 95.0, 116.5, "С юзюмом"));

            }
        };

        double sumWeight = 0;
        double sumPrice = 0;

        for (int i = 0; i < list.size(); i++){
            sumWeight += list.get(i).getWeight();
            sumPrice += list.get(i).getPrice();
        }

        System.out.println("Вес подарка: " + sumWeight + " грамм");
        System.out.println("Цена подарка: " + sumPrice + " рублей");
        System.out.println("В подаочный набор входят:");
        for (Present somePresent : list) {
            System.out.println(somePresent.toString());
        }


    }
}
