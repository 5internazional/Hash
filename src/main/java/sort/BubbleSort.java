package sort;

import compare.Comparator;
import data.Students;

public class BubbleSort<T> extends Swapper<T> implements Sortable<T> {

    @Override
    public void sort(Students[] students, Comparator<T> comparator) {
        for (int i = 1; i < students.length; i++) {
            for (int e = 0; e < students.length - i; e++ ) {
                if (comparator.compare(students[e], students[e + 1]) > 0) {
                    swap(students, e, e + 1);
                }
            }
        }
    }

}