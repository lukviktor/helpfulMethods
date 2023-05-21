package junit.parameterized_junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Допустим, метод isAdult() принимает возраст пользователя. Он возвращает:
 * true, если пользователь старше 18 лет;
 * false во всех остальных случаях.
 * Допустим, проверяем сначала позитивные сценарии.
 * Если пользователь правда совершеннолетний, метод выдаёт true.
 * Для этого нужно проверить три значения: 18, 19, 25.
 */
public class ParameterizedValueSourceTest {
    private boolean isAdult(int age) {
        return age >= 18;
    }

    /**
     * Параметризация через значения
     * <p>
     * Аннотация @ParameterizedTest. Чтобы фреймворк JUnit понял, что тест нужно запускать с параметрами, используют аннотацию.
     * <p>
     * Она показывает, какие значения передают в аргумент теста.
     * В качестве значений передаётся массив. Упаковываем все три значения в массив из целых чисел:
     * Можно использовать массив с booleans, strings, bytes
     */
    @ParameterizedTest // Позитивный тест
    @ValueSource(ints = {18, 19, 25, 21})

    public void isAdultForAbove17IsTrue(int age) {
        assertTrue(isAdult(age));
    }

    @ParameterizedTest // Негативный тест
    @ValueSource(ints = {-1, 0, 17}) //напиши аннотацию и задай значения
    public void isAdultForBelow17IsTrue(int age) {
        assertFalse(isAdult(age));//напиши проверку
    }

}
