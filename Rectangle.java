package shapes;

import java.util.Objects;

/**
 * Represents a Rectangle shape.
 * Extends AbstractShape and provides implementations for area and name.
 * The length and width are immutable and must be greater than 0.
 *
 * The Rectangle class is final and cannot be subclassed.
 *
 * @version Autumn 2024
 * @author Bashir maxamed
 */
public final class Rectangle extends AbstractShape {

    /** The length of the rectangle. */
    private final int myLength;
    /** The width of the rectangle. */
    private final int myWidth;

    /**
     * Constructor that initializes the length and width of the rectangle.
     *
     * @param theLength the length of the rectangle.
     * @param theWidth the width of the rectangle.
     * @throws IllegalArgumentException if the length or width is not greater than 0.
     */
    Rectangle(final int theLength, final int theWidth) {
        if (theLength <= 0 || theWidth <= 0) {
            throw new IllegalArgumentException(String.format("The length must be greater than 0. You passed: %d, and the width must be greater than 0. You passed: %d",
                    theLength, theWidth));
        }
        myLength = theLength;
        myWidth = theWidth;
    }

    /**
     * Returns the length of the rectangle.
     *
     * @return the length of the rectangle.
     */
    public int getLength() {
        return myLength;
    }

    /**
     * Returns the width of the rectangle.
     *
     * @return the width of the rectangle.
     */
    public int getWidth() {
        return myWidth;
    }

    /**
     * Calculates and returns the area of the rectangle.
     *
     * @return the area of the rectangle.
     */
    @Override
    public double area() {
        return myLength * myWidth;
    }

    /**
     * Returns the name of the shape, which is "Rectangle".
     *
     * @return the name of the shape.
     */
    @Override
    public String name() {
        return "Rectangle";
    }

    /**
     * Returns the hash code for the rectangle, based on the length and width.
     *
     * @return the hash code for the rectangle.
     */
    @Override
    public int hashCode() {
        return Objects.hash(myLength, myWidth);
    }
}
