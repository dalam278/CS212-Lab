import java.awt.Color;

public class Sphere extends Shape3D {

    private int radius;

    public Sphere() {
        radius = 1;
        setColor(Color.RED);
    }

    public Sphere(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
        setColor(Color.RED);
    }

    public int getRadius() {
        return radius;
    }

    public Sphere setRadius(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
        return this;
    }

    public Sphere setColor(Color color) {
        super.setColor(color);
        return this;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return (4/3.0) * Math.PI * radius * radius * radius;
    }

    public String toString() {
        return "Sphere[radius=" + radius + ",color=" + getColor() + "]";
    }

    public boolean equals(Object o) {
        if (!(o instanceof Sphere)) {
            return false;
        }
        Sphere s = (Sphere) o;
        return s.radius == radius;
    }

    public int hashCode() {
        return radius;
    }

    public void draw(char ch) {
        for (int i=0; i<radius; i++) {
            for (int j=0; j<radius-i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }


    }
