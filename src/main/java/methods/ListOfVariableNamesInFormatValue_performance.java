package methods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfVariableNamesInFormatValue_performance {
    /**
     * Список имен переменных в формате значение_переменной
     * В результате выполнения данного кода, мы получим список имен переменных в формате "name(i): значение_переменной".
     * Функция eval(name) должна получить значение переменной по ее имени. В Java это можно сделать с помощью рефлексии.
     * Эта функция будет работать с классом, который имеет перечисленные поля в данном случае ListOfVariableNamesInFormatValue_performance
     * Переменная field получает объект Field, который представляет собой поле класса.
     * Метод get получает значение поля для объекта класса, который передается в качестве параметра,
     * в данном случае это новый объект класса Name.
     * Метод toString() используется для преобразования значения поля в строку.
     */
    public String eval(String name) {

        try {
            Field field = ListOfVariableNamesInFormatValue_performance.class.getDeclaredField(name);
            Object value = field.get(new ListOfVariableNamesInFormatValue_performance());
            return value.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    String name1 = "ZleiA";
    String name2 = "UEZhG";
    String name3 = "eCYoI";
    String name4 = "ucyKc";
    String name5 = "tXxTE";
    String name6 = "PRbzO";
    String name7 = "jehlV";
    String name8 = "RtDBk";
    String name9 = "pEyqk";
    String name10 = "yyvEs";

    @Test
    public void name() {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            String name = "name" + i;
            names.add(eval(name));

        }
        System.out.println(names);
    }

    @Test
    public void nameForStream() {
        ArrayList<String> names = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> "name" + i)
                .map(name -> name + ": " + eval(name))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(names);
    }


}
