import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    MyList<Color> list = new MyArrayList();

    @Before
    public void setUp() {
        list.add(new Color("Зеленый"));
        list.add(new Color("Красный"));
        list.add(new Color("Белый"));
        list.add(new Color("Желтый"));
        list.add(new Color("Фиолетовый"));
        list.add(new Color("Черный"));
        list.add(new Color("Бирюзовый"));
        list.add(new Color("Коричневый"));
        list.add(new Color("Серый"));
    }

    @Test
    public void quickSort() {
        QuickSort.quickSort(list, 0, 8);
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            Color color = (Color) list.get(i);
            builder.append(color.getName());
            builder.append(" ");
        }

        String expectedResult = "Белый Бирюзовый Желтый Зеленый Коричневый Красный Серый Фиолетовый ";
        assertEquals(expectedResult, builder.toString());
    }
}