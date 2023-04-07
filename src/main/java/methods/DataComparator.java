package methods;

import java.util.ArrayList;
import java.util.Comparator;

public class DataComparator {
    // создание компаратора:
    private static Comparator<Integer> INTEGER_COMPARATOR = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) { // метод принимает на вход два объекта с типом Integer - o1 и o2
            return o1 - o2;
        } // переопределили метод compare(), чтобы посчитать разницу между объектами
    };

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); // список целых чисел
        numbers.add(4);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        System.out.println(numbers); // вывели список до сортировки

        numbers.sort(INTEGER_COMPARATOR); // отсортировали список

        System.out.println(numbers); // вывели список после сортировки
    }
}
