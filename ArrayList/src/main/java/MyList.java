/**
 * Параметризованный интерфейс, описывающий контракт для реализации коллекции.
 * @param <T>
 */
public interface MyList<T> extends Iterable<T>{

    void add(T t);

    void add(int index, T element);

    void update(int index, T element);

    T get(int index);

    void delete(int index);

    void clearArray();

    int size();
}
