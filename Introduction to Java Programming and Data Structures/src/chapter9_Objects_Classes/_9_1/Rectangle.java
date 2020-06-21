package chapter9_Objects_Classes._9_1;

/**
 * Created by ag on 16-May-20 12:36 AM
 */
class Rectangle {
    private double width;
    private double height;

    // no-arg constructor that creates a default rectangle
    Rectangle() {
        width = 1;
        height = 1;
    }

    // constructor that creates a rectangle with the specified width and height
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0)
            throw new IllegalArgumentException("Error: rectangle can't have negative values for width and height");

        this.width = width;
        this.height = height;
    }

    double getArea() {
        return height * width;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }
}
