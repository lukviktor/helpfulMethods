package junit;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class AssertMatchers {
    @Test
    public void assertEqualsTest() { // ОР эквивалентно ФР
        // сравнить целые числа
        int expectedInt = 4;  // ожидаемое значение
        int actualInt = 4;  // фактическое значение
        Assertions.assertEquals(expectedInt, actualInt);  // проверяет равенство чисел через метод assertEquals

        // сравнить дробные числа
        double expectedDouble = 180.00;  // ожидаемый результат
        double actualDouble = 180.04;  // фактический результат
        Assertions.assertEquals(expectedDouble, actualDouble, 0.05); // такое сравнение пройдёт без ошибок,
        // потому что разница между значениями не превышает delta = 0.05
    }

    @Test
    public void assertNotEqualsTest() { // одно не равно другому
        String unexpected = "Не знаю я, как шествуют богини";
        String actual = "Но милая ступает по земле";
        Assertions.assertNotEquals(unexpected, actual, "Строки не равны");// метод выполнится успешно, т.к. ожидает,
        // что строки unexpected и actual отличаются
    }

    @Test
    public void assertThatTest() { // проверить утверждение
        String actual = "Java";
        String expected = "va";
        MatcherAssert.assertThat(actual, containsString(expected)); // Матчер containsString проверяет, содержит ли одна строка другую
        // матчер передаётся в качестве аргумента в метод MatcherAssert.assertThat()
        // import static org.hamcrest.Matchers.*;  импорт матчера containsString
        // import org.hamcrest.MatcherAssert;  импорт класса MatcherAssert

        String jSign = "J";
        MatcherAssert.assertThat(actual, startsWith(jSign)); // Матчер startsWith проверяет, начинается ли одна строка с другой

        String vaLetters = "va";
        MatcherAssert.assertThat(actual, endsWith(vaLetters)); // Матчер endsWith проверяет, заканчивается ли одна строка другой

        // Матчер allOf проверяет, что аргумент метода assertThat соответствует всем условиям — матчерам-аргументам метода allOf
        MatcherAssert.assertThat(actual, allOf(containsString(vaLetters), startsWith(jSign))); // проверили сразу два условия с матчерами containsString и startsWith

        //Матчер anyOf проверяет, что аргумент метода assertThat соответствует хотя бы одному условию — матчеру-аргументу метода anyOf
        MatcherAssert.assertThat(actual, anyOf(endsWith(vaLetters), startsWith(jSign)));

        MatcherAssert.assertThat(actual, notNullValue()); // Матчер notNullValue() проверяет, что аргумент не null-значение

        MatcherAssert.assertThat(10, is(10)); // Матчер is проверяет, что один аргумент является другим:

        MatcherAssert.assertThat(10, is(not(11))); // Матчер not — логическое отрицание другого матчера
    }
}
