public class Test3 {
    public static void main(String[] args) {
        Sphere s1 = new Sphere(5);
        System.out.println("s1: " + s1);
        System.out.println("s1.getColor(): " + s1.getColor());
        System.out.println("s1.getRadius(): " + s1.getRadius());
        System.out.printf("s1.area(): %.2f\n", s1.area());
        System.out.printf("s1.volume(): %.2f\n", s1.volume());
        s1.draw('*');
        System.out.printf("----------------------------------------\n");

        Sphere s2 = new Sphere(9);
        System.out.println("s2: " + s2);
        System.out.println("s2.getColor(): " + s2.getColor());
        System.out.println("s2.getRadius(): " + s2.getRadius());
        System.out.printf("s2.area(): %.2f\n", s2.area());
        System.out.printf("s2.volume(): %.2f\n", s2.volume());
        s2.draw('^');
        System.out.printf("----------------------------------------\n");

        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode());
        System.out.println("s1.equals(s2)? " + s1.equals(s2));
        System.out.printf("----------------------------------------\n");

        System.out.println("Setting s2's color to BLUE");
        System.out.println("Setting s2's radius to 5");
        System.out.println("Setting s2's height to 11");
        s2.setColor(Color.BLACK).setRadius(5);

        System.out.println("s2: " + s2);
        System.out.println("s2.getColor(): " + s2.getColor());
        System.out.println("s2.getRadius(): " + s2.getRadius());
        System.out.printf("----------------------------------------\n");

        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode());
        System.out.println("s1.equals(s2)? " + s1.equals(s2));
        System.out.printf("----------------------------------------\n");
    } //end-main
} //end-Test2