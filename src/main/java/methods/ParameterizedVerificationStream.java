package methods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParameterizedVerificationStream {
    private boolean isAdult(int age) {
        if (age >= 18) {return true;}
        return false;
    }
    static Stream<Arguments> isAdultTestData() {
        return Stream.of( //поможет передавать аргументы по очереди тесту
                //тут будут аргументы
                arguments(-1, false),
                arguments(0, false),
                arguments(17, false),
                arguments(18, true),
                arguments(19, true),
                arguments(25, true)
        );
    }
    @ParameterizedTest
    @MethodSource("isAdultTestData")
    public void isAdultForBoundaryValuesIsValid(int age, boolean result) { //тестовый метод
        assertEquals(result, isAdult(age)); //тело метода
    }


}
