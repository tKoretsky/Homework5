package Task2;

import java.util.ArrayList;
import java.util.List;

public class MyList <T extends Comparable<T>> {

    List<T> arraylist = new ArrayList<>();

    public void add(T item) {
        arraylist.add(item);
    }

    public T max() {
        T max = arraylist.get(0);
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).compareTo(max) > 0) {
                max = arraylist.get(i);
            }
        }
        return max;
    }

    public T min() {
        T min = arraylist.get(0);
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).compareTo(min) < 0) {
                min = arraylist.get(i);
            }
        }
        return min;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "arraylist=" + arraylist +
                '}';
    }
}
