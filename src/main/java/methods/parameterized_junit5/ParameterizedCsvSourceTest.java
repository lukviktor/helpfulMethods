package methods.parameterized_junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Параметризация с несколькими аргументами: csv
 * Что такое csv-файл
 * Это файл, в котором хранятся табличные значения
 * Можно сказать, это как если бы Excel-файл переписали в заметку с помощью запятых.
 * Разделитель может быть и другим, но запятая используется по умолчанию.
 * В тестах с этим форматом можно работать двумя способами:
 * прямо в тесте,
 * создать файл извне теста и подтягивать значения из этого внешнего файла.
 * <p>
 * * Данные из csv-файла
 * * Принцип такой: ты создаёшь отдельный файл csv в IDE и обращаешься к нему из теста.
 * * Создать csv-файлы в IDE
 * * Нужно добавить csv-файлы в папку resources:
 * * нажми «создать файл»,
 * * выбери расширение csv.
 * * Не забудь отметить папку resources как Test Resources в IDE.
 * * Это нужно, чтобы указать файл в аннотации теста: программа найдет его по имени.
 */
public class ParameterizedCsvSourceTest {
    private boolean isAdult(int age) {
        return age >= 18;
    }

    @ParameterizedTest
    @CsvSource({
            "-1, false",
            "0, false",
            "17, false",
            "18, true",
            "19, true",
            "25, true"
    })
    public void isAdultForBoundaryValuesIsValid(int age, boolean result) {
        assertEquals(result, isAdult(age));
    }
}