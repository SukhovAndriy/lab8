package lab8;
/**
 * Abstract base class for graphic elements.
 * Implements common properties and methods for cloning.
 */
public abstract class GraphicElement implements CloneableGraphicElement {
    private String color;
    private int x;
    private int y;
    /**
     * Constructor for a graphic element.
     * @param color the color of the element.
     * @param x the X-coordinate of the element.
     * @param y the Y-coordinate of the element.
     */
    public GraphicElement(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    // Геттери Сеттери
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    /**
     * Creates a shallow copy of the graphic element.
     * @return a shallow copy.
     */
    @Override
    public GraphicElement shallowClone() {
        try {
            return (GraphicElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Помилка при поверхневому копіюванні", e);
        }
    }
    /**
     * Abstract method for deep cloning. Must be implemented by subclasses.
     * @return a deep copy of the graphic element.
     */
    @Override
    public abstract GraphicElement deepClone();
    @Override
    public String toString() {
        return "Графічний елемент{" +
                "колір='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

