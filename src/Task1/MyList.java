package Task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number>{
    private List<T> arrayList = new ArrayList<T>();
    public void add(T item) {
        arrayList.add(item);
    }
    @Override
    public String toString() {
        return arrayList.toString();
    }
    public Integer largest() {

        Integer max = (Integer) arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if ((Integer) arrayList.get(i) > max) {
                max = (Integer) arrayList.get(i);
            }
        }
        return max;
    }
    public Integer smallest() {

        Integer min = (Integer) arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if ((Integer) arrayList.get(i) < min) {
                min = (Integer) arrayList.get(i);
            }
        }
        return min;
    }
    public int getSize() {
        return arrayList.size();
    }
}
