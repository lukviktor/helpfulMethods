package methods.string_collection;

import org.junit.jupiter.api.Test;

public class StringPro {
    /**
     * Методы класса String
     * Посчитать символы — length()
     * Проверить, пустая ли строка, — isEmpty() или isBlank()
     * Удалить пробелы в начале и конце строки — trim()
     * Сделать буквы заглавными — `toUpperCase()`.
     * Сделать буквы маленькими — `toLowerCase()`.
     * <p>
     * Методы подстрок
     * Найти индекс начала подстроки — indexOf() и lastIndexOf()
     * Вернуть символ по индексу, который ты укажешь, — charAt()
     * Метод `contains(String other)`. Вернёт `true`, если подстрока содержится в любом месте строки. Например, «**юмор**» в «окс**юмор**он» — `"оксюморон".contains("юмор")`
     * Метод `startsWith(String other)` вернёт `true`, если подстрока содержится в начале строки. Например, «**ок**» в «**ок**сюморон» — `"оксюморон".startsWith("ок")`.
     * Метод `endsWith(String other)` вернёт `true`, если подстрока содержится в конце строки. Например, «**он**» в «оксюмор**он**» — `"оксюморон".endsWith("он")` .
     * Метод substring(int beginIndex, int endIndex) возьмёт подстроку с индекса beginIndex до endIndex
     * Метод replace(String target, String replacement) меняет все вхождения подстроки target на строку replacement. Например, "раз два, раз два".replace("раз", "три")
     * Чтобы превратить строку в массив, есть метод split(String regex). Он превращает строку в массив строк String[].
     * Статический метод `join(String delimeter, String... strs)` превращает несколько элементов в строку.
     * Аргумент `delimiter` — это разделитель, а `strs` — это строки. Простыми словами, метод склеивает строки `strs` через разделитель `delimiter`
     * String.join() может принимать вторым аргументом массив.
     * Форматирование — способ создавать или выводить строки определённым образом.
     * Поможет метод `format(String format, Object... args)`
     */
    @Test
    public void stringMethodsTest() {
        String myString = " Hello World ";
        System.out.println(myString.length());
        System.out.println(myString.isEmpty());
        System.out.println(myString.isBlank());
        System.out.println(myString.trim());
        System.out.println(myString.equals(myString.trim()));
        System.out.println(myString.toUpperCase().trim());
    }

    @Test
    public void joinMethods() {
        String dish1 = "борщ";
        String dish2 = "котлета";
        String dish3 = "компот";
        String allDishes = String.join(", ", dish1, dish2, dish3); // разделитель — запятая с пробелом
        System.out.println(allDishes);
        String[] arrayOfDishes = {"Мясо", "Рыбы"};
        System.out.println(arrayOfDishes); // Выведет аброкадабру
        System.out.println(String.join(", ", arrayOfDishes));
    }

    @Test
    public void formatMethods() {
        // создаёшь строку с помощью format
        String apple1 = "антоновка";
        String apple2 = "белый налив";
        String apple3 = "апорт";
        String myApples = String.format("Собрали яблоки трёх сортов: %s, %s и %s", apple1, apple2, apple3);
        // выводишь готовую строку в консоль
        System.out.println(myApples);
        // выведет на экран "Собрали яблоки трёх сортов: антоновка, белый налив и апорт"
        /*
        Какие символы преобразования нужны:
                - `'%s'` для строк;
                - `'%b'` для булевых значений;
                - `'%d'` для целых чисел;
                - `'%f'` для чисел с плавающей запятой;
                - `'%c'` для символов, например `char` и `Character`.
         */

        String potatoes = "Картошка, мешки, 8";
        System.out.printf("'%25s'", potatoes);    // выравнивание по правому краю "       Картошка, мешки, 8"
        System.out.print("\n");
        System.out.printf("'%-25s'", potatoes); // Выровнять по левому краю "Картошка, мешки, 8       "
        System.out.print("\n");
        System.out.printf("'%1.8s'", potatoes); // выведет не менее 1 символа и не более 15, то есть "Картошка"
    }

    @Test
    public void methodsStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, "); // Добавляет строку-аргумент в конец объекта
        sb.append("World!");
        System.out.println(sb); // выведет строку "Hello, World!"

        StringBuilder sbRepl = new StringBuilder("Hillo, World!");
        sbRepl.replace(1, 2, "e"); // Заменяет подстроку с индекса from включительно до to не включительно на замену replacement
        System.out.println(sbRepl);  // выведет строку "Hello, World!"

        String result = sb.substring(7, 9); // Берёт подстроку от StringBuilder
        System.out.println(result);  // выведет строку "Wo"

        StringBuilder sbB = new StringBuilder("HellWorld!");
        sbB.insert(4, "o, "); // Вставляет строку str начиная с позиции index
        System.out.println(sbB);  // выведет "Hello, World!"

        StringBuilder sbD = new StringBuilder("Hello, World!");
        sbD.deleteCharAt(12); // Вставляет строку str начиная с позиции index
        System.out.println(sbD);  // выведет "Hello, World"

        StringBuilder sbSL = new StringBuilder("Hello, World!");
        sbSL.setLength(5); // Устанавливает длину для StringBuilder. Все лишние символы удалятся
        System.out.println(sbSL);  // выведет "Hello"

        StringBuilder sbRev = new StringBuilder("hello");
        sbRev.reverse();   // Перевернёт строку
        System.out.println(sbRev); // выведет строку "olleh"
    }
}
