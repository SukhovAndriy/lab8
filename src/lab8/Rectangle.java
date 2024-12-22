package lab8;
/**
 * Class representing a rectangle graphic element.
 * Extends the GraphicElement class and adds width and height properties.
 */
public class Rectangle extends GraphicElement {
    private double width;
    private double height;
    /**
     * Constructor for a rectangle.
     * @param color the color of the rectangle.
     * @param x the X-coordinate of the rectangle.
     * @param y the Y-coordinate of the rectangle.
     * @param width the width of the rectangle.
     * @param height the height of the rectangle.
     */
    public Rectangle(String color, int x, int y, double width, double height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }
    // Геттери і Сеттери
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * Creates a deep copy of the rectangle.
     * @return a new Rectangle object with copied properties.
     */
    @Override
    public Rectangle deepClone() {
        return new Rectangle(getColor(), getX(), getY(), width, height);
    }
    @Override
    public String toString() {
        return "Прямокутник{" +
                "ширина=" + width +
                ", висота=" + height +
                ", " + super.toString() +
                '}';
    }
}


