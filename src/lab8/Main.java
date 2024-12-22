package lab8;
public class Main {
    public static void main(String[] args) {
        // Оригінальні елементи
        Circle originalCircle = new Circle("Blue", 10, 20, 15.5);
        Rectangle originalRectangle = new Rectangle("Yellow", 30, 40, 50.0, 60.0);

        // Поверхневе копіювання
        Circle shallowClonedCircle = (Circle) originalCircle.shallowClone();
        Rectangle shallowClonedRectangle = (Rectangle) originalRectangle.shallowClone();

        // Глибоке копіювання
        Circle deepClonedCircle = originalCircle.deepClone();
        Rectangle deepClonedRectangle = originalRectangle.deepClone();

        // Виведення результатів
        System.out.println("Оригінальне коло: " + originalCircle);
        System.out.println("Поверхнево скопійоване коло: " + shallowClonedCircle);
        System.out.println("Глибоко скопійоване коло: " + deepClonedCircle);

        System.out.println("Оригінальний прямокутник: " + originalRectangle);
        System.out.println("Поверхнево скопійований прямокутник: " + shallowClonedRectangle);
        System.out.println("Глибоко скопійований прямокутник: " + deepClonedRectangle);
    }
}
