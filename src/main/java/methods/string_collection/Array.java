package methods.string_collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Array {
    boolean[] digitsBoolean = new boolean[3];

    public int[] digitsInt = {0, 3, 7, 9};
    String[] digitsString = {"one", "two"};
    @Test
    public void arrayBooleanTest(){
        digitsBoolean[0] = true;
        digitsBoolean[1] = false;
        digitsBoolean[2] = true;
        for (int i = 0; i < digitsBoolean.length; i++) {
            System.out.println(digitsBoolean[i]);
        }
        for (boolean b : digitsBoolean) {
            System.out.println(b);
        }
    }
    @Test
    public void arrayTest() {
        System.out.println(digitsString);
        System.out.println(Arrays.stream(digitsInt).max()); // max значение
        System.out.println(digitsString.length);
        System.out.println(Arrays.stream(digitsString).count());
    }

    @Test
    public void cikleForArrayTest() {
        // Цикл начинается с 0 и продолжается, пока i строго меньше длины массива
        // Переменная итерирования ставится на место индекса, так все элементы будут напечатаны
        for (int j : digitsInt) {
            System.out.print("Элемент - " + j + ", ");
        }
        for (int i =0; i < digitsString.length; i++) {
            System.out.println("В массиве есть элемент: " + i + " И он равен: " + digitsString[i]);
        }

        digitsBoolean[0] = true;
        digitsBoolean[1] = false;
        digitsBoolean[2] = true;
        for (boolean b : digitsBoolean) {
            System.out.println(b);
        }
    }
}
