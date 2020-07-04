package sort;

import compare.Comparator;
import data.Students;

public class SelectionSort<T> extends Swapper<T> implements Sortable<T>  {

    @Override
    public void sort(Students[] students, Comparator<T> comparator) {
        int minimun;
        for (int i = 0; i < students.length; i++) {
            minimun = i;
            for (int e = i + 1; e < students.length; e++) {
                if (comparator.compare(students[e], students[minimun]) < 0) {
                    minimun = e;
                }
            }
            swap(students, i, minimun);
        }
    }
}