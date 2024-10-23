package shapes;

/**
 * An abstract class that represents a shape.
 * Provides methods to calculate the area and retrieve the shape's name.
 * Implements the Comparable interface to allow comparison between shapes.
 *
 * @version Autumn 2024
 * @author Bashir maxamed
 */
public abstract class AbstractShape implements Comparable<AbstractShape> {

    /**
     * Returns the area of the shape.
     *
     * @return the area of the shape.
     */
    public abstract double area();

    /**
     * Returns the name of the shape.
     *
     * @return the name of the shape.
     */
    public abstract String name();

    /**
     * Generates the hash code for the shape based on its fields.
     *
     * @return the hash code for the shape.
     */
    public abstract int hashCode();

    /**
     * Returns a string representation of the shape.
     * Includes the name of the shape and its area, formatted to 2 decimal places.
     *
     * @return a string containing the name of the shape and its area.
     */
    @Override
    public String toString() {
        return String.format("Name: %s, Area: %.2f", name(), area());
    }

    /**
     * Compares this shape to another shape. First compares by name,
     * and if the names are the same, compares by area.
     *
     * @param theOtherShape the shape to be compared.
     * @return 0 if the shapes are equal, a negative number if this shape
     *         is less than theOtherShape, or a positive number if this shape
     *         is greater than theOtherShape.
     */
    @Override
    public int compareTo(final AbstractShape theOtherShape) {
        final int value;

        if (!theOtherShape.getClass().getSimpleName().equals(name())) {
            value = name().compareTo(theOtherShape.name());
        } else {
            value = Double.compare(theOtherShape.area(), area());
        }
        return value;
    }

    /**
     * Determines if this shape is equal to another object.
     * Two shapes are considered equal if they are of the same type
     * and have the same area.
     *
     * @param theOtherObject the object to compare to this shape.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(final Object theOtherObject) {
        if (theOtherObject == null || getClass() != theOtherObject.getClass()) {
            return false;
        }
        return compareTo((AbstractShape) theOtherObject) == 0;
    }
}
