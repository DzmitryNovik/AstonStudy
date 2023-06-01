import java.util.Iterator;

/**
 * Классическая реализация итератора для своей коллекции.
 * @param <T>
 */
public class MyIterator<T> implements Iterator<T> {

    private int index;
    private T[] array;

    /**
     * Конструктор итератора. Принимает на вход массив, с которым будет работать.
     * @param array
     */
    public MyIterator(T[] array) {
        this.array = array;
    }

    /**
     * Метод проверяет, есть ли в коллекции следующий элемент и возвращает соответствующее
     * булево значение.
     * @return
     */
    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    /**
     * Возвращает текущий элемент массива.
     * @return
     */
    @Override
    public T next() {
        return array[index++];
    }
}
