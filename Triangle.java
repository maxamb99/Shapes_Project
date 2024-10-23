package shapes;

import java.util.Objects;

/**
 * Represents a Triangle shape.
 * Extends AbstractShape and provides implementations for area and name.
 * The base and height are immutable and must be greater than 0.
 *
 * The Triangle class is final and cannot be subclassed.
 *
 * @version Autumn 2024
 * @author Bashir maxamed
 */
public final class Triangle extends AbstractShape {

    /** The base of the triangle. */
    private final int myBase;
    /** The height of the triangle. */
    private final int myHeight;

    /**
     * Constructor that initializes the base and height of the triangle.
     *
     * @param theBase the base of the triangle.
     * @param theHeight the height of the triangle.
     * @throws IllegalArgumentException if the base or height is not greater than 0.
     */
    Triangle(final int theBase, final int theHeight) {
        if (theBase <= 0 || theHeight <= 0) {
            throw new IllegalArgumentException(String.format("The base must be greater than 0. You passed: %d, and the height must be greater than 0. You passed: %d",
                    theBase, theHeight));
        }
        myBase = theBase;
        myHeight = theHeight;
    }

    /**
     * Returns the base of the triangle.
     *
     * @return the base of the triangle.
     */
    public int getBase() {
        return myBase;
    }

    /**
     * Returns the height of the triangle.
     *
     * @return the height of the triangle.
     */
    public int getHeight() {
        return myHeight;
    }

    /**
     * Calculates and returns the area of the triangle.
     *
     * @return the area of the triangle.
     */
    @Override
    public double area() {
        return 0.5 * myBase * myHeight;
    }

    /**
     * Returns the name of the shape, which is "Triangle".
     *
     * @return the name of the shape.
     */
    @Override
    public String name() {
        return "Triangle";
    }

    /**
     * Returns the hash code for the triangle, based on the base and height.
     *
     * @return the hash code for the triangle.
     */
    @Override
    public int hashCode() {
        return Objects.hash(myBase, myHeight);
    }
}
