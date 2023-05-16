package methods;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class TricksWithCyclicMethods {
    @Test
    void cyclicMethodsFor() {
        String trick = "Мир";

        for (int i =0; i < trick.length(); i++)
            System.out.println(trick);
    }
    @Test
    void cyclicMethodsWhile() {
        String trick = "Мир";

        int i =0;
        while (i < trick.length()) {
            System.out.println(trick);
            i++;
        }
    }
    @Test
    void cyclicMethods() {
        String trick = "Мир";

        int i =0;
        while (true) {
            if (i >= trick.length()) break;
            System.out.println(trick);
            i++;
        }
    }
    @Test
    void cyclicMethodsIntStreamForEach() {
        String trick = "Мир";

        IntStream.range(0, trick.length()).mapToObj(i -> trick).forEach(System.out::println);
    }

    @Test
    void cyclicMethodsIntStreamForEachOrdered() {
        String trick = "Мир";

        IntStream.range(0, trick.length()).mapToObj(i -> trick).forEachOrdered(System.out::println);
    }
}