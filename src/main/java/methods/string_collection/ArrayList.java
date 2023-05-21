package methods.string_collection;

import org.junit.jupiter.api.Test;

/**
 * Список на основе массива
 */
public class ArrayList {
    /** Пустой конструктор с начальной емкостью внутреннего массива = 10 */
    java.util.ArrayList<String> list = new java.util.ArrayList<>();

    /** Конструктор принимает другую коллекцию, создавая новый массив с элементами переданной коллекции: */
    java.util.ArrayList<String> list2 = new java.util.ArrayList<>(list);

    /** В качестве параметра конструктора выступает значения начального размера внутреннего массива */
    java.util.ArrayList<String> list3 = new java.util.ArrayList<>(10000);
    java.util.ArrayList<java.util.ArrayList<Double>> matrix = new java.util.ArrayList<>(); //В списке можно хранить даже другие списки:
    /**
     * Методы ArrayList:

     * add(E e) Добавляет новый элемент в конец списка. Возвращает boolean-значение (true — успех, false — не добавлено):

     * add(int index, E element) Добавляет элемент element в позицию index.
     * При добавлении происходит сдвиг всех элементов справа от указанного индекса на 1 позицию вправо

     * addAll(Collection <? extends E> collection) Добавление всех элементов коллекции collection
     * в список в порядке их расположения в collection.

     * addAll(int index, Collection <? extends E> collection) Добавление всех элементов collection в список начиная
     * с индекса index. При этом все элементы сдвинутся вправо на количество элементов в списке collection

     * clear() даление всех элементов из списка.

     * clone() Возвращает объект-копию массива:

     * contains(Object o) Проверка наличие объекта в списке, возвращает boolean-значение.

     * ensureCapacity(int minCapacity) Увеличивает размер внутреннего массива, чтобы в него поместилось количество элементов,
     * переданных в minCapacity. Если массив достаточно вместителен, никакие преобразования не производятся.

     * get(int index) Возвращает элемент, который расположен в указанной позиции списка

     * indexOf(Object o) Метод возвращает индекс первого вхождения элемента в списке.
     * Если элемента не существует в списке, метод вернет -1.

     * isEmpty() Метод возвращает true, если список пустой, false в обратном случае.
     * Если в списке содержатся только элементы null, метод вернет false. Иными словами, null элементы также учитываются этим методом.

     * iterator() Возвращает итератор для списка для последующего использования в цикле или при любой другой обработке.

     *lastIndexOf(Object o) Функционал метода похож на indexOf(), отличие в том,
     * что возвращается индекс последнего элемента в списке.

     * remove(int index) Удаление элемента в указанной позиции индекса.
     * После удаления сдвигает все элементы влево для заполнения освободившегося пространства

     * remove(Object o) Метод удаляет из списка переданный элемент o.
     * Если элемент присутствует в списке, он удаляется, а все элементы смещаются влево.
     * Если элемент существует в списке и успешно удален, метод возвращает true, в обратном случае — false.

     * removeAll(Collection<?> c) Если необходимо удалить несколько элементов,
     * не стоит делать это в цикле по условию: гораздо удобнее и безопаснее воспользоваться методом removeAll().
     * Он принимает коллекцию элементов, которая будет удалена из списка.

     * set(int index, E element) Замена элемента в указанной позиции index на переданный element.
     * Индекс также должен быть больше нуля и меньше индекса последнего элемента, иначе будет выброшено исключение IndexOutOfBoundsException.

     * size() Лучший способ (практически единственный) для того, чтобы узнать размер массива

     * sort(Comparator<? super E> c) Сортировка списка по заданному правилу.
     * Правило сортировки представляет собой реализованный интерфейс Comparator с переопределенным методом compareTo().
     * Переопределение нужно, если коллекция содержит объекты собственного класса. При работе со стандартными классами (Integer, String и так далее) переопределение compareTo() требуется только для нестандартной сортировки.

     * toArray() Превращает список в фиксированный массив.
     * Обратите внимание, что метод возвращает массив объектов (Object[]).
     * Если необходимо привести список в массив объектов определенного типа,
     * в качестве параметра в метод можно передать массив, куда будут перемещены элементы списков
     *
     */


    /**
     * forEach(Consumer<? super E> action)
     * Обработать в цикле ArrayList можно стандартными способами, цикл for или for-each
     */
    @Test
    public void forTest(){
        java.util.ArrayList<String> secondList = new java.util.ArrayList<>();
        secondList.add("раз");
        secondList.add("два");
        secondList.add("три");
        // Первый способ цикл for

        for(int i = 0; i< secondList.size(); i++) {
            System.out.println(secondList.get(i));
        }
    }

    @Test
    public void forEachTest(){
        java.util.ArrayList<String> secondList = new java.util.ArrayList<>();
        secondList.add("раз");
        secondList.add("два");
        secondList.add("три");
        // Второй способ цикл for-each:
        for(String s : secondList) {
            System.out.println("fghh" + s);
        }
    }
    @Test
    public void setList(java.util.ArrayList<String> list) {
        System.out.println(list);
        System.out.println(list2);

    }
}
