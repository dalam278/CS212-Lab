public class Test1 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(5);
        System.out.println("t1: " + t1);
        System.out.println("t1.getColor(): " + t1.getColor());
        System.out.println("t1.getWidth(): " + t1.getColor());
        System.out.printf("t1.area(): %.2f\n", t1.area());
        System.out.printf("t1.perimeter(): %.2f\n", t1.perimeter());
        t1.draw('*');
        System.out.printf("----------------------------------------\n");

        Triangle t2 = new Triangle(9);
        System.out.println("t2: " + t2);
        System.out.println("t2.getColor(): " + t2.getColor());
        System.out.println("t2.getWidth(): " + t2.getColor());
        System.out.printf("t2.area(): %.2f\n", t2.area());
        System.out.printf("t2.perimeter(): %.2f\n", t2.perimeter());
        t2.draw('^');
        System.out.printf("----------------------------------------\n");

        System.out.println("t1.hashCode(): " + t1.hashCode());
        System.out.println("t2.hashCode(): " + t2.hashCode());
        System.out.println("t1.equals(t2)? " + t1.equals(t2));
        System.out.printf("----------------------------------------\n");

        System.out.println("Setting t2's color to BLUE");
        System.out.println("Setting t2's width to 5");
        t2.setColor(Color.BLACK).setWidth(5);

        System.out.println("t2: " + t2);
        System.out.println("t2.getColor(): " + t2.getColor());
        System.out.println("t2.getWidth(): " + t2.getColor());
        System.out.printf("----------------------------------------\n");

        System.out.println("t1.hashCode(): " + t1.hashCode());
        System.out.println("t2.hashCode(): " + t2.hashCode());
        System.out.println("t1.equals(t2)? " + t1.equals(t2));
        System.out.printf("----------------------------------------\n");


    } //end-main
} //end-Test2