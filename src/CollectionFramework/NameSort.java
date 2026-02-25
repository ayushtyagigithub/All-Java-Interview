package CollectionFramework;

import java.util.Comparator;

public class NameSort implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student)o1).name.compareTo(((Student)o2).name);
    }
}
