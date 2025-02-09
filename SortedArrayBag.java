import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortedArrayBag implements SortedBag {
    private final static int DEFAULT_CAPACITY = 4;
    private Student[] elements;
    private Comparator<Student> comparator;
    private int size;

    public SortedArrayBag() {
        this(DEFAULT_CAPACITY, null);
    }

    public SortedArrayBag(Comparator<Student> comparator) {
        this(DEFAULT_CAPACITY, comparator);
    }

    public SortedArrayBag(int initialCapacity) {
        this(initialCapacity, null);
    }

    public SortedArrayBag(int initialCapacity, Comparator<Student> comparator) {
        if (initialCapacity < DEFAULT_CAPACITY) {
            initialCapacity = DEFAULT_CAPACITY;
        }
        elements = new Student[initialCapacity];
        size = 0;
        this.comparator = comparator;
    }

    @Override
    public void add(Student s) {
        if (size == elements.length) {
            throw new BagFullException();
        }

        int index = getInsertionIndex(s);
        makeRoomAt(index);
        elements[index] = s;
        size++;
    }

    private int getInsertionIndex(Student s) {
        if (isEmpty()) {
            return 0;
        }

        int low = 0;
        int high = size - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if(greaterThan(elements[mid], s)) {
                high = mid - 1;
            }else if(lessThan(s, elements[mid])) {
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return low;
    }

    private void makeRoomAt(int index) {
        int newIndex = index;
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
            newIndex = i + 1;
        }
        elements[newIndex] = null;
    }

    private boolean greaterThan(Student s1, Student s2) {
        if(comparator != null) {
            return comparator.compare(s1, s2) > 0;
        }else {
            return s1.compareTo(s2) > 0;
        }
    }

    private boolean lessThan(Student s1, Student s2) {
        if(comparator != null) {
            return comparator.compare(s1, s2) < 0;
        }else {
            return s1.compareTo(s2) < 0;
        }
    }

    @Override
    public Student first() {
        if (isEmpty()) {
            return null;
        }
        return elements[0];
    }

    @Override
    public Student last() {
        if (isEmpty()) {
            return null;
        }
        return elements[size - 1];
    }

    @Override
    public Student lower(Student s) {
        int index = getLowerIndex(s);
        if(index == -1) {
            return null;
        }
        return elements[index];
    }

    private int getLowerIndex(Student s) {
        int low = 0;
        int high = size - 1;
        int mid = 0;

        while(low <= high) {
            mid = (low + high) / 2;
            if(lessThan(elements[mid], s)) {
                low = mid + 1;
            }else {
                if(mid == 0) {
                    return -1;
                }
                if(greaterThan(elements[mid-1], s)) {
                    return mid-1;
                }
                high = mid - 1;
            }
        }
        return -1;
    }

    @Override
    public Student higher(Student s) {
        int index = getHigherIndex(s);
        if(index == -1) {
            return null;
        }
        return elements[index];
    }

    private int getHigherIndex(Student s) {
        int low = 0;
        int high = size - 1;
        int mid = 0;

        while(low <= high) {
            mid = (low + high) / 2;
            if(greaterThan(elements[mid], s)) {
                high = mid - 1;
            } else {
                if (mid == size - 1) {
                    return -1;
                }
                if(lessThan(elements[mid+1], s)) {
                    return mid+1;
                }
                low = mid + 1;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Student s) {
        return getInsertionIndex(s) < size
                && elements[getInsertionIndex(s)].equals(s);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public void remove(Student s) {
        int index = getInsertionIndex(s);
        if (index == size || !elements[index].equals(s)) {
            return;
        }

        makeRoomAt(index);
        size--;
    }

    @Override
    public Iterator<Student> iterator() {
        List<Student> copy = new ArrayList<>();
        for(int i=0; i<size; i++) {
            copy.add(elements[i]);
        }
        return copy.iterator();
    }

}