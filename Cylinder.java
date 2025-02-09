import java.awt.Color;

public class Cylinder extends Shape3D {

    private int radius;
    private int height;

    public Cylinder() {
        radius = 1;
        height = 1;
        setColor(Color.RED);
    }

    public Cylinder(int radius, int height) {
        if (radius <= 0 || height <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
        this.height = height;
        setColor(Color.RED);
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public Cylinder setRadius(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
        return this;
    }

    public Cylinder setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException();
        }
        this.height = height;
        return this;
    }

    public <Black> Cylinder setColor(Black Black) {
        super.setColor(color);
        return this;
    }

    public double area() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public Object setColor(Color color) {
        return null;
    }

    public String toString() {
        return "Cylinder[radius=" + radius + ",height=" + height + ",color="+ getColor() +"]";
    }

    public boolean equals(Object o) {
        if (!(o instanceof Cylinder)) {
            return false;
        }
        Cylinder c = (Cylinder) o;
        return c.radius == radius && c.height == height;
    }

    public int hashCode() {
        return 31*radius + height;
    }

    public void draw(char ch) {
        // draw top half circle
        for (int i=0; i<radius; i++) {
            for (int j=0; j<radius-i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        // draw cylinder body
        for (int i=0; i<height; i++) {
            for (int j=0; j<radius; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        // draw bottom half circle
        for (int i=radius-1; i>=0; i--) {
            for (int j=radius; j>i; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

}
