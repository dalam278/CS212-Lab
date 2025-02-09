import java.util.TreeMap;

record Foo(int id, String str){}

class TreeMapEx {
    public static void main(String [] args){
        TreeMap<Integer, Foo> container = new TreeMap<>();

        container.put(10, new Foo(10, "John"));
        container.put(5, new Foo(5, "Robert"));
        container.put(40, new Foo(40, "Mike"));
        container.put(12, new Foo(12, "Nasir"));

        // Get all values & print
        // Observe that you get the values sorted in "key" order
        for (Foo foo: container.values())
            System.out.println(foo);
        System.out.println("-------------------------------------");

        int key = 40;
        if (container.containsKey(key))
            System.out.println("TreeMap contains: " + container.get(key));
        else
            System.out.printf("TreeMap does not contain key: %d\n", key);
        System.out.println("-------------------------------------");

        key = 41;
        if (container.containsKey(key))
            System.out.println("TreeMap contains: " + container.get(key));
        else
            System.out.printf("TreeMap does not contain key: %d\n", key);
        System.out.println("-------------------------------------");

        System.out.println("Deleting Foo object with key == 12");
        container.remove(12);

        System.out.println("Here are the remaining foo objects in sorted order");
        for (Foo foo: container.values())
            System.out.println(foo);
        System.out.println("-------------------------------------");
    }
}
