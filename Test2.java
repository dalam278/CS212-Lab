public class Test2 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(5, 11);
        System.out.println("c1: " + c1);
        System.out.println("c1.getColor(): " + c1.getColor());
        System.out.println("c1.getRadius(): " + c1.getRadius());
        System.out.println("c1.getHeight(): " + c1.getHeight());
        System.out.printf("c1.area(): %.2f\n", c1.area());
        System.out.printf("c1.volume(): %.2f\n", c1.volume());
        c1.draw('*');
        System.out.printf("----------------------------------------\n");

        Cylinder c2 = new Cylinder(3, 4);
        System.out.println("c2: " + c2);
        System.out.println("c2.getColor(): " + c2.getColor());
        System.out.println("c2.getRadius(): " + c2.getRadius());
        System.out.println("c2.getHeight(): " + c2.getHeight());
        System.out.printf("c2.area(): %.2f\n", c2.area());
        System.out.printf("c2.volume(): %.2f\n", c2.volume());
        c2.draw('^');
        System.out.printf("----------------------------------------\n");

        System.out.println("c1.hashCode(): " + c1.hashCode());
        System.out.println("c2.hashCode(): " + c2.hashCode());
        System.out.println("c1.equals(c2)? " + c1.equals(c2));
        System.out.printf("----------------------------------------\n");

        System.out.println("Setting c2's color to BLUE");
        System.out.println("Setting c2's radius to 5");
        System.out.println("Setting c2's height to 11");
        c2.setColor(Color.BLUE).setRadius(5).setHeight(11);

        System.out.println("c2: " + c2);
        System.out.println("c2.getColor(): " + c2.getColor());
        System.out.println("c2.getRadius(): " + c2.getRadius());
        System.out.println("c2.getHeight(): " + c2.getHeight());
        System.out.printf("----------------------------------------\n");

        System.out.println("c1.hashCode(): " + c1.hashCode());
        System.out.println("c2.hashCode(): " + c2.hashCode());
        System.out.println("c1.equals(c2)? " + c1.equals(c2));
        System.out.printf("----------------------------------------\n");


    } //end-main
} //end-Test2
