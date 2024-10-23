package shapes;

import java.util.Objects;

/**
 * Represents a Square shape.
 * Extends AbstractShape and provides implementations for area and name.
 * The side length is immutable and must be greater than 0.
 *
 * The Square class is final and cannot be subclassed.
 *
 * @version Autumn 2024
 * @author Bashir maxamed
 */
public final class Square extends AbstractShape {

    /** The side length of the square. */
    private final int myLength;

    /**
     * Constructor that initializes the side length of the square.
     *
     * @param theLength the side length of the square.
     * @throws IllegalArgumentException if the side length is not greater than 0.
     */
    Square(final int theLength) {
        if (theLength <= 0) {
            throw new IllegalArgumentException("The length must be greater than 0. You passed: " + theLength);
        }
        myLength = theLength;
    }

    /**
     * Returns the side length of the square.
     *
     * @return the side length of the square.
     */
    public int getLength() {
        return myLength;
    }

    /**
     * Calculates and returns the area of the square.
     *
     * @return the area of the square.
     */
    @Override
    public double area() {
        return Math.pow(myLength, 2);
    }

    /**
     * Returns the name of the shape, which is "Square".
     *
     * @return the name of the shape.
     */
    @Override
    public String name() {
        return "Square";
    }

    /**
     * Returns the hash code for the square, based on the side length.
     *
     * @return the hash code for the square.
     */
    @Override
    public int hashCode() {
        return Objects.hash(myLength);
    }
}
