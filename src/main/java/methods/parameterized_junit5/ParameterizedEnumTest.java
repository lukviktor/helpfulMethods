package methods.parameterized_junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedEnumTest {
    /**
     * Параметризация с enum
     */
    public enum Colour {
        RED,
        GREEN,
        BLUE,
        ORANGE;

        public int getColourNumber() {
            switch (this) {
                case RED: {
                    return 1;
                }
                case GREEN: {
                    return 2;
                }
                case BLUE: {
                    return 3;
                }
                default: {
                    return 0;
                }

            }
        }
    }

    @ParameterizedTest
    @EnumSource(Colour.class) //В скобках укажи название класса, в котором хранится перечисление.ParameterizedEnumTest
    public void getColourNumberForAllIsLess4(Colour colour) {
        assertTrue(colour.getColourNumber() < 4);
    }
}
