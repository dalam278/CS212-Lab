import java.awt.Color;

public abstract class Shape {
    private Color color;

    public Shape() {
        this.color = Color.BLACK;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();

    public abstract void draw(char c);
}

