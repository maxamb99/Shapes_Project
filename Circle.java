package shapes;

import java.util.Objects;

/**
 * Represents a Circle shape.
 * Extends AbstractShape and provides implementations for area and name.
 * The radius is immutable and must be greater than 0.
 *
 * The Circle class is final and cannot be subclassed.
 *
 * @version Autumn 2024
 * @author Bashir maxamed
 */
public final class Circle extends AbstractShape {

    /** The radius of the circle. */
    private final double myRadius;

    /**
     * Constructor that initializes the radius of the circle.
     *
     * @param theRadius the radius of the circle.
     * @throws IllegalArgumentException if the radius is not greater than 0.
     */
    Circle(final double theRadius) {
        if (theRadius <= 0) {
            throw new IllegalArgumentException("The radius must be greater than 0. You passed: " + theRadius);
        }
        myRadius = theRadius;
    }

    /**
     * Returns the radius of the circle.
     *
     * @return the radius of the circle.
     */
    public double getRadius() {
        return myRadius;
    }

    /**
     * Calculates and returns the area of the circle.
     *
     * @return the area of the circle.
     */
    @Override
    public double area() {
        return Math.PI * Math.pow(myRadius, 2);
    }

    /**
     * Returns the name of the shape, which is "Circle".
     *
     * @return the name of the shape.
     */
    @Override
    public String name() {
        return "Circle";
    }

    /**
     * Returns the hash code for the circle, based on the radius.
     *
     * @return the hash code for the circle.
     */
    @Override
    public int hashCode() {
        return Objects.hash(myRadius);
    }
}
