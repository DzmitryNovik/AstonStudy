/**
 * Вспомогательный класс, предназначенный для наглядной проверки работоспобности программы.
 */
public class Main {

    /**
     * Входная точка программы.
     * @param args
     */
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        String color1 = "Зеленый";
        list.add(0, color1);
        String color2 = "Красный";
        list.add(color2);

        list.forEach(System.out::println);

        System.out.println("\n");

        list.add(0, "Желтый");
        list.forEach(System.out::println);

        System.out.println("\n");

        list.delete(1);
        list.forEach(System.out::println);

        System.out.println("\n");

        list.clearArray();
        list.forEach(System.out::println);

    }
}
