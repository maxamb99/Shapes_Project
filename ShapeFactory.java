package shapes;

/**
 * A factory class for creating various shapes such as Circle, Square, Triangle, and Rectangle.
 * Provides static methods to create instances of these shapes.
 *
 * This class cannot be instantiated.
 *
 * @version Autumn 2024
 * @author Bashir maxamed
 */
public class ShapeFactory {

    /**
     * Creates a new Circle with the specified radius.
     *
     * @param theRadius the radius of the circle.
     * @return a new Circle object.
     */
    public static Circle circle(final int theRadius) {
        return new Circle(theRadius);
    }

    /**
     * Creates a new Square with the specified side length.
     *
     * @param theLength the side length of the square.
     * @return a new Square object.
     */
    public static Square square(final int theLength) {
        return new Square(theLength);
    }

    /**
     * Creates a new Triangle with the specified base and height.
     *
     * @param theBase the base of the triangle.
     * @param theHeight the height of the triangle.
     * @return a new Triangle object.
     */
    public static Triangle triangle(final int theBase, final int theHeight) {
        return new Triangle(theBase, theHeight);
    }

    /**
     * Creates a new Rectangle with the specified length and width.
     *
     * @param theLength the length of the rectangle.
     * @param theWidth the width of the rectangle.
     * @return a new Rectangle object.
     */
    public static Rectangle rectangle(final int theLength, final int theWidth) {
        return new Rectangle(theLength, theWidth);
    }
}
