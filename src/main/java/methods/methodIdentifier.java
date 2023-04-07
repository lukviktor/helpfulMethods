package methods;

import java.util.Random;

public class methodIdentifier {
    public static void main(String[] args) {


        Card card = new Card("Москва - " + new Random().nextInt(10),
                "https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenium.jpg");
    }

    private static class Card {
        public Card(String s, String s1) {
        }
    }
}