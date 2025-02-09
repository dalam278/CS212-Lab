import java.awt.Color;

public class Triangle extends Shape2D {
    private int width;

    // No-args constructor
    public Triangle() {
        this.width = 1;
        setColor(Color.RED);
    }

    // Parametrized constructor
    public Triangle(int width) {
        setWidth(width);
        setColor(Color.RED);
    }

    // Getter for width
    public int getWidth() {
        return width;
    }

    // Setter for width
    public Triangle setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
        return this;
    }

    // Setter for color with chaining
    @Override
    public Triangle setColor(Color color) {
        super.setColor(color);
        return this;
    }

    // Calculate the area of the triangle
    @Override
    public double area() {
        return (width * width) / 2.0;
    }

    // Calculate the perimeter of the triangle
    @Override
    public double perimeter() {
        return 2 * width + Math.sqrt(2) * width;
    }

    // Draw the triangle using a specified character
    @Override
    public void draw(char ch) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // String representation of Triangle
    @Override
    public String toString() {
        return "Triangle{width=" + width + ", color=" + getColor() + "}";
    }

    // Equality based on width
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return width == triangle.width;
    }

    // Hashcode based on width
    @Override
    public int hashCode() {
        return Integer.hashCode(width);
    }
}

