import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayBag implements Bag {
    private Student[] students;
    private int size;

    // Constructor with capacity
    public ArrayBag(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    // Add a student to the bag
    @Override
    public void add(Student s) {
        if (size >= students.length) throw new BagFullException();
        students[size++] = s;
    }

    // Remove a student from the bag
    @Override
    public void remove(Student s) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(s)) {
                students[i] = students[size - 1]; // Move last element to the removed spot
                students[size - 1] = null; // Nullify last element
                size--;
                return;
            }
        }
    }

    // Check if a student is in the bag
    @Override
    public boolean contains(Student s) {
        for (Student student : students) {
            if (student != null && student.equals(s)) {
                return true;
            }
        }
        return false;
    }

    // Check if the bag is empty
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Get the number of students in the bag
    @Override
    public int size() {
        return size;
    }

    // Clear the bag
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            students[i] = null;
        }
        size = 0;
    }

    // Iterator for the bag
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && students[currentIndex] != null;
            }

            @Override
            public Student next() {
                if (!hasNext()) throw new NoSuchElementException();
                return students[currentIndex++];
            }
        };
    }
}
