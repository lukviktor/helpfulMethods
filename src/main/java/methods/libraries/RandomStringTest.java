package methods.libraries;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;


import java.util.Locale;
import java.util.Random;


public class RandomStringTest {
    private String ColorForTest;

    /*
        1. Случайные символы из UTF-8
        2. Случайные буквы
        3. Случайные числа
        4. Смесь букв и чисел
        5. Пример генерации имейла
         */
    @Test
    public void forDiplom_2(){
        String email = RandomStringUtils.randomAlphabetic(8) + "@mail.ru";
        String password = RandomStringUtils.randomAlphabetic(10);
        String name = RandomStringUtils.randomAlphabetic(8);
        System.out.println(email);
        System.out.println(password);
        System.out.println(name);
    }
    @Test
    public void testRandomString() {
        System.out.println(RandomStringUtils.random(3));
        System.out.println(RandomStringUtils.randomNumeric(5));
        System.out.println(RandomStringUtils.randomAlphabetic(10));
        System.out.println(RandomStringUtils.randomAlphanumeric(10));
        System.out.printf("autotest_%s@gmail.com", RandomStringUtils.randomAlphanumeric(5));
        System.out.println(RandomStringUtils.randomAlphanumeric(10) + "@gmail.com");

        System.out.printf("autotest_%s bun", RandomStringUtils.randomAlphanumeric(3));


        Random random = new Random();
        int count = random.nextInt(15);
        System.out.println(count);
        String actualName = RandomStringUtils.randomAlphanumeric(count);
        System.out.println(actualName);

    }

    @Test
    public void testFakerService() {
        FakeValuesService faker = new FakeValuesService(
                new Locale("ru-RU"), new RandomService());

        System.out.println(faker.letterify("????##@gmail.com"));
        System.out.println(faker.numerify("????##@gmail.com"));
        System.out.println(faker.bothify("????##@gmail.com"));
        System.out.println(faker.regexify("[а-яА-Я]{15}"));

    }

    @Test
    public void testColorService() {
        String colorForTest;
        String[] colour = new String[]{"black", "white", "green", "red",
                "blue", "brown", "orange", "yellow",
                "pink", "purple", "gray", "lilac",
                "сиреневый", "silver", "gold"}; // массив цветов
        int randomColour = new Random().nextInt(colour.length);
        colorForTest = colour[randomColour];
        System.out.println(colorForTest);
        System.out.format("%s %s", colorForTest, "dsfd");


    }

    @Test
    public void testFakerLocales() {
        Faker ukFaker = new Faker(new Locale("en-GB"));
        Faker usFaker = new Faker(new Locale("eu-DE"));

        System.out.printf("American zipcode: %s%n", usFaker.lorem().paragraph(50));
        System.out.printf("British postcode: %s%n", ukFaker.address().city());
    }

    @Test
    public void testFakerMethods() {
        Faker faker = new Faker();

        System.out.printf(faker.ancient().titan());
    }

    @Test
    public void testEnv() {
        System.out.println(Environment.BASE_URL);
    }

    @Test
    public void testEnvDev() {
        System.out.println(Environment.TEST_PARAM);
    }

    @Test
    public void testRandomChar() {
        Random r = new Random();
        String rus = "абвгдеёжзийклмнопрстуфхцчъыьэюя";
        String eng = "abcdefghijklmnopqrstuvwxyz";
        String dig = "0123456789";
        String sum = rus + rus.toUpperCase() +
                eng + eng.toUpperCase() +
                dig;
        char c = sum.charAt(r.nextInt(sum.length()) );
        System.out.println(c);
    }
}
