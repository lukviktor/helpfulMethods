package methods.string_collection;

import org.junit.jupiter.api.Test;

public class HashMap {
    /**
     * хеш-таблица
     * В хеш-таблице (англ. hash map) кроме значений хранятся их ключи — уникальные идентификаторы.
     * По ключу можно найти значение, поэтому он уникален: двух одинаковых ключей в хеш-таблице быть не может.
     * Значения могут повторяться.
     * Индексы в списках и массивах добавляются автоматически. Ключи в хеш-таблице обязательно указывать, когда добавляешь элементы.
     * Как и списки, хеш-таблицы работают только со ссылочными типами, а вместо примитивов в них указывают классы-обёртки
     */

    /**
     * Чтобы создать хеш-таблицу, нужно вызвать конструктор класса HashMap.
     * В угловых скобках можно указать тип ключа и значения — такие же, как при объявлении.
     * Это необязательно: можно оставить эти скобки пустыми. В конце пишут пустые круглые скобки
     */

    /**
     * Методы Хеш-таблицы:
     * put(K key, V value) - добавить элементы (англ. put — «поместить», key — «ключ», value — «значение»)
     * get(Object key) - Получить значение из хеш-таблицы можно по ключу
     * values() - выводит все значения из таблицы
     * keySet() - выводит все ключи из таблицы
     * remove(Object key) - удалить элемент хеш-таблицы
     * clear() - полностью очистить хеш-таблицу
     * containsKey(Object key) (англ. «содержит ключ») ищет в таблице ключ, вернёт true, если нет — false
     * containsValue(Object value) (англ. «содержит значение») — ищет в таблице значение, вернёт true, если нет — false
     */
    java.util.HashMap<String, Double> planetsWeight;


public void officeTool(){
    /*
    HashMap<String, String> officeTool; // объявили хеш-таблицу
    officeTool = new HashMap<String, String>(); // создали объект
    officeTool = new HashMap<>(); // так тоже можно
    */
    java.util.HashMap<String, String> officeTool = new java.util.HashMap<>();
    officeTool.put("S234", "Большой степлер"); // добавить элементы
    officeTool.put("P342", "Чёрно-белый принтер из коридора");
    officeTool.put("N845", "Острые ножницы");
    // добавили три элемента
    System.out.println(officeTool); // напечатали элементы
    officeTool.put("P342", "Принтер из офиса 42");
    // Ключу в хеш-таблице можно присвоить другое значение
    // теперь ключу P342 соответствует значение "Принтер из офиса 42"
    System.out.println(officeTool);

    // найти значение по ключу
    String tool = officeTool.get("N845");
    System.out.println(tool);
}
    public void officeToolValue(){
        /**
         * Обычно элементы хеш-таблицы ищут по ключу.
         * Если он неизвестен, поможет цикл for each и метод values(): он выводит все значения из таблицы.
         */
        java.util.HashMap<String, String> officeTool = new java.util.HashMap<>();
        officeTool.put("S234", "Большой степлер");
        officeTool.put("P342", "Чёрно-белый принтер");
        officeTool.put("N845", "Острые ножницы");

        for (String tool : officeTool.values()) {
            if (tool.equals("Острые ножницы")) {
                System.out.println(tool); // выведется "Острые ножницы"
            }
        }

        java.util.HashMap<String, Double> kittenWeights = new java.util.HashMap<>();

        kittenWeights.put("Пушок", 1.62);
        kittenWeights.put("Снежок", 1.91);
        kittenWeights.put("Черныш", 1.96);
        kittenWeights.put("Ушастик", 2.02);
        kittenWeights.put("Рыжик", 1.88);

        // создай переменную kittenWeightsSum со значением 0
        double kittenWeightsSum = 0;
        // получи вес каждого котёнка oneKittenWeight
        // и прибавь его к переменной суммарного веса
        for (Double Sum : kittenWeights.values()) {
            kittenWeightsSum = kittenWeightsSum + Sum;
        }

        // выведи на экран суммарный вес котят
        System.out.println("Суммарный вес котят: " + kittenWeightsSum + " кг");
    }
    public void officeToolKeySet(){
        /**
         * Если нужно получить все ключи хеш-таблицы, понадобится метод keySet() (англ. «набор ключей») и цикл for each.
         */
        java.util.HashMap<String, String> officeTool = new java.util.HashMap<>();
        officeTool.put("S234", "Большой степлер");
        officeTool.put("P342", "Чёрно-белый принтер");
        officeTool.put("N845", "Острые ножницы");
        System.out.println(officeTool.keySet());

        for (String inventory : officeTool.keySet()) {
            System.out.println(inventory);
        }
    }
    public void officeToolRemoveClear(){
        java.util.HashMap<String, String> officeTool = new java.util.HashMap<>();
        officeTool.put("S234", "Большой степлер");
        officeTool.put("P342", "Чёрно-белый принтер");
        officeTool.put("N845", "Острые ножницы");
        System.out.println(officeTool.get("P342"));
        officeTool.remove("P342");
        System.out.println(officeTool.get("P342"));
        officeTool.clear();
        System.out.println(officeTool);
    }
    @Test
    public void officeToolRemoveClearTest(){
        officeToolRemoveClear();
    }
    @Test
    public void officeToolKeySetTest(){
    officeToolKeySet();
    }
    @Test
    public void printHashMapValueTest(){
        officeToolValue();
    }
@Test
    public void printHashMapTest(){
    officeTool();
}
}
