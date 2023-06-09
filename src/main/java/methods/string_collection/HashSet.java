package methods.string_collection;

import org.junit.jupiter.api.Test;

public class HashSet {
    /**
     * Во фреймворке коллекций есть структура данных **множество** (англ. set). Чаще всего для них используют класс `HashSet`.
     * Множество похоже на список: оно реализует интерфейс `Collection`, и по нему можно итерироваться.
     * Отличия множества от списка:
     * - Элементы уникальны. В списке элементы могут повторяться, а в множество не получится добавить один объект несколько раз.
     * Поэтому множества применяют, когда нужно создать набор данных без дубликатов.
     * - Порядок элементов не определён. Если проитерироваться по элементам множества, они выведутся в произвольном порядке.
     */
    @Test
    public void hashSetTest() {
        java.util.HashSet<String> colorsSet = new java.util.HashSet(); // создали множество
        // Элементы в множество добавляют так же, как в список, — методом add().
        colorsSet.add("Синий");
        colorsSet.add("Красный");
        colorsSet.add("Зелёный");
        colorsSet.add("Фиолетовый");
        colorsSet.add("Оранжевый"); // добавили цвета
        System.out.println(colorsSet); // вывели множество на экран, выведутся в произвольном порядке

    }
}
