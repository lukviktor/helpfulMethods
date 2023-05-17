package methods.string_collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    /**
     * В LinkedList элементы фактически представляют собой звенья одной цепи.
     * У каждого элемента помимо тех данных, которые он хранит, имеется ссылка на предыдущий и следующий элемент.
     * По этим ссылкам можно переходить от одного элемента к другому

     * У LinkedList есть много общих с ArrayList методов.
     * Например, такие методы как add(), remove(), indexOf(), clear(), contains() (содержится ли элемент в списке),
     * set() (вставка элемента с заменой) и size() есть в обоих классах.

     * Хотя (как мы выяснили на примере add() и remove()) внутри многие из них работают по другому,
     * но в конечном итоге они делают то же самое.

     * Однако, у LinkedList есть отдельные методы для работы с началом и концом списка, которых нет в ArrayList:
     * addFirst(), addLast(): методы для добавления элемента в начало/конец списка
     */

    /**
     * Прежде всего, в работе с серединой списка. Вставка и удаление в середину LinkedList устроены гораздо проще,
     * чем в ArrayList. Мы просто переопределяем ссылки соседних элементов, а ненужный элемент “выпадает” из цепочки ссылок.

     * В то время как в ArrayList мы:
     * проверяем, хватает ли места (при вставке)
     * если не хватает — создаем новый массив и копируем туда данные (при вставке)
     * удаляем/вставляем элемент, и сдвигаем все остальные элементы вправо/влево (в зависимости от типа операции).
     * Причем сложность этого процесса сильно зависит от размера списка. Одно дело — скопировать/сдвинуть 10 элементов,
     * и совсем другое — сделать то же самое с миллионом элементов.
     * То есть, если в твоей программе чаще происходят операции вставки/удаления с серединой списка,
     * LinkedList должен быть быстрее, чем ArrayList.
     */
   // @Test
    public void ArrayListTest() {
        String str1 = "Hello World!";
        String str2 = "My name is Earl";
        String str3 = "I love Java";
        String str4 = "I live in Moscow";
        ArrayList<String> earlBio = new ArrayList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);
        earlBio.add(str4);
        System.out.println(earlBio);
    }

    //@Test
    public void LinkedListTest(){
        String str1 = "Hello World!";
        String str2 = "My name is Earl";
        String str3 = "I love Java";
        String str4 = "I live in Moscow";
        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);
        earlBio.add(str4);
        System.out.println(earlBio);
    }

    @Test
    public void timeLinkedList(){
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5_000_000; i++) {
            list.add(new Integer(i));
        }

        long start=System.currentTimeMillis();

        for(int i=0;i<100;i++){
            list.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis()-start));
    }

    @Test
    public void timeArrayList(){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5_000_000; i++) {
            list.add(new Integer(i));
        }

        long start=System.currentTimeMillis();

        for (int i=0;i<100;i++){
            list.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы для ArrayList (в миллисекундах) = " + (System.currentTimeMillis()-start));

    }
}
