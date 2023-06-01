/**
 * Класс, реализующий алгоритм quickSort для списков. Имеет один одноименный метод.
 */
public class QuickSort {

    /**
     * Дженерик метод, реализующий алгоритм quickSort. На вход принимает список для сортировки,
     * а также нижний и верхний индексы сортируемого участка списка.
     */
    public static <T extends Comparable<T>> void quickSort(MyList<T> array, int low, int high) {
        if (array.size() == 0 || low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        T pivot = array.get(middle);

        int i = low, j = high;
        T elementI = array.get(i);
        T elementJ = array.get(j);
        while (i <= j) {

            while (elementI.compareTo(pivot) < 0) {
                i++;
                elementI = array.get(i);
            }

            while (elementJ.compareTo(pivot) > 0) {
                j--;
                elementJ = array.get(j);
            }

            if (i <= j) {
                T temp = array.get(i);
                array.update(i, array.get(j));
                array.update(j, temp);
                i++;
                j--;
                elementI = array.get(i);
                elementJ = array.get(j);
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
