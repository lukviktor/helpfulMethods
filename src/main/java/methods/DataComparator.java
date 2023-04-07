package methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataComparator {
    // создание компаратора:
    private static Comparator<Integer> INTEGER_COMPARATOR = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) { // метод принимает на вход два объекта с типом Integer - o1 и o2
            return o1 - o2;
        } // переопределили метод compare(), чтобы посчитать разницу между объектами
    };

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        Collections.sort(numbers, (item1, item2)-> {
            return item2 - item1;
        });
        System.out.println(numbers); // вывели список до сортировки
        System.out.println();

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(4);
        numbers1.add(3);
        numbers1.add(1);
        numbers1.add(2);
        Collections.sort(numbers1, (item1, item2)-> {
            return item1 - item2;
        });
        System.out.println(numbers1);
        System.out.println();


        ArrayList<Integer> numbers2 = new ArrayList<>(); // список целых чисел
        numbers2.add(4);
        numbers2.add(3);
        numbers2.add(1);
        numbers2.add(2);

        System.out.println();
        System.out.println(numbers2); // вывели список до сортировки

        numbers2.sort(INTEGER_COMPARATOR); // отсортировали список

        System.out.println(numbers2); // вывели список после сортировки


    }
}
