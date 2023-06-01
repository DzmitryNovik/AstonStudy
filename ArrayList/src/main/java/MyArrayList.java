import java.util.Iterator;

/**
 * Реализация параметризованного динамического массива. Основан на стардартном массиве,
 * однако автоматически расширяется при его заполнении. В случае удаления части элементов
 * массив сужается для экономии ресурсов компьютера.
 */
public class MyArrayList<T> implements MyList<T>{
    private final int INIT_SIZE = 10;
    private T[] array;
    private int pointer = 0;

    /**
     * Конструктор без аргументов. При вызове инициализирует массив array, в котором и хранятся
     * ссылки на необходимые объекты.
     */
    public MyArrayList() {
        array = (T[]) new Object[INIT_SIZE];
    }

    /**
     * Метод последовательно добавляет по одному элементу в коллекцию. При достижении границ
     * массива вызывает метод, расширяющий массив вдвое. На вход принимает элемент, который
     * необходимо добавить.
     */
    public void add(T element) {
        if (pointer == array.length - 1) {
            increaseSize(array.length * 2);
        }
        array[pointer++] = element;
    }

    /**
     * Перегруженный метод add. Добавляет элемент по индексу. Если ячейка массива занята,
     * все элементы с места вставки сдвигаются направо, освобождая место для вставки.
     * При достижении границ массива вызывает метод, расширяющий массив вдвое.
     * На вход принимает индекс массива и элемент для вставки.
     */
    public void add(int index, T element) {
        if (index == array.length - 2) {
            increaseSize(array.length * 2);
        }

        if (array[index] != null) {
            if (array.length - 1 - index >= 0)
                System.arraycopy(array, index, array, index + 1, array.length - 1 - index);
        }
        array[index] = element;
        pointer++;
    }

    /**
     * Метод перезаписывает значение в ячейке массива. На вход принимает индекс ячейки и элемент,
     * который необходимо записать.
     */
    public void update(int index, T element) {
        if (index < array.length) {
            array[index] = element;
        }
    }

    /**
    * Метод принимает га вход индекс возвращает элемент списка по этому индексу.
    */
    public T get(int index) {
        return array[index];
    }

    /**
    * Удаляет элемент списка по индексу. Все элементы справа от удаляемого
    * перемещаются на шаг налево. Если после удаления количество
    * элементов стало в cutRate раз меньше чем размер внутреннего массива,
    * то внутренний массив уменьшается в два раза, для экономии занимаемого
    * места. На вход принимает индекс массива для вставки.
    */
    public void delete(int index) {
        for (int i = index; i < pointer; i++) {
            array[i] = array[i+1];
        }
        array[pointer] = null;
        pointer--;
        int cutRate = 4;
        if (array.length > INIT_SIZE && pointer < array.length / cutRate)
            increaseSize(array.length/2);
    }

    /**
     * Полностью очищает коллекцию.
     */
    public void clearArray() {
        array = (T[]) new Object[INIT_SIZE];
        pointer = 0;
    }

    /**
     * Возвращает количество элементов, добавленных в список.
     */
    public int size() {
        return pointer;
    }

    /**
     * Метод для расширения массива. На вход принимает новую его длину.
     */
    private void increaseSize(int newLength) {
        T[] newArray = (T[]) new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    /**
     * Метод возвращает итератор для текущей коллекции.
     */
    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(array);
    }
}
