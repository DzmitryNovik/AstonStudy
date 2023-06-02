import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    MyList<Color> list = new MyArrayList();
    Color color0 = new Color("Зеленый");
    Color color1 = new Color("Красный");
    Color color2 = new Color("Белый");
    Color color3 = new Color("Желтый");
    Color color4 = new Color("Фиолетовый");

    @Test
    public void get() {
        list = new MyArrayList();
        add();
        assertEquals(list.get(0), color0);
        assertEquals(list.get(1), color1);
        assertEquals(list.get(2), color2);
    }

    @Test
    public void add() {
        list = new MyArrayList();
        list.add(color0);
        list.add(color1);
        list.add(color2);
        assertEquals(list.get(0), color0);
        assertEquals(list.get(1), color1);
        assertEquals(list.get(2), color2);
        assertEquals(3, list.size());
    }

    @Test
    public void testAdd() {
        add();
        list.add(0, color3);
        assertEquals(list.get(0), color3);
        assertEquals(list.get(1), color0);
        assertEquals(list.get(2), color1);
    }

    @Test
    public void update() {
        add();
        list.update(0, color4);
        assertEquals(color4, list.get(0));
    }

    @Test
    public void delete() {
        add();
        list.delete(0);
        assertEquals(color1, list.get(0));
    }

    @Test
    public void size() {
        add();
        assertEquals(3, list.size());
    }

    @Test
    public void increaseSize() {
        MyList<String> list = new MyArrayList<>();
        for (int i = 0; i < 19; i++) {
            list.add("Строка");
        }
        assertEquals(19, list.size());
    }

    @Test
    public void iterator() {
        assertEquals(MyIterator.class, list.iterator().getClass());
    }

    @Test
    public void clearArray() {
        add();
        list.clearArray();
        for (int i = 0; i < 10; i++) {
            assertNull(list.get(i));
        }
    }
}