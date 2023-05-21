package methods.string_collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class List {
    /**
     * Как создать список (ArrayList) из массива
     * <p>
     * Метод Arrays.asList() переводится как «массив в виде списка».
     * Если ему передать массив элементов в виде аргумента, он превратит его в список
     * <p>
     * toArray() превратить список обратно в массив
     * <p>
     * List.of() - статический метод, создать список из массива
     * Если создать список через List.of() или Arrays.asList(), в них уже нельзя добавить или удалить элемент.
     * Эти методы подойдут, если тебе не нужно менять список.
     */
    java.util.List<String> cities = Arrays.asList("Воронеж", "Южно-Сахалинск", "Иркутск"); // создали и заполнили список
    //Обрати внимание: такой список создают через интерфейс List, а не класс ArrayList.
    // Если создать через ArrayList, будет ошибка компиляции.
    String[] citiesArray = cities.toArray(new String[]{}); // превратили список в массив
    java.util.List<String> sea = java.util.List.of("Черное", "Красное", "Мертвое");
    public void list(){
        System.out.println("1: " + cities);
        System.out.println("2: " + citiesArray);
        System.out.println("3: " +Arrays.toString(citiesArray));

        System.out.println("4: " + sea);
        System.out.print("5: ");
        for (String city: citiesArray) {
            System.out.print(city + ", ");
        }
    }
    @Test
    public void listTest(){
        list();
    }
}
