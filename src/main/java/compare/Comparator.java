package compare;

import data.Students;

public interface Comparator<T> {
    int compare(Students o1, Students o2);

}