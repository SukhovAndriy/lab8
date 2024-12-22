package lab8;
/**
 * Interface for cloneable graphic elements.
 * Provides methods for shallow and deep cloning.
 */
public interface CloneableGraphicElement extends Cloneable {
    /**
     * Creates a shallow copy of the graphic element.
     * @return a shallow copy of the element.
     */
    CloneableGraphicElement shallowClone();

    /**
     * Creates a deep copy of the graphic element.
     * @return a deep copy of the element.
     */
    CloneableGraphicElement deepClone();
}


