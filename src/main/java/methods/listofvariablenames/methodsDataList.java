package methods.listofvariablenames;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static methods.listofvariablenames.ConstantData.*;


public class methodsDataList {
    HashMap<String, String> basicPrinciplesTesting = new HashMap<>(); // HashMap Основные принципы тестирования
    ArrayList<String> principlesNumber = new ArrayList<>(); // ArrayList Основные принципы тестирования номер

    @Step("Функция eval(name) должна получить значение переменной по ее имени")
    public String eval(String name) { // получить значение переменной по ее имени
        try {
            Field field = ConstantData.class.getDeclaredField(name); // ConstantData - класс где лежат переменные
            Object value = field.get(new ConstantData());
            return value.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Step("Создаем метод для добавление данных ArrayList через Stream")
    public ArrayList<String> methodsArray(int firstElement, int SecondElement, String nameField) {
        return IntStream
                .rangeClosed(firstElement, SecondElement)
                .mapToObj(i -> nameField + i)
                .map(this::eval)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Step("Создаем ArrayList Основные принципы тестирования номер")
    public ArrayList<String> principlesNumber() {
        for (int i = 1; i <= 7; i++)
            principlesNumber.add("Принцип тестирования " + i);
        return principlesNumber;
    }

    @Step("Создаем ArrayList через Stream")
    public ArrayList<String> principlesTesting() {
        return IntStream
                .rangeClosed(1, 7)
                .mapToObj(i -> "PRINCIPLES_TESTING_" + i)
                .map(this::eval)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Step("Создаем ArrayList через цикл for")
    public ArrayList<String> principlesTestingDescription() {
        ArrayList<String> principlesTestingDescription = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            String name = "PRINCIPLES_TESTING_DESCRIPTION_" + i;
            principlesTestingDescription.add(eval(name));
        }
        return principlesTestingDescription;
    }

    @Step("HashMap Основные принципы тестирования")
    public HashMap<String, String> basicPrinciplesTesting() {
        IntStream.range(0, principlesNumber().size()).forEach(i ->
                basicPrinciplesTesting.put(principlesNumber().get(i), principlesTesting().get(i) + ": " + principlesTestingDescription().get(i)));
        return basicPrinciplesTesting;
    }

    @Step("Название принципов тестирования по шпаргалке тестировщика")
    public ArrayList<String> principle() {
        return methodsArray(1, 7, "principle");
    }

    @Test
    public void principlesTestingTest() {
        System.out.println(principle());

    }

    @Step("Ответ по принципам тестирования по шпаргалке тестировщика")
    public ArrayList<String> explanation() {
        return new ArrayList<>(Arrays.asList(
                explanation1,
                explanation2,
                explanation3,
                explanation4,
                explanation5,
                explanation6,
                explanation7
        ));
    }

    @Test
    public void explanationTest() {
        System.out.println(explanation().isEmpty());
        System.out.println(explanation().size());
        System.out.println(explanation());
    }

    @Step("Ответ по принципам тестирования по шпаргалке тестировщика")
    public ArrayList<String> explanationRef() {
        return methodsArray(1, 7, "explanation");
    }

    @Test
    public void explanationRefTest() {
        Assertions.assertEquals(explanation().isEmpty(), explanationRef().isEmpty());
        Assertions.assertEquals(explanation().size(), explanationRef().size());
        Assertions.assertEquals(explanation(), explanationRef());

    }

    @Step("шпаргалка начинающего тестировщика")
    public HashMap<String, String> beginnerTesterCheatSheet() {
        HashMap<String, String> testingPrinciples = new HashMap<>();
        IntStream.range(0, principle().size()).forEach(i ->
                testingPrinciples.put(principle().get(i), explanation().get(i)));
        return testingPrinciples;
    }
}
