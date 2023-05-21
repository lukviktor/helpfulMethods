package junit.parameterized_junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Параметризация с несколькими аргументами: метод
 * 1. Создать метод, который будет выдавать данные тесту
 * Нужен метод, который будет хранить данные и выдавать их тесту — одно значение за другим. Как конвейер:
 * 2. Написать аннотации
 * Аннотация @ParameterizedTest, которая делает тест параметризованным:
 * 3. Написать тестовый метод
 * Как условились в начале, он принимает два параметра — int age и boolean result:
 */
public class ParameterizedMethodTest {
    private boolean isAdult(int age) {
        return age >= 18;
    }

    @ParameterizedTest
    @MethodSource("isAdultTestData") //указали, откуда взять данные
    public void isAdultForBoundaryValuesIsValid(int age, boolean result) { //тестовый метод
        assertEquals(result, isAdult(age)); //тело метода
    }

    static Stream<Arguments> isAdultTestData() {
        return Stream.of(
                arguments(-1, false),
                arguments(0, false),
                arguments(17, false),
                arguments(18, true),
                arguments(21, true),
                arguments(19, true),
                arguments(25, true)
        );
    }
}
