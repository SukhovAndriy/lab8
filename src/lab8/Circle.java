package lab8;
/**
 * Class representing a circle graphic element.
 * Extends the GraphicElement class and adds radius property.
 */
public class Circle extends GraphicElement {
    private double radius;
    /**
     * Constructor for a circle.
     * @param color the color of the circle.
     * @param x the X-coordinate of the circle.
     * @param y the Y-coordinate of the circle.
     * @param radius the radius of the circle.
     */
    public Circle(String color, int x, int y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }
    // Геттери Сеттери
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * Creates a deep copy of the circle.
     * @return a new Circle object with copied properties.
     */
    @Override
    public Circle deepClone() {
        return new Circle(getColor(), getX(), getY(), radius);
    }
    @Override
    public String toString() {
        return "Коло{" +
                "радіус=" + radius +
                ", " + super.toString() +
                '}';
    }
}

