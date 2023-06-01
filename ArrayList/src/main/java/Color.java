import java.util.Objects;

/**
 * Класс, описывающий сущность "Цвет". Хранит в себе название цвета. Имплементирует
 * интерфейс Comparable для возможности сравнения цветов по названию. Сравнение происходит
 * по возрастанию в алфавитном порядке. Класс также содержит конструктор без аргументов, с
 * аргументами, геттер и сеттер названия цвета и переопределенные меторы hashCode,
 * equals, toString, compareTo.
 */
public class Color implements Comparable<Color>{

    private String name;

    /**
     * Конструктор без аргументов. Вызывается для создания экземпляра класса, не устанавливая значения поля name.
     */
    public Color() {
    }

    /**
     * Конструктор с аргументом. Вызывается для создания экземпляра класса, и устанавливает значение поля name.
     */
    public Color(String name) {
        this.name = name;
    }

    /**
     * Медод, возвращающий значение поля name.
     */
    public String getName() {
        return name;
    }

    /**
     * Медод, устанавливающий значение поля name. На вход принимает строку.
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return Objects.equals(name, color.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Color o) {
        return this.name.compareTo(o.getName());
    }
}
